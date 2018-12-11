package com.hospital.is.converters;

import com.hospital.is.model.MedicalFolder;
import com.hospital.is.model.MedicalFolderDTO;

public class MedicalFolderConverter {

	/**
	 * 
	 * @param medicalFolder
	 * @return medicalFolderDTO
	 */
	MedicalFolderDTO mapEntityToDTO(MedicalFolder medicalFolder) {
		MedicalFolderDTO medicalFolderDTO = new MedicalFolderDTO();
		medicalFolderDTO.setAppointmentMap(AppointmentConverter.mapEntityToDTO(medicalFolder.getAppointmentMap()));
		medicalFolderDTO.setDiseaseMap(DiseaseConverter.mapEntityToDTO(medicalFolder.getDiseaseMap()));
		medicalFolderDTO.setPrescriptionMap(PrescriptionConverter.mapEntityToDTO(medicalFolder.getPrescriptionMap()));
		return medicalFolderDTO;

	}

	/**
	 * 
	 * @param medicalFolderDTO
	 * @return medicalFolder
	 */
	MedicalFolder mapDTOToEntity(MedicalFolderDTO medicalFolderDTO) {

		MedicalFolder medicalFolder = new MedicalFolder();
		medicalFolder.setAppointmentMap(AppointmentConverter.mapDTOToEntity(medicalFolderDTO.getAppointmentMap()));
		medicalFolder.setDiseaseMap(DiseaseConverter.mapDTOToEntity(medicalFolderDTO.getDiseaseMap()));
		medicalFolder.setPrescriptionMap(PrescriptionConverter.mapDTOToEntity(medicalFolderDTO.getPrescriptionMap()));
		return medicalFolder;

	}

}
