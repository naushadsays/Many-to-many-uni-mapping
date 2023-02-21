package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.jsp.dto.Cab;

public class CabDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void create(Cab c) {
		entityTransaction.begin();
		entityManager.persist(c);
		entityTransaction.commit();
	}

	public void update(Cab c) {
		Cab cab = entityManager.find(Cab.class, c.getId());
		entityTransaction.begin();
		if (cab != null) {
			if (c.getName() != null) {
				cab.setName(c.getName());
			}
			if (c.getType() != null) {
				cab.setType(c.getType());
			}
			entityManager.merge(cab);
			entityTransaction.commit();
		}
	}

	public void delete(int id) {
		Cab cab = entityManager.find(Cab.class, id);
		if (cab != null) {
			entityTransaction.begin();
			entityManager.remove(cab);
			entityTransaction.commit();
		}
	}

	public Cab readById(int id) {
		return entityManager.find(Cab.class, id);
	}
}
