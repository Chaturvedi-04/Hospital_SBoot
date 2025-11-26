package com.alpha.hospital.entity;

import java.util.List;

import jakarta.persistence.OneToMany;

public class Doctor {
	private int id;
	private String name;
	private String Specialization;
	
	@OneToMany
	 private List<Patient> ptlist;

	public Doctor(int id, String name, String specialization, List<Patient> ptlist) {
		super();
		this.id = id;
		this.name = name;
		Specialization = specialization;
		this.ptlist = ptlist;
	}

	public Doctor() {
		super();
	}

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

	public String getSpecialization() {
		return Specialization;
	}

	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}

	public List<Patient> getPtlist() {
		return ptlist;
	}

	public void setPtlist(List<Patient> ptlist) {
		this.ptlist = ptlist;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", Specialization=" + Specialization + ", ptlist=" + ptlist
				+ "]";
	}

}
