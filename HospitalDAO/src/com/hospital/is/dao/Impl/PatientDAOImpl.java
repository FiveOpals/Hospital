package com.hospital.is.dao.Impl;

import java.util.Map;

import com.hospital.is.dao.PatientDAO;
import com.hospital.is.model.Patient;

/**
 * @author user001
 *
 */
public class PatientDAOImpl extends DAOImpl<Patient> implements PatientDAO  {

	public PatientDAOImpl(Map<Integer, Patient> dataSet) {
		super(dataSet);
	}

}
