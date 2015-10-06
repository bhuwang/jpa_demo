/**
 * 
 */
package com.bhuwan.jpa.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author bhuwan
 *
 */
public class JPADemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Entity manager doesnot have autoclosable interface implementation so
		// cannot use try-with-resource here.
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("jpa_demo");
		EntityManager em = emf.createEntityManager();

		// Begin transaction
		em.getTransaction().begin();

		// add(em);
		update(em);
		// select(em);
		// delete(em);

		// Commit transaction
		em.getTransaction().commit();
		emf.close();
		em.close();
	}

	private static void add(EntityManager em) {
		// create object
		Staff staff = new Staff();
		staff.setName("Bhuwan Gautam");
		staff.setAddress("Lamachaur - Pokhara");
		// persist to db
		em.persist(staff);
	}

	private static void update(EntityManager em) {
		Staff staff = em.find(Staff.class, 4);
		staff.setName("Bhuwaneshwor Gautam");
		staff.setAddress("Kapan Kathmandu");
		// update staff name
		// In the code below there is no merge. Working with Hibernate means
		// working with objects and states
		// em.merge(staff);
	}

	private static void select(EntityManager em) {
		Staff staff = em.find(Staff.class, 1);
		System.out.println("Staff Name: " + staff.getName());
	}

	private static void delete(EntityManager em) {
		Staff staff = em.find(Staff.class, 3);
		// delete from db
		em.remove(staff);
	}
}
