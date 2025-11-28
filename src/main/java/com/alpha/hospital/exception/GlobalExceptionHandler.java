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
	
	@ExceptionHandler(exception = IllegalArgumentException.class)
	public ResponseStructure<String> IllegalArgumentException()
	{
		ResponseStructure<String> rs = new ResponseStructure<String>();
		rs.setStatuscode(HttpStatus.NOT_ACCEPTABLE.value());
		rs.setMessage("Invalid ID");
		rs.setData("Invalid ID");
		return rs;
	}
	
	@ExceptionHandler(exception = InvalidDataException.class)
	public ResponseStructure<String> InvalidDataException()
	{
		ResponseStructure<String> rs = new ResponseStructure<String>();
		rs.setStatuscode(HttpStatus.NOT_ACCEPTABLE.value());
		rs.setMessage("Invalid Data");
		rs.setData("Invalid Data");
		return rs;
	}
}
