package com.hospital.is.model;

import java.util.Map;

public class PrescriptionDTO {

	private long idPrescription;

	private Map<Long, MedicationDTO> medicationMap;

	private String descriptionOfUse;

	/**
	 * @return the idPrescription
	 */
	public long getIdPrescription() {
		return idPrescription;
	}

	/**
	 * @param idPrescription
	 *            the idPrescription to set
	 */
	public void setIdPrescription(long idPrescription) {
		this.idPrescription = idPrescription;
	}
	
	
	public Map<Long, MedicationDTO> getMedicationMap() {
		return medicationMap;
	}

	public void setMedicationMap(Map<Long, MedicationDTO> medicationMap) {
		this.medicationMap = medicationMap;
	}

	/**
	 * @return the descriptionOfUse
	 */
	public String getDescriptionOfUse() {
		return descriptionOfUse;
	}

	/**
	 * @param descriptionOfUse
	 *            the descriptionOfUse to set
	 */
	public void setDescriptionOfUse(String descriptionOfUse) {
		this.descriptionOfUse = descriptionOfUse;
	}

}
