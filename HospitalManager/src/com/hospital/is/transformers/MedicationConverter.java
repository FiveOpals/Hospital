package com.hospital.is.transformers;


import com.hospital.is.entity.Medication;
import com.hospital.is.model.MedicationDTO;

public class MedicationConverter extends AbstractConverter<Medication, MedicationDTO> {

	@Override
	public MedicationDTO toDTO(Medication entity) {
		MedicationDTO medicationDTO = new MedicationDTO();
		medicationDTO.setDurationOfUse(entity.getDurationOfUse());
		medicationDTO.setInstrutionOfUse(entity.getInstrutionOfUse());
		medicationDTO.setMedicationName(entity.getMedicationName());
		medicationDTO.setQuantity(entity.getQuantity());
		return medicationDTO;
	}

	@Override
	public Medication toEntity(MedicationDTO DTO) {
		Medication medication = new Medication();
		medication.setDurationOfUse(DTO.getDurationOfUse());
		medication.setInstrutionOfUse(DTO.getInstrutionOfUse());
		medication.setMedicationName(DTO.getMedicationName());
		medication.setQuantity(DTO.getQuantity());
		return medication;
	}

}
