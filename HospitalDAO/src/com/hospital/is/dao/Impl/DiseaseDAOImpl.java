package com.hospital.is.dao.Impl;

import java.util.Map;

import com.hospital.is.dao.DiseaseDAO;
import com.hospital.is.entity.Disease;;

/**
 * @author user001
 *
 */
public class DiseaseDAOImpl extends DAOImpl<Disease> implements DiseaseDAO {

	public DiseaseDAOImpl(Map<Long, Disease> dataSet) {
		super(dataSet);
		}

	
}
