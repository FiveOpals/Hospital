package com.hospital.is.dao;

import java.util.Map;

public interface DAO<T> {

	// Create
	T create(long id, T t);

	// Read
	Map<Integer, T> getAll();
	
	// Read by id
	T getById(long id);

	// Update
	T update(long id, T t);

}
