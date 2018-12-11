/**
 * 
 */
package com.hospital.is.dao.Impl;

import com.hospital.is.model.Doctor;

import java.util.Map;

import com.hospital.is.dao.DoctorDAO;

/**
 * @author user001
 *
 */
public class DoctorDAOImpl extends DAOImpl<Doctor> implements DoctorDAO {

	public DoctorDAOImpl(Map<Integer, Doctor> dataSet) {
		super(dataSet);
	}

}
