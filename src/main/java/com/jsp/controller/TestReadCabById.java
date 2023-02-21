package com.jsp.controller;

import com.jsp.dto.Cab;
import com.jsp.service.ServiceCab;

public class TestReadCabById {
	public static void main(String[] args) {
		int id = 1;
		ServiceCab serviceCab = new ServiceCab();
		Cab cab = serviceCab.readById(id);

		System.out.println(cab.getId());
		System.out.println(cab.getName());
		System.out.println(cab.getType());

	}
}
