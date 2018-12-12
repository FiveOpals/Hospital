package com.hospital.is.model;

import java.util.Map;

public class MedicalFolder {
	private Integer id;
	private Map<Integer,Disease> diseaseMap;
	private Map<Integer,Appointment> appointment;

	
	
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
	 * @return the appointment
	 */
	public Map<Integer, Appointment> getAppointment() {
		return appointment;
	}

	public Map<Integer, Disease> getDiseaseMap() {
		return diseaseMap;
	}

	public void setDiseaseMap(Map<Integer, Disease> diseaseMap) {
		this.diseaseMap = diseaseMap;
	}

	public void setAppointment(Map<Integer, Appointment> appointment) {
		this.appointment = appointment;
	}
	
	

	@Override
	public String toString() {
		return "MedicalFolder [diseaseMap=" + diseaseMap + ", appointment=" + appointment + "]";
	}
	
}
