package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Cab;
import com.jsp.dto.Person;

public class PersonDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void create(Person p) {
		entityTransaction.begin();
		entityManager.persist(p);
		entityTransaction.commit();
	}

	public void update(Person person) {
		Person person2 = entityManager.find(Person.class, person.getId());
		entityTransaction.begin();
		if (person2 != null) {
			if (person.getName() != null) {
				person2.setName(person.getName());
			}
			if (person.getC_no() != null) {
				person2.setC_no(person.getC_no());
			}
			if (person.getCab() != null) {
				person2.setCab(person.getCab());
			}
			entityManager.merge(person2);
			entityTransaction.commit();
		}
	}

	public void delete(int id) {
		Person person = entityManager.find(Person.class, id);
		if (person != null) {
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
		}
	}

	public Person readById(int id) {
		return entityManager.find(Person.class, id);
	}
}
