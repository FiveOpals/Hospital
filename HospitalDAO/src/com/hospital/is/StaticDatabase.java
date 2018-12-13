package com.hospital.is;

import java.util.HashMap;

import java.util.Map;

import com.hospital.is.dao.DiseaseDAO;
import com.hospital.is.dao.Impl.DiseaseDAOImpl;
import com.hospital.is.entity.*;

public class StaticDatabase {

	public static Map<Integer, Patient> patientMap;
	public static Map<Integer, Disease> diseaseMap;
	public static Map<Integer, MedicalFolder> medicalFolderMap;
	public static Map<Integer, Appointment> AppointementMap;

	static {

		/* initialisation la base des donnees */
		/////////////// INIT PATIENT///////////////////////

		patientMap = new HashMap<>();

		Patient patient = new Patient();

		patient.setMedicalFolder(/* getMedicalFolderMap().get(0) */null);
		patient.setFirstName("Prénom premier patient");
		patient.setLastName("Nom premier patient");
		patient.setAddress("30 rue soulaimane achaairi, 20500, Tetouan Maroc");
		patient.setBirthDate("01/01/1970");
		patient.setPhone("+212 6 66 77 88 99");

		patientMap.put(1, patient);

		Patient patient1 = new Patient();

		patient1.setMedicalFolder(/* getMedicalFolderMap().get(0) */null);
		patient1.setFirstName("mehdi");
		patient1.setLastName("benjelloun");
		patient1.setAddress("avenue rabat");
		patient1.setBirthDate("01/01/1978");
		patient1.setPhone("+212 9 00 66 87 77");

		patientMap.put(2, patient1);

		/////////////////// INIT DISEASE/////////////////////

		diseaseMap = new HashMap<>();

		Disease disease = new Disease();
		disease.setNature("gastro");
		disease.setDescription("gastro description");
		disease.setDiagDate("06/12/2018");

		diseaseMap.put(1, disease);

		Disease disease1 = new Disease();
		disease1.setNature("grippe");
		disease1.setDescription("grippe description");
		disease1.setDiagDate("06/02/2009");

		diseaseMap.put(2, disease1);

		///////////////// INIT MEDICAL FOLDER////////////////////

		medicalFolderMap = new HashMap<>();

		MedicalFolder medicalFolder = new MedicalFolder();
		DiseaseDAO diseaseMap = new DiseaseDAOImpl(StaticDatabase.diseaseMap);
		medicalFolder.setDiseaseMap(diseaseMap.getAll());
		medicalFolderMap.put(1, medicalFolder);

		//////////////// INIT RENDEZ-VOUS//////////////////////
		AppointementMap = new HashMap<>();

		Appointment Appointement = new Appointment();
		Appointment Appointement1 = new Appointment();

		Appointement.setDateTimeAppointment("02-07-2018");
		Appointement.setTypeAppointment("Consultation");
		Appointement1.setDateTimeAppointment("02-10-2018");
		Appointement1.setTypeAppointment("Suivi traitement");

		AppointementMap.put(2, Appointement);

	}
}
