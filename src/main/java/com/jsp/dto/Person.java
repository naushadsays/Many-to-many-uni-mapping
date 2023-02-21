package com.jsp.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String c_no;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Cab> cab;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getC_no() {
		return c_no;
	}

	public void setC_no(String c_no) {
		this.c_no = c_no;
	}

	public List<Cab> getCab() {
		return cab;
	}

	public void setCab(List<Cab> cab) {
		this.cab = cab;
	}

}
