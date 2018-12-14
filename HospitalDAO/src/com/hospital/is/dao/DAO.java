package com.hospital.is.dao;

import java.util.Map;

public interface DAO<T> {

	/**
	 * 
	 * @param id
	 * @param t
	 * @return the created object T
	 */
	T create(long id, T t);

	/**
	 * 
	 * @return a Map <Integer, T>
	 */
	Map<Long, T> getAll();

	/**
	 * 
	 * @param id
	 * @return the object created T
	 */
	T getById(long id);

	/**
	 * 
	 * @param id
	 * @param t
	 * @return update the object passed in the parameters
	 */
	T update(long id, T t);

	/**
	 * 
	 * @param id
	 * @return delete the object
	 */
	boolean delete(long id);

}
