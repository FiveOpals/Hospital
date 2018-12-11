package com.hospital.is.service.impl;

import java.util.Map;

import com.hospital.is.StaticDatabase;
import com.hospital.is.model.MedicalFolder;
import com.hospital.is.service.MedicalFolderService;

public class MedicalFolderServiceImpl implements MedicalFolderService {

	@Override
	public MedicalFolder create(MedicalFolder medicalFolder) {
		StaticDatabase.getMedicalFolderList().put(medicalFolder.getId(),medicalFolder);
		return StaticDatabase.getMedicalFolderList().get(medicalFolder.getId());
	}

	@Override
	public Map<String,MedicalFolder> getAll() {
		return StaticDatabase.getMedicalFolderList();
	}

	@Override
	public MedicalFolder getById(String id) {
		return StaticDatabase.getMedicalFolderList().get(id);

	}

	@Override
	public MedicalFolder update(MedicalFolder medicalFolder, String id) {
		StaticDatabase.getMedicalFolderList().put(id,medicalFolder);
		return StaticDatabase.getMedicalFolderList().get(id);
	}

}
