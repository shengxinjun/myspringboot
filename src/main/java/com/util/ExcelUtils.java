package com.util;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.apache.commons.collections.CollectionUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.util.StringUtils;
 
 
/**
 * 
 * office excel工具类
 * 
 *
 */
public final class ExcelUtils {
	
	private static final SimpleDateFormat DATE_FORAMT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	/**
	 * 
	 * 导出最精简的excel
	 * 
	 * @param headers (不是必填) excel头列 比如: 姓名  年龄  性别 ..
	 * @param datas (必填) 数据列(请确保和列的顺序保持一致)
	 * @param fileName 生成excel的文件名称，如果不传则默认为随机生成
	 * @param request HttpServletRequest
	 * @param response HttpServletResponse
	 * @throws IOException  
	 */
	public static void generateCreateExcel(List<String> headers, List<List<Object>> datas, String fileName,
			HttpServletRequest request, HttpServletResponse response) throws IOException {
		Workbook workbook = generateCreateExcel(headers, datas);
		
		// 文件名处理一下
		fileName = (StringUtils.isEmpty(fileName) ? UUID.randomUUID().toString() : fileName) + "."
				+"xlsx";
		String userAgent = request.getHeader("User-Agent");
        if (userAgent.toUpperCase().contains("MSIE") || userAgent.toUpperCase().contains("RV:11")) {
            fileName = URLEncoder.encode(fileName, StandardCharsets.UTF_8.displayName());
        }
        else {
            fileName = new String(fileName.getBytes(StandardCharsets.UTF_8), StandardCharsets.ISO_8859_1);
        }
        
		response.reset(); // 清空response
		response.setContentType("application/x-msdownload");
		response.setHeader("Connection", "close"); // 表示不能用浏览器直接打开
		response.setHeader("content-disposition", "attachment;filename=" + fileName);
		response.setCharacterEncoding("UTF-8");
		
        // 文件流输出
		try {
			workbook.write(response.getOutputStream());
		}
		catch (IOException e) {
			throw new IOException("could not write to response. cause: ", e);
		}
		/*finally {
			if (workbook != null)
				workbook.close();
		}*/
	}
	
