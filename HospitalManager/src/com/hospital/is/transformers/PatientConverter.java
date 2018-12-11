package com.hospital.is.transformers;

import com.hospital.is.entity.Patient;
import com.hospital.is.model.PatientDTO;

public class PatientConverter {

	public PatientDTO toDTO(Patient patient) {
		PatientDTO dto = new PatientDTO();

		dto.setFirstName(patient.getFirstName());

		return dto;
	}

	public Patient toEntity(PatientDTO dto) {
		Patient patient = new Patient();

		patient.setFirstName(dto.getFirstName());

		return patient;
	}
}
