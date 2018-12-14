/**
 * 
 */
package com.hospital.is.dao.Impl;

import com.hospital.is.StaticDatabase;
import com.hospital.is.dao.DoctorDAO;
import com.hospital.is.entity.Doctor;

/**
 * @author user001
 *
 */
public class DoctorDAOImpl extends DAOImpl<Doctor> implements DoctorDAO {

	public DoctorDAOImpl() {
		this.dataSet = StaticDatabase.doctorMap;
	}

}
