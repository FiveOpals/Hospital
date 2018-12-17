package com.hospital.is.transformers;

import com.hospital.is.entity.Patient;
import com.hospital.is.model.PatientDTO;

public class PatientConverter extends AbstractConverter<Patient, PatientDTO> {

	public PatientDTO toDTO(Patient patient) {
		PatientDTO dto = new PatientDTO();

		dto.setId(patient.getId());
		dto.setFirstName(patient.getFirstName());
		dto.setLastName(patient.getLastName());
		dto.setBirthDate(patient.getBirthdate());
		dto.setPhone(patient.getPhone());
		dto.setAddress(patient.getAddress());

		return dto;
	}

	public Patient toEntity(PatientDTO dto) {
		Patient patient = new Patient();

		patient.setId(dto.getId());
		patient.setFirstName(dto.getFirstName());
		patient.setLastName(dto.getLastName());
		patient.setBirthdate(dto.getBirthDate());
		patient.setPhone(dto.getPhone());
		patient.setAddress(dto.getAddress());

		return patient;
	}
}
