package com.hospital.is.transformers;

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
	static AppointmentDTO entityToDTO(Appointment appointment) {
		AppointmentDTO appointmentDTO = new AppointmentDTO();
		appointmentDTO.setDateTimeAppointment(appointment.getDateTimeAppointment());
		appointmentDTO.setDoctor(appointment.getDoctor());
		appointmentDTO.setPatient(appointment.getPatient());
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
		appointment.setDateTimeAppointment(appointmentDTO.getDateTimeAppointment());
		appointment.setDoctor(appointmentDTO.getDoctor());
		appointment.setPatient(appointmentDTO.getPatient());
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
