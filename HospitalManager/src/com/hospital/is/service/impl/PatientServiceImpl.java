package com.hospital.is.service.impl;

import java.util.Map;

import com.hospital.is.dao.DAO;
import com.hospital.is.dao.PatientDAO;
import com.hospital.is.dao.Impl.DAOImpl;
import com.hospital.is.dao.Impl.PatientDAOImpl;
import com.hospital.is.entity.Patient;
import com.hospital.is.model.PatientDTO;
import com.hospital.is.service.PatientService;
import com.hospital.is.transformers.PatientConverter;

/**
 * @author user001
 *
 */
public class PatientServiceImpl extends ServiceImpl<PatientDTO, Patient> implements PatientService {

	DAO<Patient> dao = new PatientDAOImpl();
	
	private PatientDAO patientDAO = new PatientDAOImpl();

	@Override
	public Map<Long, PatientDTO> getAll() {
		PatientConverter patientConverter = new PatientConverter();
		return patientConverter.toMapDTO(patientDAO.getAll());
	}

	/**
	 * 
	 */
	@Override
	public PatientDTO create(long id, PatientDTO patientDTO) {

		PatientConverter patientConverter = new PatientConverter();

		Patient patient = patientConverter.toEntity(patientDTO);
		Patient patientDto = dao.create(id, patient);
		return patientConverter.toDTO(patientDto);
	}

	/**
	 * 
	 */
	@Override
	public PatientDTO getById(long id) {
		PatientConverter patientConverter = new PatientConverter();
		Patient patient = dao.getById(id);
		return patientConverter.toDTO(patient);

	}

	/**
	 * 
	 * @param patientDTO
	 * @param id
	 * @return
	 */
	@Override
	public PatientDTO update(long id, PatientDTO patientDTO ) {
		PatientConverter patientConverter = new PatientConverter();
		Patient patient = patientConverter.toEntity(patientDTO);
		Patient patientDto = patientDAO.update(id, patient);
		return patientConverter.toDTO(patientDto);
	}

	@Override
	public boolean delete(long id) {

		return patientDAO.delete(id);

	}

}
