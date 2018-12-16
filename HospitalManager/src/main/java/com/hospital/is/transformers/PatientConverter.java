package com.hospital.is.transformers;


import com.hospital.is.entity.Patient;
import com.hospital.is.model.PatientDTO;

public class PatientConverter extends AbstractConverter<Patient, PatientDTO> {

	@Override
	public PatientDTO toDTO(Patient entity) {
		PatientDTO patientDTO = new PatientDTO();
		patientDTO.setAddress(entity.getAddress());
		patientDTO.setBirthDate(entity.getBirthDate());
		patientDTO.setFirstName(entity.getFirstName());
		patientDTO.setLastName(entity.getLastName());
		patientDTO.setPhone(entity.getPhone());
		return patientDTO;
	}

	@Override
	public Patient toEntity(PatientDTO DTO) {
		Patient patient = new Patient();
		patient.setAddress(DTO.getAddress());
		patient.setBirthDate(DTO.getBirthDate());
		patient.setFirstName(DTO.getFirstName());
		patient.setLastName(DTO.getLastName());
		// TOFIX
		// patient.setMedicalFolder(patientDTO.getMedicalFolder());
		patient.setPhone(DTO.getPhone());
		return patient;

	}

}
