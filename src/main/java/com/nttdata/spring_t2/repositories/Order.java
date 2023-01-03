package com.nttdata.spring_t2.repositories;

import java.io.Serializable;
import java.util.List;

/**
 * Taller 2 Spring
 * 
 * Order Entity
 * 
 * @author Fernando Pérez Nieto
 *
 */
public class Order implements Serializable {
	
	/** SERIAL VERSION */
	private static final long serialVersionUID = 1L;
	
	/** ID (PK) */
	private Long orderId;
	
	/** ID Destiny */
	private Long destinyId;
	
	/** Address */
	private String address;
	
	/** Peninsula */
	private Boolean peninsular;
	
	/** ProductList */
	private List<Product> productList;
	

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", destinyId=" + destinyId + ", address=" + address + ", peninsular="
				+ peninsular + ", productList=" + productList.toString() + "]";
	}

	
	/** Getter & Setters */

	/**
	 * @return the orderId
	 */
	public Long getOrderId() {
		return orderId;
	}
	
	/**
	 * @param orderId
	 *            Set the orderId
	 */
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the destinyId
	 */
	public Long getDestinyId() {
		return destinyId;
	}

	/**
	 * @param destinyId
	 * 				Set the destinyId
	 */
	public void setDestinyId(Long destinyId) {
		this.destinyId = destinyId;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 * 				Set the address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return if it's a peninsular order
	 */
	public Boolean isPeninsular() {
		return peninsular;
	}

	/**
	 * @param peninsular
	 * 				Set if it's a peninsular order
	 */
	public void setPeninsular(Boolean peninsular) {
		this.peninsular = peninsular;
	}

	/**
	 * @return the productList
	 */
	public List<Product> getProductList() {
		return productList;
	}

	/**
	 * @param productList
	 * 				Set the productList
	 */
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	
	
}
