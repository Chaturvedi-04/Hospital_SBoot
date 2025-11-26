package com.alpha.hospital.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.alpha.hospital.ResponseStructure;

@RestControllerAdvice
public class GlobalExceptionHandler  {

	@ExceptionHandler(exception = DoctorNotFoundException.class)
	public ResponseStructure<String> DoctorNotFoundHandler()
	{
		ResponseStructure<String> rs = new ResponseStructure<String>();
		rs.setStatuscode(HttpStatus.NOT_FOUND.value());
		rs.setMessage("Doctor NOT FOUND");
		rs.setData("Doctor NOT FOUND");
		return rs;
	}
}
