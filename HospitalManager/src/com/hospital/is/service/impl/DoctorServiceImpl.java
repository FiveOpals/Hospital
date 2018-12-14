/**
 * 
 */
package com.hospital.is.service.impl;

import java.util.Map;

import com.hospital.is.dao.DAO;
import com.hospital.is.dao.DoctorDAO;
import com.hospital.is.dao.Impl.DAOImpl;
import com.hospital.is.dao.Impl.DoctorDAOImpl;
import com.hospital.is.entity.Doctor;
import com.hospital.is.model.DoctorDTO;
import com.hospital.is.service.DoctorService;
import com.hospital.is.transformers.DoctorConverter;

/**
 * @author user001
 *
 */
public class DoctorServiceImpl extends ServiceImpl<DoctorDTO, Doctor> implements DoctorService {
	
	DAO<Doctor> dao = new DAOImpl<Doctor>();
	
	private DoctorDAO doctorDAO = new DoctorDAOImpl(); 
	
	@Override
	public Map<Long, DoctorDTO> getAll() {
		DoctorConverter doctorConverter = new DoctorConverter();
		return doctorConverter.toMapDTO(doctorDAO.getAll());
	}
	
}
