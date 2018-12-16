package com.hospital.is.transformers;


import com.hospital.is.entity.Disease;
import com.hospital.is.model.DiseaseDTO;

public class DiseaseConverter extends AbstractConverter<Disease, DiseaseDTO> {

	@Override
	public DiseaseDTO toDTO(Disease entity) {
		DiseaseDTO diseaseDTO = new DiseaseDTO();
		diseaseDTO.setDescription(entity.getDescription());
		diseaseDTO.setDiagDate(entity.getDiagDate());
		diseaseDTO.setNature(entity.getNature());
		diseaseDTO.setState(entity.getState());
		return diseaseDTO;
	}

	@Override
	public Disease toEntity(DiseaseDTO DTO) {
		Disease disease = new Disease();
		disease.setDescription(DTO.getDescription());
		disease.setDiagDate(DTO.getDiagDate());
		disease.setNature(DTO.getNature());
		disease.setState(DTO.getState());
		return disease;

	}

}
