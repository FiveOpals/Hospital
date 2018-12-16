package com.hospital.is.entity;

import java.util.Map;

public class MedicalFolder {

	private Map<Long, Disease> diseaseMap;

	private Map<Long, Prescription> prescriptionMap;

	private Map<Long, Appointment> appointmentMap;

	public Map<Long, Disease> getDiseaseMap() {
		return diseaseMap;
	}

	public void setDiseaseMap(Map<Long, Disease> diseaseMap) {
		this.diseaseMap = diseaseMap;
	}

	public Map<Long, Prescription> getPrescriptionMap() {
		return prescriptionMap;
	}

	public void setPrescriptionMap(Map<Long, Prescription> prescriptionMap) {
		this.prescriptionMap = prescriptionMap;
	}

	public Map<Long, Appointment> getAppointmentMap() {
		return appointmentMap;
	}

	public void setAppointmentMap(Map<Long, Appointment> appointmentMap) {
		this.appointmentMap = appointmentMap;
	}

	@Override
	public String toString() {
		return "MedicalFolder [diseaseMap=" + diseaseMap + ", prescriptionMap=" + prescriptionMap + ", appointmentMap="
				+ appointmentMap + "]";
	}

}
