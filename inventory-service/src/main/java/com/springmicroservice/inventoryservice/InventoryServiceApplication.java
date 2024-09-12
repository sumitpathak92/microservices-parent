package com.springmicroservice.inventoryservice;

import com.springmicroservice.inventoryservice.model.Inventory;
import com.springmicroservice.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableDiscoveryClient
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
		return args -> {
			Inventory inventory = new Inventory();
			inventory.setSkuCode("iPhone_14");
			inventory.setQuantity(0);

			Inventory inventory_1 = new Inventory();
			inventory_1.setSkuCode("iPhone_14_red");
			inventory_1.setQuantity(0);

			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory_1);
		};
	}
}
