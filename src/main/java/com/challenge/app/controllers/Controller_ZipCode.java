package com.challenge.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.challenge.app.models.Pojo_ZipCode;
import com.challenge.app.models.service.ZipCodesService;

@Controller
public class Controller_ZipCode {

	@Autowired
	private ZipCodesService zipCodes;
	
	@GetMapping("/zip-codes/{zip_code}")
	public ResponseEntity<Pojo_ZipCode> getZipCode(@PathVariable Integer zip_code) {
		Pojo_ZipCode zipCode = zipCodes.findById(zip_code);
		if (zipCode != null) 
			return new ResponseEntity<Pojo_ZipCode>(zipCode, HttpStatus.OK);
		else
			return new ResponseEntity<Pojo_ZipCode>(zipCode, HttpStatus.NOT_FOUND);
	}
}
