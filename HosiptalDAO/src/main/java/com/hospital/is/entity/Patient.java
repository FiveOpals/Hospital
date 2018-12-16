package com.hospital.is.entity;

public class Patient extends Person {

	private Long idPatient;
	private MedicalFolder medicalFolder;

	

	public Long getIdPatient() {
		return idPatient;
	}

	public void setIdPatient(Long idPatient) {
		this.idPatient = idPatient;
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
		return "Patient " + super.toString() + " [medicalFolder=" + medicalFolder + "]\n";
	}

}
