package com.hospital.is.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.is.dao.PatientRepository;
import com.hospital.is.entity.Patient;
import com.hospital.is.model.PatientDTO;
import com.hospital.is.service.PatientService;
import com.hospital.is.transformers.PatientConverter;

/**
 * @author user001
 *
 */
@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository patientRepository;

	private PatientConverter converter = new PatientConverter();

	@Override
	public PatientDTO create(PatientDTO dto) {
		Patient patientToBeCreated = converter.toEntity(dto);

		Patient createdPatient = patientRepository.save(patientToBeCreated);

		return converter.toDTO(createdPatient);
	}

	@Override
	public List<PatientDTO> getAll() {
		List<PatientDTO> result = new ArrayList<>();
		Iterable<Patient> iterable = patientRepository.findAll();
		for (Patient patient : iterable) {
			result.add(converter.toDTO(patient));
		}
		return result;
	}

	@Override
	public PatientDTO getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PatientDTO update(PatientDTO t, long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}

}
