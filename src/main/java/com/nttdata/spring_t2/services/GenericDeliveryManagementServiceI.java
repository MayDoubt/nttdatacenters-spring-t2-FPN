package com.nttdata.spring_t2.services;


import com.nttdata.spring_t2.repositories.Order;

/**
 * Taller 2 Spring
 * 
 * Generic Delivery Manager Service Interface
 * 
 * @author Fernando Pérez Nieto
 *
 */
public interface GenericDeliveryManagementServiceI {

	
	/**
	 * Method to create one delivery order
	 * 
	 * @param orderId
	 * @param destinyId
	 * @param address
	 * @param peninsular
	 * @return
	 */
	public Order createOrder(Long orderId, Long destinyId, String address, Boolean peninsular);
	
	/**
	 * Method that breakdown the order
	 * 
	 * @param order
	 */
	public void breakdownOrder(Order order);
	
	/**
	 * Method that calculate the total price for the order
	 * 
	 * @param order
	 */
	public void calculatePrice(Order order);
}
