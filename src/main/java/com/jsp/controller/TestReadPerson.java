package com.jsp.controller;

import com.jsp.dto.Person;
import com.jsp.service.ServicePerson;

public class TestReadPerson {
	public static void main(String[] args) {
		int id = 1;
		ServicePerson servicePerson = new ServicePerson();
		Person person = servicePerson.readById(id);

		System.out.println(person.getId());
		System.out.println(person.getName());
		System.out.println(person.getC_no());

	}
}
