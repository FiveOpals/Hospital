package com.hospital.is;

import java.util.Map;

import com.hospital.is.model.AppointmentDTO;
import com.hospital.is.service.AppointmentService;
import com.hospital.is.service.impl.AppointmentServiceImpl;

public class Main {

	public static void main(String[] args) {

		AppointmentService appointmentService = new AppointmentServiceImpl();

		Map<Integer, AppointmentDTO> mapAppointment = appointmentService.getAll();

		AppointmentDTO appointmentDTO = new AppointmentDTO();
		AppointmentDTO appointmentDTO1 = new AppointmentDTO();

		appointmentDTO.setDateTimeAppointment("02-07-2019");
		appointmentDTO.setTypeAppointment("Some type of appointment");

		appointmentDTO1.setDateTimeAppointment("02-07-2019");
		appointmentDTO1.setTypeAppointment("Some type of appointment");

		System.out.println("###" + appointmentDTO + "#####" + appointmentDTO1);
		mapAppointment.put(1, appointmentDTO);

		System.out.println(mapAppointment.toString());
	}
}
