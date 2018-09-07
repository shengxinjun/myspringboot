package com.domain;


import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;


public class Product implements Serializable {

    private static final long serialVersionUID = 1726968814;
    private Integer id;
    private String  name;
    private Double  price;
    private Date    createDate;
    private Integer deleted;
    private String  type;
    private Integer orderId;
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Integer getDeleted() {
		return deleted;
	}
	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", createDate=" + createDate + ", deleted="
				+ deleted + ", type=" + type + ", orderId=" + orderId + "]";
	}
	public Product(Integer id, String name, Double price, Date createDate, Integer deleted, String type,
			Integer orderId) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.createDate = createDate;
		this.deleted = deleted;
		this.type = type;
		this.orderId = orderId;
	}
    
}
