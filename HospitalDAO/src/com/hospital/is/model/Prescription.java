package com.hospital.is.model;

import java.util.Map;

public class Prescription {

	private Integer id;
	
	private Map<Integer, Medication> medicationlist;
	
	private String descriptionOfUse;

	
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the medicationlist
	 */
	public Map<Integer, Medication> getMedicationlist() {
		return medicationlist;
	}

	/**
	 * @param medicationlist the medicationlist to set
	 */
	public void setMedicationlist(Map<Integer, Medication> medicationlist) {
		this.medicationlist = medicationlist;
	}

	/**
	 * @return the descriptionOfUse
	 */
	public String getDescriptionOfUse() {
		return descriptionOfUse;
	}

	/**
	 * @param descriptionOfUse the descriptionOfUse to set
	 */
	public void setDescriptionOfUse(String descriptionOfUse) {
		this.descriptionOfUse = descriptionOfUse;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Prescription [id=" + id + ", medicationlist=" + medicationlist + ", descriptionOfUse="
				+ descriptionOfUse + "]";
	}
	
	
	
}
