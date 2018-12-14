package com.hospital.is.dao.Impl;

import com.hospital.is.StaticDatabase;
import com.hospital.is.dao.MedicalFolderDAO;
import com.hospital.is.entity.MedicalFolder;

/**
 * @author user001
 *
 */
public class MedicalFolderDAOImpl extends DAOImpl<MedicalFolder> implements MedicalFolderDAO {

	public MedicalFolderDAOImpl() {
		this.dataSet = StaticDatabase.medicalFolderMap;
	}

}
