package com.hospital.is.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
		//traitement
		Patient createdPatient = patientRepository.save(patientToBeCreated);
		// traitement
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
	public PatientDTO getById(long id) throws Exception {
		Optional<Patient> patient = patientRepository.findById(id);
		if (patient.isPresent()) {
			return converter.toDTO(patient.get());
		} else {
			throw new Exception();
		}
	}

	@Override
	public void delete(long id) {
		patientRepository.deleteById(id);
	}

	@Override
	public List<PatientDTO> findByFirstName(String firstName) {
		List<PatientDTO> result = new ArrayList<>();
		for (Patient patient : patientRepository.findByFirstName(firstName)) {
			result.add(converter.toDTO(patient));
		}
		return result;
	}
	
	@Override
	public void deleteAll(List<PatientDTO> listDTO){
		List<Patient> listEntities=new ArrayList<>();
		for (PatientDTO patientDTO : listDTO) {
			listEntities.add(converter.toEntity(patientDTO));
		}
		patientRepository.deleteAll(listEntities);
		
	}

	@Override
	public PatientDTO update(Long id, PatientDTO dto) throws Exception {
		getById(id);
		dto.setId(id);
		return converter.toDTO(patientRepository.save(converter.toEntity(dto)));
	}

}
