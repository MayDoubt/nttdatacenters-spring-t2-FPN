package com.nttdata.spring_t2.services;

import java.util.List;

import com.nttdata.spring_t2.repositories.Order;
import com.nttdata.spring_t2.repositories.Product;

/**
 * Taller 2 Spring
 * 
 * Delivery Manager Service Interface
 * 
 * @author Fernando Pérez Nieto
 *
 */
public interface DeliveryServiceI {
	
	/**
	 * Method that updates the pvp of the products depending on whether it is peninsular or not
	 * 
	 * @param updatedOrder
	 * @param productList
	 */
	public void addProductToAnOrder(Order updatedOrder, List<Product> productList);
}
