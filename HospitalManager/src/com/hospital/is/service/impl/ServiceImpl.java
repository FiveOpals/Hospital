package com.hospital.is.service.impl;

import java.util.Map;

import com.hospital.is.dao.DAO;
import com.hospital.is.dao.Impl.DAOImpl;
import com.hospital.is.service.Service;

public class ServiceImpl<DTO, Entity> implements Service<DTO, Entity> {

	/**
	 * 
	 */
	@Override
	public DTO create(long id, DTO t) {
		return null;
	}

	/**
	 * 
	 */
	@Override
	public Map<Integer, DTO> getAll() {
		return null;
	}

	/**
	 * 
	 */
	@Override
	public DTO getById(long id) {
		return null;
	}

	/**
	 * 
	 */
	@Override
	public DTO update(DTO t, long id) {
		return null;
	}

	/**
	 * 
	 */
	@Override
	public boolean delete(long id) {
		return false;
	}

}
