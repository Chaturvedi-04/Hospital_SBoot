package com.alpha.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.alpha.hospital.ResponseStructure;
import com.alpha.hospital.entity.Doctor;
import com.alpha.hospital.exception.DoctorNotFoundException;
import com.alpha.hospital.exception.InvalidDataException;
import com.alpha.hospital.repository.HospitalRepo;

@Service
public class HospitalService {

	@Autowired
	private HospitalRepo hr;
	
	public ResponseStructure<Doctor> saveDoctor(Doctor d) {

		ResponseStructure<Doctor> rs= new ResponseStructure<Doctor>();		
		rs.setStatuscode(HttpStatus.CREATED.value());
		rs.setMessage("Doctor is saved" + d);
		rs.setData(d);
		hr.save(d);
		return rs;
		
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
	
	public ResponseStructure<Doctor> updateDoctor(int id, String newname) throws InvalidDataException {

	    if (id <= 0) {
	        throw new IllegalArgumentException("ID cannot be zero or negative");
	    }

	    if (newname == null || newname.trim().isEmpty()) {
	        throw new InvalidDataException();
	    }

	    Doctor d = hr.findById(id)
	                 .orElseThrow(() -> new DoctorNotFoundException());

	    d.setName(newname);  
	    hr.save(d);   

	    ResponseStructure<Doctor> rs = new ResponseStructure<>();
	    rs.setStatuscode(HttpStatus.OK.value());
	    rs.setMessage("Doctor updated successfully");
	    rs.setData(d);

	    return rs;
	}
}



