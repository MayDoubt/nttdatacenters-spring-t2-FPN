package com.nttdata.spring_t2.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.nttdata.spring_t2.repositories.Order;
import com.nttdata.spring_t2.repositories.Product;

/**
 * Taller 2 Spring
 * 
 * Island Delivery Manager Service Implementation
 * 
 * @author Fernando Pérez Nieto
 *
 */
@Service("CMCServ")
public class IslandDeliveryManagerServiceImpl extends GenericDeliveryManagementServiceImpl implements DeliveryServiceI {

	@Override
	public void addProductToAnOrder(Order updatedOrder, List<Product> productList) {
		Double price;
		
		for (Product product : productList) {
			price = product.getPrice() * 1.04;
			product.setPvp(price);
		}
		
		updatedOrder.setProductList(productList);
		
	}

}
