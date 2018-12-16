/**
 * 
 */
package com.hospital.is.service.impl;

import com.hospital.is.dao.DAO;
import com.hospital.is.dao.impl.AppointmentDAOImpl;
import com.hospital.is.entity.Appointment;
import com.hospital.is.model.AppointmentDTO;
import com.hospital.is.service.AppointmentService;
import com.hospital.is.transformers.AppointmentConverter;

/**
 * @author user001
 *
 */
public class AppointmentServiceImpl extends ServiceImpl<AppointmentDTO, Appointment> implements AppointmentService {

	DAO<Appointment> dao = new AppointmentDAOImpl();

	/**
	 * 
	 */
	@Override
	public AppointmentDTO create(long id, AppointmentDTO appointmentDTO) {

		AppointmentConverter appointmentConverter = new AppointmentConverter();

		Appointment appointment = appointmentConverter.toEntity(appointmentDTO);
		Appointment appointmentDto = dao.create(id, appointment);
		return appointmentConverter.toDTO(appointmentDto);
	}

	/**
	 * 
	 */
	@Override
	public AppointmentDTO getById(long id) {
		AppointmentConverter appointmentConverter = new AppointmentConverter();
		Appointment appointment = dao.getById(id);
		return appointmentConverter.toDTO(appointment);

	}

	/**
	 * 
	 * @param patientDTO
	 * @param id
	 * @return
	 */
	@Override
	public AppointmentDTO update(long id,AppointmentDTO appointmentDTO) {
		AppointmentConverter appointmentConverter = new AppointmentConverter();
		Appointment appointment = appointmentConverter.toEntity(appointmentDTO);
		Appointment appointmentDto = dao.update(id, appointment);
		return appointmentConverter.toDTO(appointmentDto);
	}

	@Override
	public boolean delete(long id) {
		return dao.delete(id);

	}
}
