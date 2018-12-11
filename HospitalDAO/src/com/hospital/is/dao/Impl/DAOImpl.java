package com.hospital.is.dao.Impl;

import java.util.Map;

import com.hospital.is.dao.DAO;

public class DAOImpl<T> implements DAO<T> {
	
	private Map<Integer,T> dataSet;
	
	public DAOImpl(Map<Integer, T> dataSet) {
		this.dataSet = dataSet;
	}

	
	public Map<Integer,T> getDataSet(){
		return dataSet;
	}
	
	@Override
	public T create(long id ,T t) {
		dataSet.put((int) id,t);
		Map<Integer,T> tMap = dataSet;
		return tMap.get((int)id);
	}

	@Override
	public Map<Integer, T> getAll() {
		return dataSet;
	}

	@Override
	public T getById(long id) {
		return dataSet.get((int)id);

	}

	@Override
	public T update(long id, T t) {
		dataSet.put((int)id, t);
		return dataSet.get((int)id);
	}

}
