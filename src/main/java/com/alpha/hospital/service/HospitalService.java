package com.alpha.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.alpha.School.Entity.Student;
import com.alpha.hospital.ResponseStructure;
import com.alpha.hospital.entity.Doctor;
import com.alpha.hospital.exception.DoctorNotFoundException;
import com.alpha.hospital.repository.HospitalRepo;

@Service
public class HospitalService {

	@Autowired
	private HospitalRepo hr;
	
	public void saveDoctor(Doctor d) {
		hr.save(d);
	}
	public ResponseStructure<Doctor> findDoctor(int id) {
		// TODO Auto-generated method stub
		Doctor d = hr.findById(id).orElseThrow(()-> new DoctorNotFoundException());
		ResponseStructure<Doctor> rs= new ResponseStructure<Doctor>();
		
		rs.setStatuscode(HttpStatus.FOUND.value());
		rs.setMessage("Doctor with id" + id + "found");
		rs.setData(d);
		return rs;
	}
	public void updatestu(int id,String newname) {
		Doctor  d = hr.findById(id).get();
		d.setName(newname);
		hr.save(d);
	}
	
	
}
