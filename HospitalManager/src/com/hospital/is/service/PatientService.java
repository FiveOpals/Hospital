package com.hospital.is.service;

import java.util.Map;

import com.hospital.is.model.Patient;

public interface PatientService {

	Patient create(Patient patient);

	Map<String, Patient> getAll();
	
	Patient getById(String id);

	// put
	Patient update(Patient patient, String id);
	
//	boolean delete(long id);
	
}
