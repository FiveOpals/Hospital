package com.hospital.is.dao.impl;

import com.hospital.is.StaticDatabase;
import com.hospital.is.dao.PatientDAO;
import com.hospital.is.entity.Patient;

/**
 * @author user001
 *
 */
public class PatientDAOImpl extends DAOImpl<Patient> implements PatientDAO {

	public PatientDAOImpl() {
		this.dataSet = StaticDatabase.patientMap;
	}

}
