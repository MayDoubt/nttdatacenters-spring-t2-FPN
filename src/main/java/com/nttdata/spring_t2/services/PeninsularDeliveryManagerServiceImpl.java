package com.nttdata.spring_t2.services;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.nttdata.spring_t2.repositories.Order;
import com.nttdata.spring_t2.repositories.Product;

/**
 * Taller 2 Spring
 * 
 * Peninsular Delivery Manager Service Implementation
 * 
 * @author Fernando Pérez Nieto
 *
 */
@Service("peninsulaServ")
@Primary
public class PeninsularDeliveryManagerServiceImpl extends GenericDeliveryManagementServiceImpl implements DeliveryServiceI {

	@Override
	public void addProductToAnOrder(Order updatedOrder, List<Product> productList) {
		Double price;
		
		for (Product product : productList) {
			price = product.getPrice() * 1.21;
			product.setPvp(price);
		}
		
		updatedOrder.setProductList(productList);
	}
	
}
