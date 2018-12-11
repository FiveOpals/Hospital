package com.hospital.is.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.hospital.is.StaticDatabase;
import com.hospital.is.entity.Patient;
import com.hospital.is.model.PatientDTO;
import com.hospital.is.service.PatientService;
import com.hospital.is.transformers.PatientConverter;

/**
 * @author user001
 *
 */
public class PatientServiceImpl extends ServiceImpl<PatientDTO> implements PatientService {

	private PatientConverter converter = new PatientConverter();

	@Override
	public Map<String, PatientDTO> getAll() {

		Map<String, Patient> map = StaticDatabase.getPatientList();

		Map<String, PatientDTO> result = new HashMap<>();

		result.put("AMCHICHIMajda", converter.toDTO(map.get("AMCHICHIMajda")));

		return result;
	}
}
