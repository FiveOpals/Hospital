package com.hospital.is;

import java.util.HashMap;
import java.util.Map;

import com.hospital.is.model.AppointmentDTO;
import com.hospital.is.model.MedicalFolderDTO;
import com.hospital.is.model.PatientDTO;
import com.hospital.is.service.AppointmentService;
import com.hospital.is.service.impl.AppointmentServiceImpl;

public class Main {

	public static void main(String[] args) {

		AppointmentService appointmentService = new AppointmentServiceImpl();

		Map<Integer, PatientDTO> mapPatient = new HashMap<Integer, PatientDTO>();
		Map<Integer, AppointmentDTO> appointmentMap = appointmentService.getAll();

		MedicalFolderDTO medicalFolderDTO = new MedicalFolderDTO();
		medicalFolderDTO.setAppointmentMap(appointmentMap);

		PatientDTO patientDTO = new PatientDTO();
		patientDTO.setIdPerson(11);
		patientDTO.setFirstName("Majda");
		patientDTO.setLastName("AMCHICHI");
		patientDTO.setBirthDate("12/09/1994");
		patientDTO.setMedicalFolder(medicalFolderDTO);

		System.out.println("###" + patientDTO + "###");
		mapPatient.put(1, patientDTO);
		System.out.println(mapPatient);
	}
}
