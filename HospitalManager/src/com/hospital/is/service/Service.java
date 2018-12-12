package com.hospital.is.service;

import java.util.Map;

public interface Service<T> {
	
	T create(T t);

	Map<Integer ,T> getAll();

	T getById(long id);
	
	T update(T t, long id);

}
