package com.hospital.is.dao.Impl;

import java.util.Map;

import com.hospital.is.dao.MedicalFolderDAO;
import com.hospital.is.model.MedicalFolder;

/**
 * @author user001
 *
 */
public class MedicalFolderDAOImpl extends DAOImpl<MedicalFolder> implements MedicalFolderDAO {

	public MedicalFolderDAOImpl(Map<Integer, MedicalFolder> dataSet) {
		super(dataSet);
	}

}
