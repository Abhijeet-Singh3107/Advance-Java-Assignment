package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.entity.FormulaOne;
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        FormulaOne driver = new FormulaOne(
                "Lewis Hamilton",
                "Mercedes",
                7,
                103,
                "British"
        );

        em.persist(driver);

        em.getTransaction().commit();

        System.out.println("Driver inserted!");

    }
}
