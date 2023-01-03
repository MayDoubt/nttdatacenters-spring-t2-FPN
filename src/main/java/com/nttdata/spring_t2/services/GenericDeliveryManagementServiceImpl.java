package com.nttdata.spring_t2.services;


import java.util.List;

import com.nttdata.spring_t2.repositories.Order;
import com.nttdata.spring_t2.repositories.Product;

/**
 * Taller 2 Spring
 * 
 * Generic Delivery Manager Service Implementation
 * 
 * @author Fernando Pérez Nieto
 *
 */
public abstract class GenericDeliveryManagementServiceImpl implements GenericDeliveryManagementServiceI {

	@Override
	public Order createOrder(Long orderId, Long destinyId, String address, Boolean peninsular) {
		
		final Order order = new Order();
		order.setOrderId(orderId);
		order.setDestinyId(destinyId);
		order.setAddress(address);
		order.setPeninsular(peninsular);
		
		return order;
	}

	@Override
	public void breakdownOrder(Order order) {
		
		final String orderBreakdown;
		orderBreakdown = order.toString();
		System.out.println("\nOrder breakdown:");
		System.out.println("-----------------------\n");
		System.out.println(orderBreakdown);
		
	}

	@Override
	public void calculatePrice(Order order) {
		Double totalPrice = 0.0;
		List<Product> productList = order.getProductList();

		for (Product product : productList) {
			totalPrice += product.getPvp();
		}
		
		System.out.println("El precio total del envío " + order.getOrderId() + " es: " + totalPrice + "€");
	}

}
