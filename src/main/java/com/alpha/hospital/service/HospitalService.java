package com.alpha.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpha.hospital.entity.Doctor;
import com.alpha.hospital.repository.HospitalRepo;

@Service
public class HospitalService {

	@Autowired
	private HospitalRepo hr;
	public void saveDoctor(Doctor d) {
		hr.save(d);
	}
}
