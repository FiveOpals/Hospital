package com.hospital.is.entity;

import java.util.Map;

public class Appointment {

	private String dateTimeAppointment;

	private String typeAppointment;

	private Doctor doctor;

	private Map<Long, Prescription> prescriptionMap;

	/**
	 * @return the dateTimeAppointment
	 */
	public String getDateTimeAppointment() {
		return dateTimeAppointment;
	}

	/**
	 * @param dateTimeAppointment
	 *            the dateTimeAppointment to set
	 */
	public void setDateTimeAppointment(String dateTimeAppointment) {
		this.dateTimeAppointment = dateTimeAppointment;
	}

	/**
	 * @return the typeAppointment
	 */
	public String getTypeAppointment() {
		return typeAppointment;
	}

	/**
	 * @param typeAppointment
	 *            the typeAppointment to set
	 */
	public void setTypeAppointment(String typeAppointment) {
		this.typeAppointment = typeAppointment;
	}

	/**
	 * @return the doctor
	 */
	public Doctor getDoctor() {
		return doctor;
	}

	/**
	 * @param doctor
	 *            the doctor to set
	 */
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Map<Long, Prescription> getPrescriptionMap() {
		return prescriptionMap;
	}

	public void setPrescriptionMap(Map<Long, Prescription> prescriptionMap) {
		this.prescriptionMap = prescriptionMap;
	}

	@Override
	public String toString() {
		return "Appointment [dateTimeAppointment=" + dateTimeAppointment + ", typeAppointment=" + typeAppointment
				+ ", doctor=" + doctor + ", prescriptionMap=" + prescriptionMap + "]";
	}

}