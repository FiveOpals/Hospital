/**
 * 
 */
package com.hospital.is.dao.Impl;

import java.util.Map;

import com.hospital.is.dao.DoctorDAO;
import com.hospital.is.entity.Doctor;

/**
 * @author user001
 *
 */
public class DoctorDAOImpl extends DAOImpl<Doctor> implements DoctorDAO {

	public DoctorDAOImpl(Map<Integer, Doctor> dataSet) {
		super(dataSet);
	}

}
