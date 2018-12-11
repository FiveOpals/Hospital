package com.hospital.is;

import com.hospital.is.service.PatientService;
import com.hospital.is.service.impl.PatientServiceImpl;

public class Main {

	public static void main(String[] args) {
		
		PatientService patientService = new PatientServiceImpl();

		System.out.println(patientService.getAll());
	}
}
