package com.jsp.controller;

import com.jsp.service.ServiceCab;

public class TestDeleteCab {
	public static void main(String[] args) {
		int id = 3;
		ServiceCab serviceCab = new ServiceCab();
		serviceCab.delete(id);
	}
}
