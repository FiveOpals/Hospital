package com.hospital.is.service.impl;

import java.util.Map;
import com.hospital.is.StaticDatabase;
import com.hospital.is.model.Disease;
import com.hospital.is.service.DiseaseService;

public class DiseaseServiceImpl implements DiseaseService {

	@Override
	public Disease create(Disease disease) {
		StaticDatabase.getDiseaseList().put(disease.getId(),disease);
		Map<String,Disease> diseaseList = StaticDatabase.getDiseaseList();
		return diseaseList.get(disease.getId());
	}

	@Override
	public Map<String,Disease> getAll() {
		return StaticDatabase.getDiseaseList();
	}

	@Override
	public Disease getById(String id) {
		return StaticDatabase.getDiseaseList().get(id);
	}

	@Override
	public Disease update(Disease disease, String id) {
		StaticDatabase.getDiseaseList().put(id, disease);
		return StaticDatabase.getDiseaseList().get(id);
	}

}
