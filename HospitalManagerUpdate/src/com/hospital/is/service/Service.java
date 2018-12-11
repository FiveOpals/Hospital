package com.hospital.is.service;

import java.util.Map;

public interface Service<T> {
	
	//Create
	
	T create(T t);
	
	//Read

	Map<Integer ,T> getAll();
	
	T getById(long id);

	// Update
	T update(long id,T t);

	//Delete
	//	boolean delete(long id);
}
