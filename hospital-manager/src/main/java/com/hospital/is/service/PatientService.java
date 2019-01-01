package com.hospital.is.service;

import java.util.List;

import com.hospital.is.model.PatientDTO;

public interface PatientService extends Service<PatientDTO> {

	List<PatientDTO> findByFirstName(String firstName);
	void deleteAll(List<PatientDTO> listDTO);

}
