package com.hospital.is.converters;

import java.util.HashMap;
import java.util.Map;

import com.hospital.is.entity.Disease;
import com.hospital.is.model.DiseaseDTO;

public class DiseaseConverter {

	/**
	 * 
	 * @param disease
	 * @return diseaseDTO
	 */
	static DiseaseDTO entityToDTO(Disease disease) {
		DiseaseDTO diseaseDTO = new DiseaseDTO();
		diseaseDTO.setDescription(disease.getDescription());
		diseaseDTO.setDiagDate(disease.getDiagDate());
		diseaseDTO.setNature(disease.getNature());
		diseaseDTO.setState(disease.getState());
		return diseaseDTO;

	}

	/**
	 * 
	 * @param diseaseDTO
	 * @return disease
	 */
	static Disease DTOToEntity(DiseaseDTO diseaseDTO) {

		Disease disease = new Disease();
		disease.setDescription(diseaseDTO.getDescription());
		disease.setDiagDate(diseaseDTO.getDiagDate());
		disease.setNature(diseaseDTO.getNature());
		disease.setState(diseaseDTO.getState());

		return disease;

	}

	/**
	 * 
	 * @param MapDisease
	 * @return MapDiseaseDTO
	 */
	static Map<Integer, DiseaseDTO> mapEntityToDTO(Map<Integer, Disease> MapDisease) {

		Map<Integer, DiseaseDTO> MapDiseaseDTO = new HashMap<Integer, DiseaseDTO>();

		for (Map.Entry<Integer, Disease> entry : MapDisease.entrySet()) {
			MapDiseaseDTO.put(entry.getKey(), DiseaseConverter.entityToDTO(entry.getValue()));
		}

		return MapDiseaseDTO;

	}

	/**
	 * 
	 * @param MapDiseaseDTO
	 * @return MapDisease
	 */
	static Map<Integer, Disease> mapDTOToEntity(Map<Integer, DiseaseDTO> MapDiseaseDTO) {

		Map<Integer, Disease> MapDisease = new HashMap<Integer, Disease>();

		for (Map.Entry<Integer, DiseaseDTO> entry : MapDiseaseDTO.entrySet()) {
			MapDisease.put(entry.getKey(), DiseaseConverter.DTOToEntity(entry.getValue()));
		}

		return MapDisease;
	}



}
