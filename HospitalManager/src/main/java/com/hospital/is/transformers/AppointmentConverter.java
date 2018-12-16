package com.hospital.is.transformers;


import com.hospital.is.entity.Appointment;
import com.hospital.is.model.AppointmentDTO;

public class AppointmentConverter extends AbstractConverter<Appointment, AppointmentDTO> {

	DoctorConverter doctorConverter = new DoctorConverter();
	PatientConverter patientConverter = new PatientConverter();

	@Override
	public AppointmentDTO toDTO(Appointment entity) {
		AppointmentDTO appointmentDTO = new AppointmentDTO();
		appointmentDTO.setDateTimeAppointment(entity.getDateTimeAppointment());
		appointmentDTO.setDoctor(doctorConverter.toDTO(entity.getDoctor()));
		appointmentDTO.setTypeAppointment(entity.getTypeAppointment());
		return appointmentDTO;

	}

	@Override
	public Appointment toEntity(AppointmentDTO DTO) {
		Appointment appointment = new Appointment();
		appointment.setDateTimeAppointment(DTO.getDateTimeAppointment());
		appointment.setDoctor(doctorConverter.toEntity(DTO.getDoctor()));	
		appointment.setTypeAppointment(DTO.getTypeAppointment());
		return appointment;
	}
	
	

}
