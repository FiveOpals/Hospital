package com.hospital.is.transformers;


import com.hospital.is.entity.Doctor;
import com.hospital.is.model.DoctorDTO;

public class DoctorConverter extends AbstractConverter<Doctor, DoctorDTO> {

	@Override
	public DoctorDTO toDTO(Doctor entity) {
		DoctorDTO doctorDTO = new DoctorDTO();
		doctorDTO.setAddress(entity.getAddress());
		doctorDTO.setBirthDate(entity.getBirthDate());
		doctorDTO.setFirstName(entity.getFirstName());
		doctorDTO.setLastName(entity.getLastName());
		doctorDTO.setPhone(entity.getPhone());
		doctorDTO.setRegistrationNumber(entity.getRegistrationNumber());
		doctorDTO.setSpecialite(entity.getSpecialite());

		return doctorDTO;
	}

	@Override
	public Doctor toEntity(DoctorDTO DTO) {
		Doctor doctor = new Doctor();
		doctor.setAddress(DTO.getAddress());
		doctor.setBirthDate(DTO.getBirthDate());
		doctor.setFirstName(DTO.getFirstName());
		doctor.setLastName(DTO.getLastName());
		doctor.setPhone(DTO.getPhone());
		doctor.setRegistrationNumber(DTO.getRegistrationNumber());
		doctor.setSpecialite(DTO.getSpecialite());
		return doctor;
	}

}
