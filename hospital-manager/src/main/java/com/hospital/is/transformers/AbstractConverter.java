package com.hospital.is.transformers;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class AbstractConverter<Entity, DTO> {

	public abstract DTO toDTO(Entity entity);

	public abstract Entity toEntity(DTO DTO);

	public Map<Long, Entity> toMapEntity(Map<Long, DTO> mapDTO) {
		Map<Long, Entity> entityMap = new HashMap<Long, Entity>();

		for (Entry<Long, DTO> entry : mapDTO.entrySet()) {
			entityMap.put(entry.getKey(), toEntity(entry.getValue()));
		}

		return entityMap;
	}
	

	public Map<Long, DTO> toMapDTO(Map<Long, Entity> mapEntity) {
		Map<Long, DTO> dtoMap = new HashMap<>();

		for (Entry<Long, Entity> entry : mapEntity.entrySet()) {
			dtoMap.put(entry.getKey(), toDTO(entry.getValue()));
		}

		return dtoMap;
	}
}
