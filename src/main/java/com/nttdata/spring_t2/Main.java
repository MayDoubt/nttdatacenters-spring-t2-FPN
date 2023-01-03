package com.nttdata.spring_t2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.spring_t2.repositories.Order;
import com.nttdata.spring_t2.repositories.Product;
import com.nttdata.spring_t2.services.DeliveryServiceI;
import com.nttdata.spring_t2.services.GenericDeliveryManagementServiceI;

@SpringBootApplication
public class Main implements CommandLineRunner {
	
	/** Delivery Service */
	@Autowired
	private GenericDeliveryManagementServiceI genericService;
	/** Delivery Service */
	@Autowired
	@Qualifier("peninsulaServ")
	private DeliveryServiceI peninsulaService;
	/** Delivery Service */
	@Autowired
	@Qualifier("CMCServ")
	private DeliveryServiceI islandService;

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {
		/** Product creation */
		Product prod1 = new Product(1L,"Cardio Black Shirt", 20.0);
		Product prod2 = new Product(2L,"Taza", 4.0);
		Product prod3 = new Product(3L,"FunkoPop", 20.0);
		Product prod4 = new Product(4L,"Hoke BBO Album CD", 14.99);
		
		List<Product> productsOrder1 = new ArrayList<>();
		List<Product> productsOrder2 = new ArrayList<>();
		
		productsOrder1.add(prod1);
		productsOrder1.add(prod3);
		productsOrder1.add(prod4);
		
		productsOrder2.add(prod3);
		productsOrder2.add(prod2);
		
		/** Delivery creation */
		Order order1;
		Order order2;
		
		order1 = genericService.createOrder(1L, 3L, "C/SotoMonte, 8 (Galicia)", Boolean.TRUE);
		order2 = genericService.createOrder(2L, 3L, "C/Artopaso, 2 (Tenerife)", Boolean.FALSE);
		
		/** Adding productlist to the order */
		if(Boolean.TRUE.equals(order1.isPeninsular())) {
			peninsulaService.addProductToAnOrder(order1, productsOrder1);
		} else {
			islandService.addProductToAnOrder(order1, productsOrder1);
		}
		
		if(Boolean.TRUE.equals(order2.isPeninsular())) {
			peninsulaService.addProductToAnOrder(order2, productsOrder2);
		} else {
			islandService.addProductToAnOrder(order2, productsOrder2);
		}
		
		/** Order Breakdown */
		genericService.breakdownOrder(order1);
		genericService.calculatePrice(order1);
		genericService.breakdownOrder(order2);
		genericService.calculatePrice(order2);
		
	}


}