	/**
	 * 生成一个workbook
	 * 
	 * @param headers (不是必填) excel头列 比如: 姓名  年龄  性别 ..
	 * @param datas(必填) 数据列(请确保和列的顺序保持一致)
	 * @return
	 */
	public static Workbook generateCreateExcel(List<String> headers, List<List<Object>> datas) {
		
		XSSFWorkbook book = null;
		
		// 如果内容为空则直接返回一个空的book
		if (CollectionUtils.isEmpty(datas)) {
			return book;
		}
		
		// 先创建一发book,并建一个sheet
		book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet();
		
		// 设置自适应列宽
		List<Integer> maxCalls = getMaxCall(headers, datas);
		for (int i = 0, j = maxCalls.size(); i < j; i++) {
			// 最大列宽设置
			if (maxCalls.get(i) > 30) {
				sheet.setColumnWidth(i, 30 * 256);
			} else {
				sheet.setColumnWidth(i, maxCalls.get(i) * 256);
			}
		}
		
		// 是否有头，如果有则先把表头建好
		if (CollectionUtils.isNotEmpty(headers)) {
			// 创建第一行，表头行
			XSSFRow titleRow = sheet.createRow(0);
			
			XSSFCell titleCell = null;
			XSSFRichTextString titleText = null;
			// 把表头放到第一个行里面
			for (int i = 0; i < headers.size(); i++) {
				// 有几个列头 就在一行中创建多少个单元格
				titleCell = titleRow.createCell(i);
				
				// 给创建的单元格里面设值
				titleText = new XSSFRichTextString(headers.get(i));
				titleCell.setCellValue(titleText);
			}
		}
		
		// 处理内容
		if (CollectionUtils.isNotEmpty(datas)) {
			
			// 如果有列表头则row重1开始。否则重0开始
			int dataRowIdx = CollectionUtils.isNotEmpty(headers) ? 1 : 0;
			
			XSSFRow dataRow = null; 
			XSSFCell dataCell = null;
			List<Object> dataList = null;
			
			// 开始处理行和单元格
			for (int i = 0; i < datas.size(); i++) {
				
				// 创建内容的行
				dataRow = sheet.createRow(i + dataRowIdx);
				
				dataList = datas.get(i);
				// 将内容放到对应的行中
				for (int j = 0; j < dataList.size(); j++) {
					// 有多少个内容就有多少个单元格
					dataCell = dataRow.createCell(j);
					
					// 设值单元格的值
					setValue(dataCell, dataList.get(j));
				}
			}
		}
		
		return book;
	}
	public static String getCellValue(Cell cell){  
        String cellValue = "";  
        if(cell == null){  
            return cellValue;  
        }  
        //把数字当成String来读，避免出现1读成1.0的情况  
        if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC){  
            cell.setCellType(Cell.CELL_TYPE_STRING);  
        }  
        //判断数据的类型  
        switch (cell.getCellType()){  
            case Cell.CELL_TYPE_NUMERIC: //数字  
                cellValue = String.valueOf(cell.getNumericCellValue());  
                break;  
            case Cell.CELL_TYPE_STRING: //字符串  
                cellValue = String.valueOf(cell.getStringCellValue());  
                break;  
            case Cell.CELL_TYPE_BOOLEAN: //Boolean  
                cellValue = String.valueOf(cell.getBooleanCellValue());  
                break;  
            case Cell.CELL_TYPE_FORMULA: //公式  
                cellValue = String.valueOf(cell.getCellFormula());  
                break;  
            case Cell.CELL_TYPE_BLANK: //空值   
                cellValue = "";  
                break;  
            case Cell.CELL_TYPE_ERROR: //故障  
                cellValue = "非法字符";  
                break;  
            default:  
                cellValue = "未知类型";  
                break;  
        }  
        return cellValue;  
    }
	private static void setValue(Cell cell, Object value) {
		
		// 如果是null 则设值为空
		if (Objects.isNull(value)) {
			cell.setCellValue("");
		}
		else if (value.getClass() == String.class) {
			cell.setCellValue(String.valueOf(value));
		}
		else if (value.getClass() == Integer.class) {
			cell.setCellValue((Integer) value);
		}
		else if (value.getClass() == Double.class) {
			cell.setCellValue((Double) value);
		}
		else if (value.getClass() == Date.class) {
			cell.setCellValue(DATE_FORAMT.format(value));
		}
		else if (value.getClass() == Long.class) {
			cell.setCellValue((Long) value);
		}
		else {
			cell.setCellValue(new XSSFRichTextString(String.valueOf(value)));
		}
	}
	
	/**
	 * 最大列宽
	 * 
	 * @param headers
	 * @param datas
	 * @return
	 */
	private static List<Integer> getMaxCall(List<String> headers, List<List<Object>> datas) {
		// 创建最大列宽集合
		List<Integer> maxCall = new ArrayList<>();
		List<List<Integer>> lss = new ArrayList<>();
		// 计算标题行数据的列宽
		List<Integer> hls = new ArrayList<>();
		for (int m = 0; m < headers.size(); m++) {
			int length = headers.get(m).getBytes().length;
			hls.add(length);
			// 最大列宽赋初值
			maxCall.add(0);
		}
		lss.add(hls);
		
		// 计算内容行数据的列宽
		for (int i = 0, j = datas.size(); i < j; i++) {
			List<Integer> dls = new ArrayList<>();
			for (int m = 0, n = datas.get(i).size(); m < n; m++) {
				Object obj = datas.get(i).get(m);
				if (obj == null) {
					dls.add(0);
					continue;
				}
				if (obj.getClass() == Date.class) {
					// 日期格式类型转换
					obj = DATE_FORAMT.format(obj);
				}
				int length = obj.toString().getBytes().length;
				dls.add(length);
			}
			lss.add(dls);
		}
		// 根据列宽计算出每列的最大宽度
		for (int i = 0, j = lss.size(); i < j; i++) {
			for (int m = 0, n = lss.get(i).size(); m < n; m++) {
				Integer a = lss.get(i).get(m);
				Integer b = maxCall.get(m);
				if (a > b) {
					maxCall.set(m, a);
				}
			}
		}
		return maxCall;
	}

	 /** 
     * 读入excel文件，解析后返回 
     * @param inputStream 
     * @throws IOException  
     */  
    public static List<Map<Integer, String>> readExcel(InputStream inputStream) throws IOException{  
        //获得Workbook工作薄对象
        Workbook workbook = null;
		try {
			workbook = WorkbookFactory.create(inputStream);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		}
        //创建返回对象，把每行中的值作为一个数组，所有行作为一个集合返回
		List<Map<Integer, String>> excelList = new ArrayList<>();
          
        if(workbook != null){  
            for(int sheetNum = 0;sheetNum < workbook.getNumberOfSheets();sheetNum++){
            	if(sheetNum == 2){
            		break;
            	}
                //获得当前sheet工作表  
                Sheet sheet = workbook.getSheetAt(sheetNum);  
                if(sheet == null){  
                    continue;  
                }  
                //获得当前sheet的开始行  
                int firstRowNum  = sheet.getFirstRowNum();  
                //获得当前sheet的结束行  
                int lastRowNum = sheet.getLastRowNum();  
                
                //获得当前行的开始列  
                int firstCellNum = 0;
                //获得当前行的列数  
                int lastCellNum = 0;
                //循环所有行  
                for(int rowNum = firstRowNum;rowNum <= lastRowNum;rowNum++){
                	Map<Integer, String> map = new HashMap<>();
                    //获得当前行  
                    Row row = sheet.getRow(rowNum);  
                    if(row == null){  
                        continue;  
                    }  
                    
                    if(0 == rowNum){
                        firstCellNum = row.getFirstCellNum();  
                        lastCellNum = row.getLastCellNum();  
                    }
                    
                    //循环当前行  
                    for(int cellNum = firstCellNum; cellNum < lastCellNum;cellNum++){  
                        Cell cell = row.getCell(cellNum);  
                        
							map.put(cellNum, getCellValue(cell));
                    }  
                    excelList.add(map);
                }
                
            }  
            workbook.close();
        }  
        return excelList;  
    } 
    public static void main(String[] args) {
		
		FileInputStream inputStream = null;
		try {
			
			inputStream= new FileInputStream(new File("d:/1.xlsx"));
			readExcel(inputStream);
			
			System.out.println("--------- over --------");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
	
