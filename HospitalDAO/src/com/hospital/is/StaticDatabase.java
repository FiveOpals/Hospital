package com.hospital.is;

import java.util.HashMap;
import java.util.Map;

import com.hospital.is.entity.Appointment;
import com.hospital.is.entity.Disease;
import com.hospital.is.entity.Doctor;
import com.hospital.is.entity.MedicalFolder;
import com.hospital.is.entity.Patient;

public class StaticDatabase {

	public static Map<Long, Patient> patientMap;
	public static Map<Long, Disease> diseaseMap;
	public static Map<Long, MedicalFolder> medicalFolderMap;
	public static Map<Long, Appointment> appointementMap;
	public static Map<Long, Doctor> doctorMap;

	static {

		/* initialisation la base des donnees */
		/////////////// INIT PATIENT///////////////////////

		doctorMap = new HashMap<>();

		Doctor doctor = new Doctor();

		doctor.setFirstName("Dr Ali");

		doctorMap.put(1L, doctor);

		patientMap = new HashMap<>();

		Patient patient = new Patient();

		patient.setMedicalFolder(/* getMedicalFolderMap().get(0) */null);
		patient.setFirstName("Prénom premier patient");
		patient.setLastName("Nom premier patient");
		patient.setAddress("30 rue soulaimane achaairi, 20500, Tetouan Maroc");
		patient.setBirthDate("01/01/1970");
		patient.setPhone("+212 6 66 77 88 99");

		patientMap.put(1L, patient);

		Patient patient1 = new Patient();

		patient1.setMedicalFolder(/* getMedicalFolderMap().get(0) */null);
		patient1.setFirstName("mehdi");
		patient1.setLastName("benjelloun");
		patient1.setAddress("avenue rabat");
		patient1.setBirthDate("01/01/1978");
		patient1.setPhone("+212 9 00 66 87 77");

		patientMap.put(2L, patient1);

		/////////////////// INIT DISEASE/////////////////////

		diseaseMap = new HashMap<>();

		Disease disease = new Disease();
		disease.setNature("gastro");
		disease.setDescription("gastro description");
		disease.setDiagDate("06/12/2018");

		diseaseMap.put(1L, disease);

		Disease disease1 = new Disease();
		disease1.setNature("grippe");
		disease1.setDescription("grippe description");
		disease1.setDiagDate("06/02/2009");

		diseaseMap.put(2L, disease1);

		//////////////// INIT RENDEZ-VOUS//////////////////////
		appointementMap = new HashMap<>();

		Appointment Appointement = new Appointment();
		Appointment Appointement1 = new Appointment();

		Appointement.setDateTimeAppointment("02-07-2018");
		Appointement.setTypeAppointment("Consultation");
		Appointement1.setDateTimeAppointment("02-10-2018");
		Appointement1.setTypeAppointment("Suivi traitement");

		appointementMap.put(2L, Appointement);

		///////////////// INIT MEDICAL FOLDER////////////////////

		medicalFolderMap = new HashMap<>();

		MedicalFolder medicalFolder = new MedicalFolder();
		medicalFolder.setDiseaseMap(StaticDatabase.diseaseMap);
		medicalFolder.setAppointmentMap(StaticDatabase.appointementMap);
		medicalFolder.setDiseaseMap(StaticDatabase.diseaseMap);
		medicalFolderMap.put(1L, medicalFolder);

	}

	public static void main(String[] args) {

		System.out.println("####" + medicalFolderMap);
		System.out.println("$$$$$" + appointementMap);
		System.out.println("%%%%%" + patientMap);
		System.out.println("DDDDD" + doctorMap);

	}

}
