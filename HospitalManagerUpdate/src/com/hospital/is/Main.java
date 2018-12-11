package com.hospital.is;

import java.util.Map;

import com.hospital.is.model.Disease;
import com.hospital.is.service.PatientService;
import com.hospital.is.service.impl.PatientServiceImpl;

public class Main {

	public static void main(String[] args) {

		Map<String,Disease> gg=new Database<Disease>(Disease.class).getDatabase();
		System.out.println(gg);
		
		
		PatientService patientService = new PatientServiceImpl();

		Map<String, Object> map = StaticDatabase.getPatientList();

		System.out.println(map);
	}
}
