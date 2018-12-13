package com.hospital.is.model;

public class PatientDTO extends PersonDTO  {

	private long idMedicalFolder;
	
	private MedicalFolderDTO medicalFolder;

	/**
	 * @return the idMedicalFolder
	 */
	public long getIdMedicalFolder() {
		return idMedicalFolder;
	}

	/**
	 * @param idMedicalFolder the idMedicalFolder to set
	 */
	public void setIdMedicalFolder(long idMedicalFolder) {
		this.idMedicalFolder = idMedicalFolder;
	}

	/**
	 * @return the medicalFolder
	 */
	public MedicalFolderDTO getMedicalFolder() {
		return medicalFolder;
	}

	/**
	 * @param medicalFolder
	 *            the medicalFolder to set
	 */
	public void setMedicalFolder(MedicalFolderDTO medicalFolder) {
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
