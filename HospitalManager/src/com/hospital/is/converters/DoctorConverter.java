package com.hospital.is.converters;

import java.util.HashMap;
import java.util.Map;

import com.hospital.is.entity.Doctor;
import com.hospital.is.model.DoctorDTO;

public class DoctorConverter{

	/**
	 * 
	 * @param doctor
	 * @return doctorDTO
	 */
	static DoctorDTO entityToDTO(Doctor doctor) {
		DoctorDTO doctorDTO = new DoctorDTO();
		doctorDTO.setAddress(doctor.getAddress());
		doctorDTO.setBirthDate(doctor.getBirthDate());
		doctorDTO.setFirstName(doctor.getFirstName());
		doctorDTO.setLastName(doctor.getLastName());
		doctorDTO.setPhone(doctor.getPhone());
		doctorDTO.setRegistrationNumber(doctor.getRegistrationNumber());
		doctorDTO.setSpecialite(doctor.getSpecialite());

		return doctorDTO;

	}

	/**
	 * 
	 * @param doctorDTO
	 * @return doctor
	 */
	static Doctor DTOToEntity(DoctorDTO doctorDTO) {

		Doctor doctor = new Doctor();
		doctor.setAddress(doctorDTO.getAddress());
		doctor.setBirthDate(doctorDTO.getBirthDate());
		doctor.setFirstName(doctorDTO.getFirstName());
		doctor.setLastName(doctorDTO.getLastName());
		doctor.setPhone(doctorDTO.getPhone());
		doctor.setRegistrationNumber(doctorDTO.getRegistrationNumber());
		doctor.setSpecialite(doctorDTO.getSpecialite());
		return doctor;

	}

	/**
	 * 
	 * @param MapDoctor
	 * @return MapDoctorDTO
	 */
	static Map<Integer, DoctorDTO> mapEntityToDTO(Map<Integer, Doctor> MapDoctor) {

		Map<Integer, DoctorDTO> MapDoctorDTO = new HashMap<Integer, DoctorDTO>();

		for (Map.Entry<Integer, Doctor> entry : MapDoctor.entrySet()) {
			MapDoctorDTO.put(entry.getKey(), DoctorConverter.entityToDTO(entry.getValue()));
		}

		return MapDoctorDTO;

	}

	/**
	 * 
	 * @param MapDoctorDTO
	 * @return MapDoctor
	 */
	static Map<Integer, Doctor> mapDTOToEntity(Map<Integer, DoctorDTO> MapDoctorDTO) {

		Map<Integer, Doctor> MapDoctor = new HashMap<Integer, Doctor>();

		for (Map.Entry<Integer, DoctorDTO> entry : MapDoctorDTO.entrySet()) {
			MapDoctor.put(entry.getKey(), DoctorConverter.DTOToEntity(entry.getValue()));
		}

		return MapDoctor;
	}

}
