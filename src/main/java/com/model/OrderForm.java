package com.model;

import java.sql.Date;

public class OrderForm {
	private Integer id;
    private String  name;
    private String  totalPrice;
    private String  desc;
    private String    date;
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "OrderForm [id=" + id + ", name=" + name + ", totalPrice=" + totalPrice + ", desc=" + desc + ", date="
				+ date + "]";
	}
    
    
}
