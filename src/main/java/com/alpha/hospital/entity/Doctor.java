package com.alpha.hospital.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Doctor {
	
	@Id
	private int id;
	private String name;
	private String specialization;
	
	@OneToMany(cascade = CascadeType.ALL)
	 private List<Patient> ptlist;

	public Doctor(int id, String name, String specialization, List<Patient> ptlist) {
		super();
		this.id = id;
		this.name = name;
		this.specialization = specialization;
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
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public List<Patient> getPtlist() {
		return ptlist;
	}

	public void setPtlist(List<Patient> ptlist) {
		this.ptlist = ptlist;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", Specialization=" + specialization + ", ptlist=" + ptlist
				+ "]";
	}

}
