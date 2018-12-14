package com.hospital.is;

import java.util.Map;

import com.hospital.is.model.DoctorDTO;
import com.hospital.is.model.PatientDTO;
import com.hospital.is.service.DoctorService;
import com.hospital.is.service.PatientService;
import com.hospital.is.service.impl.DoctorServiceImpl;
import com.hospital.is.service.impl.PatientServiceImpl;

public class Main {

	public static void main(String[] args) {

		PatientService  patientService= new PatientServiceImpl();
		Map<Long, PatientDTO> mapPatient = patientService.getAll();

		DoctorService doctorService = new DoctorServiceImpl();
		Map<Long, DoctorDTO> mapDoctor = doctorService.getAll();
		
		// MedicalFolderService medicalFolderService = new MedicalFolderServiceImpl();
		// Map<Long, MedicalFolderDTO> mapMedicalFolder = medicalFolderService.getAll();

		// System.out.println("##" + mapMedicalFolder);
		System.out.println(mapDoctor);
		System.out.println("//"+mapPatient);
		// System.out.println(mapMedicalFolder);
		System.out.println(mapPatient.size());
		System.out.println("(*)) new value*"+patientService.delete(1L));
		//System.out.println(mapPatient.);
		
	}
}
