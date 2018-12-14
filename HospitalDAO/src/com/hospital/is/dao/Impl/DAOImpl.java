package com.hospital.is.dao.Impl;

import java.util.Map;

import com.hospital.is.dao.DAO;

public class DAOImpl<T> implements DAO<T> {

	protected Map<Long, T> dataSet;

	/**
	 * 
	 * @param dataSet
	 *            the constructor no params
	 */
	protected DAOImpl() {
		super();
	}

	/**
	 * 
	 * @param dataSet
	 *            the constructor
	 */
	public DAOImpl(Map<Long, T> dataSet) {
		this.dataSet = dataSet;
	}

	/**
	 * 
	 * @return
	 */
	public Map<Long, T> getDataSet() {
		return dataSet;
	}

	/**
	 * 
	 */
	@Override
	public T create(long id, T t) {
		dataSet.put((Long) id, t);
		Map<Long, T> tMap = dataSet;
		return tMap.get((Long) id);
	}

	/**
	 * 
	 */
	@Override
	public Map<Long, T> getAll() {
		return dataSet;
	}

	/**
	 * 
	 */
	@Override
	public T getById(long id) {
		return dataSet.get((Long) id);

	}

	/**
	 * 
	 */
	@Override
	public T update(long id, T t) {
		dataSet.put((Long) id, t);
		return dataSet.get((Long) id);
	}

	/**
	 * 
	 */
	@Override
	public boolean delete(long id) {
		return dataSet.remove((Long) id) != null ? true : false;
	}

}
