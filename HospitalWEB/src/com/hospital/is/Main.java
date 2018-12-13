package com.hospital.is;

import java.util.Map;

import com.hospital.is.model.PatientDTO;
import com.hospital.is.service.PatientService;
import com.hospital.is.service.impl.PatientServiceImpl;

public class Main {

	public static void main(String[] args) {

//		AppointmentService appointmentService = new AppointmentServiceImpl();
		PatientService patientService = new PatientServiceImpl();

//		Map<Integer, AppointmentDTO> mapAppointment = appointmentService.getAll();
		Map<Integer, PatientDTO> mapPatient = patientService.getAll();

//		AppointmentDTO appointmentDTO = new AppointmentDTO();
//		AppointmentDTO appointmentDTO1 = new AppointmentDTO();
//
//		appointmentDTO.setDateTimeAppointment("02-07-2019");
//		appointmentDTO.setTypeAppointment("Some type of appointment");
//
//		appointmentDTO1.setDateTimeAppointment("02-07-2019");
//		appointmentDTO1.setTypeAppointment("Some type of appointment");

//		System.out.println("###" + appointmentDTO + "#####" + appointmentDTO1);
//		mapAppointment.put(1, appointmentDTO);

		System.out.println(mapPatient);
	}
}
