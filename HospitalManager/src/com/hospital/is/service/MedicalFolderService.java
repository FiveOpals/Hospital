package com.hospital.is.service;

import java.util.Map;

import com.hospital.is.model.MedicalFolder;

public interface MedicalFolderService {
	
	MedicalFolder create(MedicalFolder medicalFolder);

	Map<String,MedicalFolder> getAll();
	
	MedicalFolder getById(String id);

	// put
	MedicalFolder update(MedicalFolder medicalFolder, String id);
	
//	boolean delete(long id);
}
