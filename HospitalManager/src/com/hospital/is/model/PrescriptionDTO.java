package com.hospital.is.model;

import java.util.Map;

public class PrescriptionDTO {

	private long idPrescription;
	
	private Map<Integer, MedicationDTO> medicationMap;

	private String descriptionOfUse;

	/**
	 * @return the medicationMap
	 */
	public Map<Integer, MedicationDTO> getMedicationMap() {
		return medicationMap;
	}

	/**
	 * @return the idPrescription
	 */
	public long getIdPrescription() {
		return idPrescription;
	}

	/**
	 * @param idPrescription the idPrescription to set
	 */
	public void setIdPrescription(long idPrescription) {
		this.idPrescription = idPrescription;
	}

	/**
	 * @param medicationMap
	 *            the medicationMap to set
	 */
	public void setMedicationMap(Map<Integer, MedicationDTO> medicationMap) {
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
