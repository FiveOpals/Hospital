package com.hospital.is.dao.impl;

import com.hospital.is.StaticDatabase;
import com.hospital.is.dao.DiseaseDAO;
import com.hospital.is.entity.Disease;;

/**
 * @author user001
 *
 */
public class DiseaseDAOImpl extends DAOImpl<Disease> implements DiseaseDAO {

	public DiseaseDAOImpl() {
		dataSet=StaticDatabase.diseaseMap;

		}

	
}
