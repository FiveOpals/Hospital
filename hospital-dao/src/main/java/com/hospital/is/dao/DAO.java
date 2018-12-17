package com.hospital.is.dao;

import java.util.Map;

public interface DAO<Entity> {

	Entity create(Entity entity);

	Map<Long, Entity> getAll();

	Entity getById(long id);

	Entity update(Entity entity, long id);

	void delete(long id);
}
