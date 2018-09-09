package com.domain;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;

public class Product implements Serializable {

	private static final long serialVersionUID = 1726968814;
	private Integer id;
	private String imgs;
	private String description;
	private String name;
	private Double price;
	private Date updateDate;
	private Date createDate;
	private Integer deleted = 0;
	private String type;
	private Integer orderId;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImgs() {
		return imgs;
	}

	public void setImgs(String imgs) {
		this.imgs = imgs;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
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
		return "Product [id=" + id + ", imgs=" + imgs + ", description=" + description + ", name=" + name + ", price="
				+ price + ", updateDate=" + updateDate + ", createDate=" + createDate + ", deleted=" + deleted
				+ ", type=" + type + ", orderId=" + orderId + "]";
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

}
