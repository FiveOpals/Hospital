package com.hospital.is.model;

public class Patient extends Person {

	private Integer id;
	private MedicalFolder medicalFolder;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 * @return the medicalFolder
	 */
	public MedicalFolder getMedicalFolder() {
		return medicalFolder;
	}

	/**
	 * @param medicalFolder the medicalFolder to set
	 */
	public void setMedicalFolder(MedicalFolder medicalFolder) {
		this.medicalFolder = medicalFolder;
	}

	
	
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Patient " + super.toString() + " [medicalFolder=" + medicalFolder + "]";
	}

}
