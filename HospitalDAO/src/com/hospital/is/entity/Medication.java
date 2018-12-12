package com.hospital.is.model;

public class Medication {

	private Integer id;
	
	private String medicationName;

	private Integer quantity;
	
	private String durationOfUse;
	
	private String instrutionOfUse;

	
	
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
	 * @return the medicationName
	 */
	public String getMedicationName() {
		return medicationName;
	}

	/**
	 * @param medicationName the medicationName to set
	 */
	public void setMedicationName(String medicationName) {
		this.medicationName = medicationName;
	}

	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the durationOfUse
	 */
	public String getDurationOfUse() {
		return durationOfUse;
	}

	/**
	 * @param durationOfUse the durationOfUse to set
	 */
	public void setDurationOfUse(String durationOfUse) {
		this.durationOfUse = durationOfUse;
	}

	/**
	 * @return the instrutionOfUse
	 */
	public String getInstrutionOfUse() {
		return instrutionOfUse;
	}

	/**
	 * @param instrutionOfUse the instrutionOfUse to set
	 */
	public void setInstrutionOfUse(String instrutionOfUse) {
		this.instrutionOfUse = instrutionOfUse;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Medication [id=" + id + ", medicationName=" + medicationName + ", quantity=" + quantity
				+ ", durationOfUse=" + durationOfUse + ", instrutionOfUse=" + instrutionOfUse + "]";
	}
	
	
	
}
