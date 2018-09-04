package com.model;

import java.io.Serializable;

public class OrderForm implements Serializable{
	
	private static final long serialVersionUID = -1801367106;
	//使用gson时，前端传过来的数值类型的字段不可以为空，要么就不传。否则会报empty string错误。
	private Integer id;
    private String  name;
    private String  totalPrice;
    private Integer userId;
    private String  date;
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
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "OrderForm [id=" + id + ", name=" + name + ", totalPrice=" + totalPrice + ", userId=" + userId
				+ ", date=" + date + "]";
	}
	
    
}
