package com.hospital.is.converters;

import java.util.HashMap;
import java.util.Map;

import com.hospital.is.entity.Patient;
import com.hospital.is.model.PatientDTO;

public class PatientConverter {

	/**
	 * 
	 * @param patient
	 * @return
	 */
	static PatientDTO entityToDTO(Patient patient) {

		PatientDTO patientDTO = new PatientDTO();
		patientDTO.setAddress(patient.getAddress());
		patientDTO.setBirthDate(patient.getBirthDate());
		patientDTO.setFirstName(patient.getFirstName());
		patientDTO.setLastName(patient.getLastName());
		patientDTO.setPhone(patient.getPhone());
		return patientDTO;

	}

	/**
	 * 
	 * @param patientDTO
	 * @return patient
	 */
	static Patient DTOToEntity(PatientDTO patientDTO) {

		Patient patient = new Patient();
		patient.setAddress(patientDTO.getAddress());
		patient.setBirthDate(patientDTO.getBirthDate());
		patient.setFirstName(patientDTO.getFirstName());
		patient.setLastName(patientDTO.getLastName());
		//TOFIX
		//patient.setMedicalFolder(patientDTO.getMedicalFolder());
		patient.setPhone(patientDTO.getPhone());
		return patient;

	}

	/**
	 * 
	 * @param MapPatient
	 * @return MapPatientDTO
	 */
	static Map<Integer, PatientDTO> mapEntityToDTO(Map<Integer, Patient> MapPatient) {

		Map<Integer, PatientDTO> MapPatientDTO = new HashMap<Integer, PatientDTO>();

		for (Map.Entry<Integer, Patient> entry : MapPatient.entrySet()) {
			MapPatientDTO.put(entry.getKey(), PatientConverter.entityToDTO(entry.getValue()));
		}

		return MapPatientDTO;

	}

	/**
	 * 
	 * @param MapPatientDTO
	 * @return MapPatient
	 */
	static Map<Integer, Patient> mapDTOToEntity(Map<Integer, PatientDTO> MapPatientDTO) {

		Map<Integer, Patient> MapPatient = new HashMap<Integer, Patient>();

		for (Map.Entry<Integer, PatientDTO> entry : MapPatientDTO.entrySet()) {
			MapPatient.put(entry.getKey(), PatientConverter.DTOToEntity(entry.getValue()));
		}

		return MapPatient;
	}

}
