package org.example;

import org.example.entity.Product;
import org.example.service.ProductService;

public class App {

    public static void main(String[] args) {

        ProductService service = new ProductService();
//create
        Product product = new Product(
                "Mobile",
                "Gaming Mobile with flashy camera",
                "Electronics",
                10,
                75000.0,
                "SKU-01",
                true
        );

        Product product1 = new Product(
                "Laptop",
                "Gaming Laptop with 16GB RAM and 8GB graphic card",
                "Electronics",
                7,
                175000.0,
                "SKU-02",
                true
        );

        Product product2 = new Product(
                "Face Wash",
                "Vitamin-C face wash for oily skin",
                "Skin-Care",
                15,
                175.0,
                "SKU-03",
                true
        );

//        service.createProduct(product);
//        service.createProduct(product1);
//        service.createProduct(product2);
//read
        service.getProductById(2L);

//update
//        service.updateProduct(1L, 80000.0, 15);
//delete
        service.deleteProduct(2L);
        service.closeFactory();
        System.out.println("All operations completed.");
    }
}
