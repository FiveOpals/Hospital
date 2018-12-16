package com.hospital.is;

import com.hospital.is.model.PatientDTO;
import com.hospital.is.service.PatientService;
import com.hospital.is.service.impl.PatientServiceImpl;

public class Main {

	public static void main(String[] args) {

		// initialisation
		PatientService patientService = new PatientServiceImpl();

		// Create / Add
		PatientDTO patient = new PatientDTO();

		patient.setMedicalFolder(/* getMedicalFolderMap().get(0) */null);
		patient.setFirstName("Prénom premier patient");
		patient.setLastName("Nom premier patient");
		patient.setAddress("30 rue soulaimane achaairi, 20500, Tetouan Maroc");
		patient.setBirthDate("01/01/1970");
		patient.setPhone("+212 6 66 77 88 99");
		
		System.out.println("Creation :\n"+patientService.create(377, patient));
		//LECTURE
		//	Lecture total
		System.out.println("Lecture total :\n"+patientService.getAll());
		//	Lecture unitaire
		long id=377;
		System.out.println("Lecture unitaire "+"id = "+id+"\n"+patientService.getById(id));
		//	Supression
		System.out.println("Suppression : "+ (patientService.delete(377)==true?"succes":"fail"));
		System.out.println(patientService.getAll());

	}
}
