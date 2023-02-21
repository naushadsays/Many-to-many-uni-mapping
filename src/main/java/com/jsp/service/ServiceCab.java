package com.jsp.service;

import com.jsp.dao.CabDao;
import com.jsp.dto.Cab;

public class ServiceCab {
	CabDao cabDao = new CabDao();

	public void create(Cab c) {
		cabDao.create(c);
	}

	public void update(Cab c) {
		cabDao.update(c);
	}

	public void delete(int id) {
		cabDao.delete(id);
	}

	public Cab readById(int id) {
		return cabDao.readById(id);
	}
}
