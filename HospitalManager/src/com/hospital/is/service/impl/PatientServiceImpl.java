package com.hospital.is.service.impl;

import java.util.Collections;
import java.util.Map;

import com.hospital.is.StaticDatabase;
import com.hospital.is.model.Patient;
import com.hospital.is.service.PatientService;

public class PatientServiceImpl implements PatientService {

	@Override
	public Patient create(Patient patient) {
		StaticDatabase.getPatientList().put(patient.getId(),patient);
		return StaticDatabase.getPatientList().get(patient.getId());
	}

	@Override
	public Map<String,Patient> getAll() {
		//puisqu'on a un key "SET" donc on a pas besoin de les trier : 
		//Collections.sort(StaticDatabase.getPatientList().keySet());
		
		return StaticDatabase.getPatientList();
	}

	@Override
	public Patient getById(String id) {
		return StaticDatabase.getPatientList().get(id);
	}

	@Override
	public Patient update(Patient patient, String id) {
		StaticDatabase.getPatientList().put(id,patient);
		return StaticDatabase.getPatientList().get(id);
	}

}
