package com.alpha.hospital.entity;

public class Patient {
	 private int id;
	 private String name;
	 private String Disease;
	 public Patient(int id, String name, String disease) {
		super();
		this.id = id;
		this.name = name;
		Disease = disease;
	 }
	 public Patient() {
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
	 public String getDisease() {
		 return Disease;
	 }
	 public void setDisease(String disease) {
		 Disease = disease;
	 }
	 @Override
	 public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", Disease=" + Disease + "]";
	 }
	 
	

}
