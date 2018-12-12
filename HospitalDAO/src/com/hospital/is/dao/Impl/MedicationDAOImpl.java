/**
 * 
 */
package com.hospital.is.dao.Impl;

import java.util.Map;

import com.hospital.is.dao.MedicationDAO;
import com.hospital.is.entity.Medication;

/**
 * @author user001
 *
 */
public class MedicationDAOImpl  extends DAOImpl<Medication> implements MedicationDAO {

	public MedicationDAOImpl(Map<Integer, Medication> dataSet) {
		super(dataSet);
	}

	

}
