package com.hospital.is.converters;

import java.util.HashMap;
import java.util.Map;

import com.hospital.is.entity.Medication;
import com.hospital.is.model.MedicationDTO;

public class MedicationConverter {

	/**
	 * 
	 * @param medication
	 * @return medicationDTO
	 */
	static MedicationDTO entityToDTO(Medication medication) {
		MedicationDTO medicationDTO = new MedicationDTO();
		medicationDTO.setDurationOfUse(medication.getDurationOfUse());
		medicationDTO.setInstrutionOfUse(medication.getInstrutionOfUse());
		medicationDTO.setMedicationName(medication.getMedicationName());
		medicationDTO.setQuantity(medication.getQuantity());
		return medicationDTO;

	}

	/**
	 * 
	 * @param MedicationDTO
	 * @return medication
	 */
	static Medication DTOToEntity(MedicationDTO MedicationDTO) {

		Medication medication = new Medication();
		medication.setDurationOfUse(medication.getDurationOfUse());
		medication.setInstrutionOfUse(medication.getInstrutionOfUse());
		medication.setMedicationName(medication.getMedicationName());
		medication.setQuantity(medication.getQuantity());
		return medication;

	}

	/**
	 * 
	 * @param MapMedication
	 * @return MapMedicationDTO
	 */
	static Map<Integer, MedicationDTO> mapEntityToDTO(Map<Integer, Medication> MapMedication) {

		Map<Integer, MedicationDTO> MapMedicationDTO = new HashMap<Integer, MedicationDTO>();

		for (Map.Entry<Integer, Medication> entry : MapMedication.entrySet()) {
			MapMedicationDTO.put(entry.getKey(), MedicationConverter.entityToDTO(entry.getValue()));
		}

		return MapMedicationDTO;

	}

	/**
	 * 
	 * @param MapMedicationDTO
	 * @return MapMedicationDTO
	 */
	static Map<Integer, Medication> mapDTOToEntity(Map<Integer, MedicationDTO> MapMedicationDTO) {

		Map<Integer, Medication> MapMedication = new HashMap<Integer, Medication>();

		for (Map.Entry<Integer, MedicationDTO> entry : MapMedicationDTO.entrySet()) {
			MapMedication.put(entry.getKey(), MedicationConverter.DTOToEntity(entry.getValue()));
		}

		return MapMedication;
	}

}
