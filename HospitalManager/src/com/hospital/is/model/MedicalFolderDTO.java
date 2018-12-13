package com.hospital.is.model;

import java.util.Map;

public class MedicalFolderDTO {

	private long idMedicalFolder;

	private Map<Integer, DiseaseDTO> diseaseMap;

	private Map<Integer, PrescriptionDTO> prescriptionMap;

	private Map<Integer, AppointmentDTO> appointmentMap;

	/**
	 * @return the idMedicalFolder
	 */
	public long getIdMedicalFolder() {
		return idMedicalFolder;
	}

	/**
	 * @param idMedicalFolder
	 *            the idMedicalFolder to set
	 */
	public void setIdMedicalFolder(long idMedicalFolder) {
		this.idMedicalFolder = idMedicalFolder;
	}

	/**
	 * @return the diseaseMap
	 */
	public Map<Integer, DiseaseDTO> getDiseaseMap() {
		return diseaseMap;
	}

	/**
	 * @param diseaseMap
	 *            the diseaseMap to set
	 */
	public void setDiseaseMap(Map<Integer, DiseaseDTO> diseaseMap) {
		this.diseaseMap = diseaseMap;
	}

	/**
	 * @return the prescriptionMap
	 */
	public Map<Integer, PrescriptionDTO> getPrescriptionMap() {
		return prescriptionMap;
	}

	/**
	 * @param prescriptionMap
	 *            the prescriptionMap to set
	 */
	public void setPrescriptionMap(Map<Integer, PrescriptionDTO> prescriptionMap) {
		this.prescriptionMap = prescriptionMap;
	}

	/**
	 * @return the appointmentMap
	 */
	public Map<Integer, AppointmentDTO> getAppointmentMap() {
		return appointmentMap;
	}

	/**
	 * @param appointmentMap
	 *            the appointmentMap to set
	 */
	public void setAppointmentMap(Map<Integer, AppointmentDTO> appointmentMap) {
		this.appointmentMap = appointmentMap;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MedicalFolderDTO [idMedicalFolder=" + idMedicalFolder + ", diseaseMap=" + diseaseMap
				+ ", prescriptionMap=" + prescriptionMap + ", appointmentMap=" + appointmentMap + "]";
	}

	
}
