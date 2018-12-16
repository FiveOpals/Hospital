package com.hospital.is.model;

import java.util.Map;

public class MedicalFolderDTO {

	private long idMedicalFolder;

	private Map<Long, DiseaseDTO> diseaseMap;

	private Map<Long, PrescriptionDTO> prescriptionMap;

	private Map<Long, AppointmentDTO> appointmentMap;

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

	public Map<Long, DiseaseDTO> getDiseaseMap() {
		return diseaseMap;
	}

	public void setDiseaseMap(Map<Long, DiseaseDTO> diseaseMap) {
		this.diseaseMap = diseaseMap;
	}

	public Map<Long, PrescriptionDTO> getPrescriptionMap() {
		return prescriptionMap;
	}

	public void setPrescriptionMap(Map<Long, PrescriptionDTO> prescriptionMap) {
		this.prescriptionMap = prescriptionMap;
	}

	public Map<Long, AppointmentDTO> getAppointmentMap() {
		return appointmentMap;
	}

	public void setAppointmentMap(Map<Long, AppointmentDTO> appointmentMap) {
		this.appointmentMap = appointmentMap;
	}

	@Override
	public String toString() {
		return "MedicalFolderDTO [idMedicalFolder=" + idMedicalFolder + ", diseaseMap=" + diseaseMap
				+ ", prescriptionMap=" + prescriptionMap + ", appointmentMap=" + appointmentMap + "]";
	}

}
