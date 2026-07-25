package com.klef.soa.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.soa.service.PatientService;

@RestController
public class PatientController {
	@Autowired
	private PatientService service;
	@GetMapping("/")
public String test()
{
	return "SOA Progamming & Microservices";
}
	@GetMapping("/displayall")
	public void displayallpatients()
	{
		List<Patient> patients =service.displayAllPatients();
		return ResponseEntity.status(200).body(patient);
	}
	@PostMapping("/add")
	public responseEntity<Patient> addpatient( requestbody patient)
	{
		return ResponseEntity.
	}
}
