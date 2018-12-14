/**
 * 
 */
package com.hospital.is.dao.Impl;

import java.util.Map;

import com.hospital.is.StaticDatabase;
import com.hospital.is.dao.DoctorDAO;
import com.hospital.is.entity.Doctor;

/**
 * @author user001
 *
 */
public class DoctorDAOImpl extends DAOImpl<Doctor> implements DoctorDAO {

	private DoctorDAOImpl(Map<Integer, Doctor> dataSet) {
		//TODO fill doctor dataset
		dataSet=null;
	}

}
