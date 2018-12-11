package com.hospital.is.converters;

import java.util.HashMap;
import java.util.Map;

import com.hospital.is.model.Prescription;
import com.hospital.is.model.PrescriptionDTO;

public class PrescriptionConverter {

	/**
	 * 
	 * @param prescription
	 * @return prescriptionDTO
	 */
	static PrescriptionDTO entityToDTO(Prescription prescription) {
		PrescriptionDTO prescriptionDTO = new PrescriptionDTO();
		prescriptionDTO.setDescriptionOfUse(prescription.getDescriptionOfUse());
		return prescriptionDTO;
	}

	/**
	 * 
	 * @param prescriptionDTO
	 * @return prescriptionDTO
	 */
	static Prescription DTOToEntity(PrescriptionDTO prescriptionDTO) {

		Prescription prescription = new Prescription();
		prescription.setDescriptionOfUse(prescriptionDTO.getDescriptionOfUse());
		return prescription;

	}

	/**
	 * 
	 * @param MapPrescription
	 * @return MapPrescriptionDTO
	 */
	static Map<Integer, PrescriptionDTO> mapEntityToDTO(Map<Integer, Prescription> MapPrescription) {

		Map<Integer, PrescriptionDTO> MapPrescriptionDTO = new HashMap<Integer, PrescriptionDTO>();

		for (Map.Entry<Integer, Prescription> entry : MapPrescription.entrySet()) {
			MapPrescriptionDTO.put(entry.getKey(), PrescriptionConverter.entityToDTO(entry.getValue()));
		}
		return MapPrescriptionDTO;
	}

	/**
	 * 
	 * @param MapPrescriptionDTO
	 * @return MapPrescription
	 */
	static Map<Integer, Prescription> mapDTOToEntity(Map<Integer, PrescriptionDTO> MapPrescriptionDTO) {

		Map<Integer, Prescription> MapPrescription = new HashMap<Integer, Prescription>();

		for (Map.Entry<Integer, PrescriptionDTO> entry : MapPrescriptionDTO.entrySet()) {
			MapPrescription.put(entry.getKey(), PrescriptionConverter.DTOToEntity(entry.getValue()));
		}

		return MapPrescription;
	}

}
