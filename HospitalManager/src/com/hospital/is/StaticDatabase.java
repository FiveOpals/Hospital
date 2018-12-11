package com.hospital.is;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.hospital.is.model.Disease;
import com.hospital.is.model.MedicalFolder;
import com.hospital.is.model.Patient;

public class StaticDatabase {

	/**
	 * @return the DiseaseList
	 */
	public static Map<String,Disease> getDiseaseList() {
		Map<String,Disease> diseaseList = new TreeMap<>();

		Disease disease = new Disease();
		disease.setNature("gastro");
		disease.setDescription("gastro description");
		disease.setDiagDate("06/12/2018");

		diseaseList.put("001",disease);

		return diseaseList;
	}

	/**
	 * @return the medicalFolderList
	 */
	public static Map<String, MedicalFolder> getMedicalFolderList() {
		Map<String, MedicalFolder> medicalFolderList = new TreeMap<>();

		MedicalFolder medicalFolder = new MedicalFolder();

		medicalFolder.setDiseaseList(getDiseaseList());
		medicalFolderList.put("001",medicalFolder);

		return medicalFolderList;
	}

	/**
	 * @return the PatientList
	 */
	public static Map<String,Patient> getPatientList() {

		Patient patient = new Patient();

		patient.setMedicalFolder(getMedicalFolderList().get("001"));
		patient.setFirstName("Prénom premier patient");
		patient.setLastName("Nom premier patient");
		patient.setAddress("30 rue soulaimane achaairi, 20500, Tetouan Maroc");
		patient.setBirthDate("01/01/1970");
		patient.setPhone("+212 6 66 77 88 99");


		Map<String, Patient> PatientList = new HashMap<>();

		PatientList.put(patient.getId(), patient);

		return PatientList;
	}

}
