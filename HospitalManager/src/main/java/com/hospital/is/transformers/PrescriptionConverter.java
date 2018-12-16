package com.hospital.is.transformers;


import com.hospital.is.entity.Prescription;
import com.hospital.is.model.PrescriptionDTO;

public class PrescriptionConverter extends AbstractConverter<Prescription, PrescriptionDTO> {

	@Override
	public PrescriptionDTO toDTO(Prescription entity) {
		PrescriptionDTO prescriptionDTO = new PrescriptionDTO();
		prescriptionDTO.setDescriptionOfUse(entity.getDescriptionOfUse());
		return prescriptionDTO;
	}

	@Override
	public Prescription toEntity(PrescriptionDTO DTO) {

		Prescription prescription = new Prescription();
		prescription.setDescriptionOfUse(DTO.getDescriptionOfUse());
		return prescription;
	}

}
