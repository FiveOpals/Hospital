/**
 * 
 */
package com.hospital.is.dao.Impl;

import java.util.Map;

import com.hospital.is.dao.PrescriptionDAO;
import com.hospital.is.entity.Prescription;

/**
 * @author user001
 *
 */
public class PrescriptionDAOImpl extends DAOImpl<Prescription> implements PrescriptionDAO {

	public PrescriptionDAOImpl(Map<Integer, Prescription> dataSet) {
		super(dataSet);
	}

}
