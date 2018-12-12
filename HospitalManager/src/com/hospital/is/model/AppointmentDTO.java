package com.hospital.is.model;

import java.util.Map;

import com.hospital.is.entity.Doctor;
import com.hospital.is.entity.Patient;
import com.hospital.is.entity.Prescription;

public class AppointmentDTO {

	@Override
	public String toString() {
		return "AppointmentDTO [dateTimeAppointment=" + dateTimeAppointment + ", typeAppointment=" + typeAppointment
				+ ", doctor=" + doctor + ", patient=" + patient + ", prescriptionMap=" + prescriptionMap + "]";
	}

	private String dateTimeAppointment;

	private String typeAppointment;

	private DoctorDTO doctor;

	private PatientDTO patient;

	private Map<Integer, PrescriptionDTO> prescriptionMap;

	public String getDateTimeAppointment() {
		return dateTimeAppointment;
	}

	public void setDateTimeAppointment(String dateTimeAppointment) {
		this.dateTimeAppointment = dateTimeAppointment;
	}

	public String getTypeAppointment() {
		return typeAppointment;
	}

	public void setTypeAppointment(String typeAppointment) {
		this.typeAppointment = typeAppointment;
	}
	

	public Map<Integer, PrescriptionDTO> getPrescriptionMap() {
		return prescriptionMap;
	}

	public void setPrescriptionMap(Map<Integer, PrescriptionDTO> prescriptionMap) {
		this.prescriptionMap = prescriptionMap;
	}

	public DoctorDTO getDoctor() {
		return doctor;
	}

	public void setDoctor(DoctorDTO doctor) {
		this.doctor = doctor;
	}

	public PatientDTO getPatient() {
		return patient;
	}

	public void setPatient(PatientDTO patient) {
		this.patient = patient;
	}
	
	

	

	
	
	

}
