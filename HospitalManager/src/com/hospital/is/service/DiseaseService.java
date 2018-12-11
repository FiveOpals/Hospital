package com.hospital.is.service;

import java.util.Map;

import com.hospital.is.model.Disease;

public interface DiseaseService {
	
	Disease create(Disease Disease);

	Map<String, Disease> getAll();
	
	Disease getById(String id);

	// put
	Disease update(Disease Disease, String id);
	
//	boolean delete(long id);
}
