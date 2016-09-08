package com.boots.dheeraj.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name="orderDetails")
public class OrderDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6496738355671739901L;
//	@Id
//	@GeneratedValue
//	private int orderNumber;
//	@Id
//	@GeneratedValue
	//private int productCode;
	private int quantityOrdered;
	private float priceEach;
	private int orderLineNumber;
	
	@Id
	@ManyToOne
	@JoinColumn(name="orderNumber")
	@JsonManagedReference
	private Orders orders;
	
	@Id
	@ManyToOne
	@JoinColumn(name="productCode")
	@JsonManagedReference
	private Products products;

//	public int getOrderNumber() {
//		return orderNumber;
//	}
//
//	public void setOrderNumber(int orderNumber) {
//		this.orderNumber = orderNumber;
//	}
//
//	public int getProductCode() {
//		return productCode;
//	}
//
//	public void setProductCode(int productCode) {
//		this.productCode = productCode;
//	}

	public int getQuantityOrdered() {
		return quantityOrdered;
	}

	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public float getPriceEach() {
		return priceEach;
	}

	public void setPriceEach(float priceEach) {
		this.priceEach = priceEach;
	}

	public int getOrderLineNumber() {
		return orderLineNumber;
	}

	public void setOrderLineNumber(int orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

//	@Override
//	public String toString() {
//		return "OrderDetails [orderNumber=" + orderNumber + ", productCode=" + productCode + ", quantityOrdered="
//				+ quantityOrdered + ", priceEach=" + priceEach + ", orderLineNumber=" + orderLineNumber + ", orders="
//				+ orders + ", products=" + products + "]";
//	}

	
	
		
	
}
