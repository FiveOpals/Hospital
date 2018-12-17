package com.hospital.is.service;

import java.util.List;

public interface Service<T> {

	T create(T t);

	List<T> getAll();

	T getById(long id);

	T update(T t, long id);

	void delete(long id);
}
