package org.example.service;

import org.example.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProductService {

    private final SessionFactory sessionFactory;

    public ProductService() {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Product.class);
        sessionFactory = configuration.buildSessionFactory();
    }

//    create
    public void createProduct(Product product) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(product);

        tx.commit();
        session.close();

        System.out.println("Product inserted successfully!");
    }
//read
    public void getProductById(Long id) {
        Session session = sessionFactory.openSession();
        Product product = session.get(Product.class, id);
        session.close();
        if (product != null) {
            System.out.println("Product Found:");
            System.out.println("ID: " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Category: " + product.getCategory());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Quantity: " + product.getQuantity());
        } else {
            System.out.println("Product not found!");
        }
    }

    // update
    public void updateProduct(Long id, double newPrice, int newQuantity) {

        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        Product product = session.get(Product.class, id);

        if (product != null) {
            product.setPrice(newPrice);
            product.setQuantity(newQuantity);
            System.out.println("Product updated successfully!");
        } else {
            System.out.println("Product not found!");
        }

        tx.commit();
        session.close();
    }

//    delete
    public void deleteProduct(Long id) {

        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        Product product = session.get(Product.class, id);

        if (product != null) {
            session.delete(product);
            System.out.println("Product deleted successfully!");
        } else {
            System.out.println("Product not found!");
        }

        tx.commit();
        session.close();
    }

    public void closeFactory() {
        sessionFactory.close();
    }
}
