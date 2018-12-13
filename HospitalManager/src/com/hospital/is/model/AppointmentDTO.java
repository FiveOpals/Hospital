package com.hospital.is.model;

import java.util.Map;

public class AppointmentDTO {

	private long idAppointment;

	private String dateTimeAppointment;

	private String typeAppointment;

	private DoctorDTO doctor;

	private Map<Integer, PrescriptionDTO> prescriptionMap;

	/**
	 * @return the idAppointment
	 */
	public long getIdAppointment() {
		return idAppointment;
	}

	/**
	 * @param idAppointment
	 *            the idAppointment to set
	 */
	public void setIdAppointment(long idAppointment) {
		this.idAppointment = idAppointment;
	}

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
	public DoctorDTO getDoctor() {
		return doctor;
	}

	/**
	 * @param doctor
	 *            the doctor to set
	 */
	public void setDoctor(DoctorDTO doctor) {
		this.doctor = doctor;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AppointmentDTO [idAppointment=" + idAppointment + ", dateTimeAppointment=" + dateTimeAppointment
				+ ", typeAppointment=" + typeAppointment + ", doctor=" + doctor + ", prescriptionMap=" + prescriptionMap
				+ "]";
	}

}
