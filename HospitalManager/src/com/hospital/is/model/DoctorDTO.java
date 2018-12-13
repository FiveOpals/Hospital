package com.hospital.is.model;

public class DoctorDTO extends PersonDTO {

	private long idDoctor;

	private Integer registrationNumber;

	private String specialite;

	/**
	 * @return the idDoctor
	 */
	public long getIdDoctor() {
		return idDoctor;
	}

	/**
	 * @param idDoctor
	 *            the idDoctor to set
	 */
	public void setIdDoctor(long idDoctor) {
		this.idDoctor = idDoctor;
	}

	/**
	 * @return the registrationNumber
	 */
	public Integer getRegistrationNumber() {
		return registrationNumber;
	}

	/**
	 * @param registrationNumber
	 *            the registrationNumber to set
	 */
	public void setRegistrationNumber(Integer registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	/**
	 * @return the specialite
	 */
	public String getSpecialite() {
		return specialite;
	}

	/**
	 * @param specialite
	 *            the specialite to set
	 */
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

}
