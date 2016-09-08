package com.boots.dheeraj.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name="productLines")
public class ProductLines {
	
	@Id
	@GeneratedValue
	private String productLine;
	private String textDescription;
	private String htmlDescription;
	private byte[] image;
	
	@OneToMany(mappedBy="productLines")
	@JsonBackReference
	private List<Products> products = new ArrayList<>();

	public String getProductLine() {
		return productLine;
	}

	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}

	public String getTextDescrpition() {
		return textDescription;
	}

	public void setTextDescrpition(String textDescrpition) {
		this.textDescription = textDescrpition;
	}

	public String getHtmlDescription() {
		return htmlDescription;
	}

	public void setHtmlDescription(String htmlDescription) {
		this.htmlDescription = htmlDescription;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "ProductLines [productLine=" + productLine + ", textDescription=" + textDescription
				+ ", htmlDescription=" + htmlDescription + ", image=" + Arrays.toString(image) + ", products="
				+ products + "]";
	}	
}
