/**
 * 
 */
package com.hospital.is.dao.impl;

import java.util.Map;

import com.hospital.is.dao.MedicationDAO;
import com.hospital.is.entity.Medication;

/**
 * @author user001
 *
 */
public class MedicationDAOImpl extends DAOImpl<Medication> implements MedicationDAO {

	private MedicationDAOImpl(Map<Integer, Medication> dataSet) {
		//TODO fill medication dataset
		dataSet = null;
	}

}
