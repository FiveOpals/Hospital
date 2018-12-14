package com.hospital.is.entity;


import java.util.Map;

public class MedicalFolder {

	private Map<Integer, Disease> diseaseMap;
	
	private Map<Integer, Prescription> prescriptionMap;
	
	private Map<Integer, Appointment> appointmentMap;

	public Map<Integer, Disease> getDiseaseMap() {
		return diseaseMap;
	}

	public void setDiseaseMap(Map<Integer, Disease> diseaseMap) {
		this.diseaseMap = diseaseMap;
	}

	public Map<Integer, Prescription> getPrescriptionMap() {
		return prescriptionMap;
	}

	public void setPrescriptionMap(Map<Integer, Prescription> prescriptionMap) {
		this.prescriptionMap = prescriptionMap;
	}

	public Map<Integer, Appointment> getAppointmentMap() {
		return appointmentMap;
	}

	public void setAppointmentMap(Map<Integer, Appointment> appointmentMap) {
		this.appointmentMap = appointmentMap;
	}

	@Override
	public String toString() {
		return "MedicalFolder [diseaseMap=" + diseaseMap + ", prescriptionMap=" + prescriptionMap + ", appointmentMap="
				+ appointmentMap + "]";
	}

	
	
}
