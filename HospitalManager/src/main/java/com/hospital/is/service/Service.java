package com.hospital.is.service;

import java.util.Map;

public interface Service<DTO, Entity> {

	/**
	 * 
	 * @param id
	 * @param t
	 * @return
	 */
	DTO create(long id, DTO t);

	/**
	 * 
	 * @return
	 */
	Map<Long, DTO> getAll();

	/**
	 * 
	 * @param id
	 * @return
	 */
	DTO getById(long id);

	/**
	 * 
	 * @param t
	 * @param id
	 * @return
	 */
	DTO update(long id,DTO t);

	/**
	 * 
	 * @param id
	 * @return
	 */
	boolean delete(long id);
}
