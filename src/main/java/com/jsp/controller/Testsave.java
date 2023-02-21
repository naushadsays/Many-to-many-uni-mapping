package com.jsp.controller;

import java.util.ArrayList;

import com.jsp.dto.Cab;
import com.jsp.dto.Person;
import com.jsp.service.ServicePerson;

public class Testsave {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("MADHU");
		person.setC_no("85124");

		Cab c1 = new Cab();
		c1.setName("KAJAL");
		c1.setType("SUV");

		Cab c2 = new Cab();
		c2.setName("SHEETAL");
		c2.setType("SEDAN");

		Cab c3 = new Cab();
		c3.setName("KAJAL");
		c3.setType("SUV");

		ArrayList<Cab> al = new ArrayList<Cab>();
		al.add(c1);
		al.add(c2);
		al.add(c3);

		person.setCab(al);

		ServicePerson servicePerson = new ServicePerson();

		servicePerson.create(person);
		System.out.println("All Good");

	}

}
