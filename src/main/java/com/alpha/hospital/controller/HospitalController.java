package com.alpha.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.hospital.entity.Doctor;
import com.alpha.hospital.service.HospitalService;

@RestController
public class HospitalController {
	
	@Autowired
	private HospitalService hs;
	
	@PostMapping("/saveDoctor")
	public void saveDoctor(@RequestBody Doctor d)
	{
		hs.saveDoctor(d);
	}
}
