package com.alpha.hospital.entity;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;

@Entity
public class Patient {
	
     @Id
     @Positive
     @Min(value = 200)
	 private int id;
     @Length(max=30,min=3)
	 private String name;
     @Length(max=30,min=3)
	 private String disease;
	 
	 public Patient(int id, String name, String disease) {
		super();
		this.id = id;
		this.name = name;
		this.disease = disease;
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
		 return disease;
	 }
	 public void setDisease(String disease) {
		 this.disease = disease;
	 }
	 @Override
	 public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", Disease=" + disease + "]";
	 }
}
