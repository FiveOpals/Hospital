package com.hospital.is.dao.Impl;

import java.util.Map;

import com.hospital.is.dao.DAO;

public class DAOImpl<T> implements DAO<T> {
	
	private Map<Integer,T> dataSet;
	
	/**
	 * 
	 * @param dataSet the constructor no params
	 */
	public DAOImpl() {
		super();
	}
	/**
	 * 
	 * @param dataSet the constructor
	 */
	public DAOImpl(Map<Integer, T> dataSet) {
		this.dataSet = dataSet;
	}

	/**
	 * 
	 * @return
	 */
	public Map<Integer,T> getDataSet(){
		return dataSet;
	}
	
	/**
	 * 
	 */
	@Override
	public T create(long id ,T t) {
		dataSet.put((int) id,t);
		Map<Integer,T> tMap = dataSet;
		return tMap.get((int)id);
	}

	/**
	 * 
	 */
	@Override
	public Map<Integer, T> getAll() {
		return dataSet;
	}

	/**
	 * 
	 */
	@Override
	public T getById(long id) {
		return dataSet.get((int)id);

	}

	/**
	 * 
	 */
	@Override
	public T update(long id, T t) {
		dataSet.put((int)id, t);
		return dataSet.get((int)id);
	}
	
	/**
	 * 
	 */
	@Override
	public boolean delete(long id) {
		return dataSet.remove((int)id)== null ? true :false;
	
	}

}
