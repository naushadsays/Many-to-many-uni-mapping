package com.jsp.controller;

import com.jsp.dto.Cab;
import com.jsp.service.ServiceCab;

public class TestUpdateCab {
	public static void main(String[] args) {
		Cab cab = new Cab();
		cab.setId(1);
		cab.setName("xyz");
		cab.setType("ola");

		ServiceCab serviceCab = new ServiceCab();
		serviceCab.update(cab);
	}
}
