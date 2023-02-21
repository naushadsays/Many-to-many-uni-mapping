package com.jsp.controller;

import com.jsp.service.ServicePerson;

public class TestDeletePerson {
	public static void main(String[] args) {
		int person_id = 1;
		ServicePerson servicePerson = new ServicePerson();
		servicePerson.delete(person_id);
	}
}
