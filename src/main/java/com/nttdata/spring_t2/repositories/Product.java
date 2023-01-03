package com.nttdata.spring_t2.repositories;

import java.io.Serializable;


/**
 * Taller 2 Spring
 * 
 * Product entity
 * 
 * @author Fernando Pérez Nieto
 *
 */
public class Product implements Serializable {
	
	
	/** SERIAL VERSION */
	private static final long serialVersionUID = 1L;
	
	/** ID (PK) */
	private Long productId;
	
	/** Product name */
	private String name;
	
	/** PVP */
	private Double pvp;
	
	/** Price */
	private Double price;

	
	/**
	 * Product constructor
	 * 
	 * @param productId
	 * @param name
	 * @param price
	 */
	public Product(Long productId, String name, Double price) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", pvp=" + pvp + ", price=" + price + "]";
	}
	
	/** Getter & Setters */

	/**
	 * @return the productId
	 */
	public Long getProductId() {
		return productId;
	}

	/**
	 * @param productId
	 * 				Set the productId
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 * 				Set the product name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the pvp price
	 */
	public Double getPvp() {
		return pvp;
	}

	/**
	 * @param pvp
	 * 				Set the pvp price
	 */
	public void setPvp(Double pvp) {
		this.pvp = pvp;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price
	 * 				Set the price
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
