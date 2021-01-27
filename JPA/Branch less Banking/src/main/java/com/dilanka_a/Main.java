package com.dilanka_a;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        Customer customer = em.find(Customer.class, 1);
        System.out.println(customer);
        Customer customer1 = new Customer();
        customer1.setCid(2);
        customer1.setAddress("Kandy");
        customer1.setName("dilanka");
        em.getTransaction().begin();
        em.persist(customer1);
        em.getTransaction().commit();
    }
}
