package com.hospital.is.entity;

import java.util.Map;

public class Prescription {

	private Long idPrescription;

	private Map<Long, Medication> medicationMap;

	private String descriptionOfUse;

	public Long getIdPrescription() {
		return idPrescription;
	}

	public void setIdPrescription(Long idPrescription) {
		this.idPrescription = idPrescription;
	}

	public Map<Long, Medication> getMedicationMap() {
		return medicationMap;
	}

	public void setMedicationMap(Map<Long, Medication> medicationMap) {
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Prescription [idPrescription=" + idPrescription + ", medicationMap=" + medicationMap
				+ ", descriptionOfUse=" + descriptionOfUse + "]";
	}

}
