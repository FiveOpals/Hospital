/**
 * 
 */
package com.hospital.is.dao.impl;

import java.util.Map;

import com.hospital.is.dao.PrescriptionDAO;
import com.hospital.is.entity.Prescription;

/**
 * @author user001
 *
 */
public class PrescriptionDAOImpl extends DAOImpl<Prescription> implements PrescriptionDAO {

	private PrescriptionDAOImpl(Map<Integer, Prescription> dataSet) {
		// TODO fill medication dataset
		dataSet = null;

	}

}
