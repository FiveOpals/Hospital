package com.hospital.is.converters;

import java.util.HashMap;
import java.util.Map;

import com.hospital.is.entity.Appointment;
import com.hospital.is.model.AppointmentDTO;

public class AppointmentConverter {

	/**
	 * 
	 * @param appointment
	 * @return appointmentDTO
	 */
	static AppointmentDTO entityToDTO(Appointment appointment)
	{		
		AppointmentDTO appointmentDTO = new AppointmentDTO();
		
		appointmentDTO.setDateTimeAppointment(appointment.getDateTimeAppointment());
		appointmentDTO.setDoctor(DoctorConverter.entityToDTO(appointment.getDoctor()));
		appointmentDTO.setPatient(PatientConverter.entityToDTO(appointment.getPatient()));
		appointmentDTO.setPrescriptionMap(PrescriptionConverter.mapEntityToDTO(appointment.getPrescriptionMap()));
		appointmentDTO.setTypeAppointment(appointment.getTypeAppointment());

		return appointmentDTO;
	}

	/**
	 * 
	 * @param appointmentDTO
	 * @return appointment
	 */
	static Appointment DTOToEntity(AppointmentDTO appointmentDTO) {

		Appointment appointment = new Appointment();
		
		appointment.setDoctor(DoctorConverter.DTOToEntity(appointmentDTO.getDoctor()));
		appointment.setPatient(PatientConverter.DTOToEntity(appointmentDTO.getPatient()));
		appointment.setPrescriptionMap(PrescriptionConverter.mapDTOToEntity(appointmentDTO.getPrescriptionMap()));
		appointment.setDateTimeAppointment(appointmentDTO.getDateTimeAppointment());
		appointment.setTypeAppointment(appointmentDTO.getTypeAppointment());
		
		return appointment;

	}
	
	/**
	 * 
	 * @param MapAppointment
	 * @return MapAppointmentDTO
	 */
	static Map<Integer, AppointmentDTO> mapEntityToDTO(Map<Integer, Appointment> MapAppointment) {

		Map<Integer, AppointmentDTO> MapAppointmentDTO = new HashMap<Integer, AppointmentDTO>();

		for (Map.Entry<Integer, Appointment> entry : MapAppointment.entrySet()) {
			MapAppointmentDTO.put(entry.getKey(), AppointmentConverter.entityToDTO(entry.getValue()));
		}

		return MapAppointmentDTO;

	}

	/**
	 * 
	 * @param MapAppointmentDTO
	 * @return MapAppointment
	 */
	static Map<Integer, Appointment> mapDTOToEntity(Map<Integer, AppointmentDTO> MapAppointmentDTO) {


		Map<Integer, Appointment> MapAppointment = new HashMap<Integer, Appointment>();

		for (Map.Entry<Integer, AppointmentDTO> entry : MapAppointmentDTO.entrySet()) {
			MapAppointment.put(entry.getKey(), AppointmentConverter.DTOToEntity(entry.getValue()));
		}

		return MapAppointment;
	}


}
