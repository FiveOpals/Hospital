package com.hospital.is.transformers;


import com.hospital.is.entity.MedicalFolder;
import com.hospital.is.model.MedicalFolderDTO;

public class MedicalFolderConverter extends AbstractConverter<MedicalFolder, MedicalFolderDTO> {

	private DiseaseConverter diseaseConverter = new DiseaseConverter();
	private AppointmentConverter appointmentConverter = new AppointmentConverter();
	private PrescriptionConverter prescriptionConverter = new PrescriptionConverter();

	@Override
	public MedicalFolderDTO toDTO(MedicalFolder entity) {
		MedicalFolderDTO medicalFolderDTO = new MedicalFolderDTO();
		medicalFolderDTO.setAppointmentMap(appointmentConverter.toMapDTO(entity.getAppointmentMap()));
		medicalFolderDTO.setDiseaseMap(diseaseConverter.toMapDTO(entity.getDiseaseMap()));
		medicalFolderDTO.setPrescriptionMap(prescriptionConverter.toMapDTO(entity.getPrescriptionMap()));
		return medicalFolderDTO;
		
	}

	@Override
	public MedicalFolder toEntity(MedicalFolderDTO DTO) {
		MedicalFolder medicalFolder = new MedicalFolder();
		medicalFolder.setAppointmentMap(appointmentConverter.toMapEntity(DTO.getAppointmentMap()));
		medicalFolder.setDiseaseMap(diseaseConverter.toMapEntity(DTO.getDiseaseMap()));
		medicalFolder.setPrescriptionMap(prescriptionConverter.toMapEntity(DTO.getPrescriptionMap()));
		return medicalFolder;
	}
	
	

}
