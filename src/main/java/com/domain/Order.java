package com.domain;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
public class Order implements Serializable {

    private static final long serialVersionUID = 1015649225;
    private Integer id;
    private String  name;
    private Double  totalPrice;
    private Integer userId;
    private Integer deleted = 0;
    private Date    date;
    
    /**
     * 拓展字段
     */
    private List<File> files;
    
    private List<OrderItem> items;
    
    
    
	public List<OrderItem> getItems() {
		return items;
	}
	public void setItems(List<OrderItem> items) {
		this.items = items;
	}
	public List<File> getFiles() {
		return files;
	}
	public void setFiles(List<File> files) {
		this.files = files;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getDeleted() {
		return deleted;
	}
	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", totalPrice=" + totalPrice + ", userId=" + userId + ", deleted="
				+ deleted + ", date=" + date + "]";
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
}
