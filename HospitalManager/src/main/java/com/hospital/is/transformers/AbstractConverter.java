/**
 * 
 */
package com.hospital.is.transformers;

import java.util.HashMap;
import java.util.Map;

/**
 * @author user001
 *
 */
public abstract class AbstractConverter<Entity, DTO> {

	/**
	 * 
	 * @param entity
	 * @return DTO
	 */
	public abstract DTO toDTO(Entity entity);

	/**
	 * 
	 * @param DTO
	 * @return Entity
	 */
	public abstract Entity toEntity(DTO DTO);

	/**
	 * 
	 * @param mapDTO
	 * @return entityMap
	 */
	public Map<Long, Entity> toMapEntity(Map<Long, DTO> mapDTO) {
		Map<Long, Entity> entityMap = new HashMap<Long, Entity>();

		for (Map.Entry<Long, DTO> entry : mapDTO.entrySet()) {
			entityMap.put(entry.getKey(), toEntity(entry.getValue()));
		}

		return entityMap;
	}

	/**
	 * 
	 * @param mapEntity
	 * @return dtoMap
	 */
	public Map<Long, DTO> toMapDTO(Map<Long, Entity> mapEntity) {
		Map<Long, DTO> dtoMap = new HashMap<>();

		for (Map.Entry<Long, Entity> entry : mapEntity.entrySet()) {
			dtoMap.put(entry.getKey(), toDTO(entry.getValue()));
		}

		return dtoMap;
	}
}