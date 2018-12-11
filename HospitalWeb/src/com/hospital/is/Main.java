package com.hospital.is;

import java.util.Map;

import com.hospital.is.model.PatientDTO;
import com.hospital.is.service.PatientService;
import com.hospital.is.service.impl.PatientServiceImpl;

public class Main {

	public static void main(String[] args) {

		PatientService patientService = new PatientServiceImpl();

		Map<String, PatientDTO> map = patientService.getAll();
		
		System.out.println(map);
	}
}
