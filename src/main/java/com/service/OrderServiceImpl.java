package com.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import com.dao.CodeMessageDao;
import com.dao.FileDao;
import com.dao.OrderDao;
import com.dao.OrderItemDao;
import com.domain.File;
import com.domain.Order;
import com.domain.OrderItem;
import com.util.MyException;
import com.util.Paging;


@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private CodeMessageDao codeMessageDao;
	
	@Autowired
	private OrderDao orderDao;
	
	@Autowired
	private FileDao fileDao;
	
	@Autowired
	private OrderItemDao orderItemDao;
	
	@Override
	public Order findOrderById(Integer id) {
		if (id == null ) {
			throw new MyException(codeMessageDao.findById(100));
		}
		Order order = orderDao.findById(id);
		if (!ObjectUtils.isEmpty(order)) {
			List<File> files = fileDao.findFileBySourceAndSourceId(1, order.getId());
			order.setFiles(files);
			
			List<OrderItem> orderItems = orderItemDao.findItemsByOrderId(order.getId());
			order.setItems(orderItems);
		}
		return order;
	}

	@Override
	public Paging<Order> orderList(Paging paging) {
		return orderDao.orderList(paging);
	}

	@Override
	public void deleteOrderById(Integer id) {
		orderDao.deleteById(id);
		orderItemDao.deleteByOrderId(id);
		
	}

	@Override
	public void updateOrder(Order order) {
		orderDao.update(order);
		
		if (!CollectionUtils.isEmpty(order.getFiles())) {
			List<Integer> dbIds = fileDao.findFileIdBySourceAndSourceId(1, order.getId());
			List<Integer> formIds = new ArrayList<>();
			List<Integer> deleteIds = new ArrayList<>();
			List<File> insertFiles = new ArrayList<>();
			List<File> updateFiles = new ArrayList<>();
			//表单上传过来的数据集筛选出要更新的和要插入的
			for(File file: order.getFiles()) {
				file.setSource(1);
				file.setSourceId(order.getId());
				if (null == file.getId()) {
					insertFiles.add(file);
				}else {
					formIds.add(file.getId());
					updateFiles.add(file);
				}
			}
			//得出表单上没有数据库里有的id
			deleteIds = getDifferentIds(dbIds, formIds);
			if (!CollectionUtils.isEmpty(deleteIds)) {
				fileDao.deleteById(deleteIds);
			}
			if (!CollectionUtils.isEmpty(insertFiles)) {
				fileDao.insert(insertFiles);
			}
			if (!CollectionUtils.isEmpty(updateFiles)) {
				fileDao.update(updateFiles);
			}
		}
		
	}

	@Override
	public void insert(Order order) {
		Integer orderId = orderDao.insertAndReturnId(order);
		if (!CollectionUtils.isEmpty(order.getFiles())) {
			order.getFiles().stream().forEach(
					file1->{
						file1.setSource(1);
						file1.setSourceId(orderId);
					});
			fileDao.insert(order.getFiles());
		}
		
		
	}

	@Override
	public void deleteOrdersByIds(List<Integer> ids) {
		ids.stream().forEach(id->{
			fileDao.deleteFileBySourceAndSourceId(1, id);
		});
		orderDao.deleteById(ids);
		
	}
	
	/**
	 * 从dbids中找出formids中没有的集合
	 * @param dbIds
	 * @param formIds
	 * @return
	 */
	List<Integer> getDifferentIds(List<Integer> dbIds,List<Integer> formIds){
		List<Integer> deleteIds = new ArrayList<>();
		dbIds.stream().filter(id->!formIds.contains(id)).forEach(id->{deleteIds.add(id);});
		return deleteIds;
	}
	
	
}
