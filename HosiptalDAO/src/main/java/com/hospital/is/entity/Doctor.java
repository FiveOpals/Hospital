package com.hospital.is.entity;

public class Doctor extends Person {

	private Long registrationNumber;

	private String specialite;

	/**
	 * @return the registrationNumber
	 */
	public Long getRegistrationNumber() {
		return registrationNumber;
	}

	/**
	 * @param registrationNumber the registrationNumber to set
	 */
	public void setRegistrationNumber(Long registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	/**
	 * @return the specialite
	 */
	public String getSpecialite() {
		return specialite;
	}

	/**
	 * @param specialite the specialite to set
	 */
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Doctor [registrationNumber=" + registrationNumber + super.toString() + " , specialite=" + specialite
				+ "]";

	}

}
