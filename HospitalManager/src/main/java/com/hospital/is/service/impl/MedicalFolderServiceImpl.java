package com.hospital.is.service.impl;

import java.util.Map;

import com.hospital.is.dao.DAO;
import com.hospital.is.dao.MedicalFolderDAO;
import com.hospital.is.dao.impl.MedicalFolderDAOImpl;
import com.hospital.is.entity.MedicalFolder;
import com.hospital.is.model.MedicalFolderDTO;
import com.hospital.is.service.MedicalFolderService;
import com.hospital.is.transformers.MedicalFolderConverter;

/**
 * @author user001
 *
 */
public class MedicalFolderServiceImpl extends ServiceImpl<MedicalFolderDTO, MedicalFolder>
		implements MedicalFolderService {

	DAO<MedicalFolder> dao = new MedicalFolderDAOImpl();
	private MedicalFolderDAO medicalFolderDAO = new MedicalFolderDAOImpl();

	@Override
	public Map<Long, MedicalFolderDTO> getAll() {
		MedicalFolderConverter medicalFolderConverter = new MedicalFolderConverter();
		return medicalFolderConverter.toMapDTO(medicalFolderDAO.getAll());
	}
}
