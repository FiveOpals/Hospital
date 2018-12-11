package com.hospital.is.service.impl;

import java.util.Map;

import com.hospital.is.StaticDatabase;
import com.hospital.is.model.Disease;
import com.hospital.is.service.DiseaseService;

/**
 * @author user001
 *
 */
public class DiseaseServiceImpl extends ServiceImpl<Disease> implements DiseaseService {

	@Override
	public Disease create(Disease disease) {
		StaticDatabase.getDiseaseList().put((int) disease.getId(),disease);
		Map<Integer,Disease> diseaseList = StaticDatabase.getDiseaseList();
		return diseaseList.get((int)disease.getId());
	}

	@Override
	public Map<Integer,Disease> getAll() {
		return StaticDatabase.getDiseaseList();
	}

	@Override
	public Disease getById(long id) {
		return StaticDatabase.getDiseaseList().get((int)id);
	}

	@Override
	public Disease update(long id, Disease disease) {
		StaticDatabase.getDiseaseList().put((int)id, disease);
		return StaticDatabase.getDiseaseList().get((int)id);
	}
}
