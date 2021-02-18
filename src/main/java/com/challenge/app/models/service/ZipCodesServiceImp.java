package com.challenge.app.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.challenge.app.models.Pojo_ZipCode;
import com.challenge.app.models.repositories.ZipCodesRepository;

@Service
public class ZipCodesServiceImp implements ZipCodesService{

	@Autowired
	private ZipCodesRepository zipCodes;
	
	@Override
	@Transactional(readOnly = true)
	public Pojo_ZipCode findById(Integer zip_code) {
		return zipCodes.findById(zip_code).orElse(null);
	}
}
