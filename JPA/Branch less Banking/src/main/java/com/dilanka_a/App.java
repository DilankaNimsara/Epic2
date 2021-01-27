package com.dilanka_a;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Alien a = new Alien();


        System.out.println("Hello World!");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        Alien alien = entityManager.find(Alien.class, 1);

        a.setAid(2);
        a.setAname("dilanka");
        a.setAtech("java");

        entityManager.getTransaction().begin();
        entityManager.persist(a);
        entityManager.getTransaction().commit();
        System.out.println(a);
    }
}
