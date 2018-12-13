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
	public Map<Integer, Entity> toMapEntity(Map<Integer, DTO> mapDTO) {
		Map<Integer, Entity> entityMap = new HashMap<Integer, Entity>();

		for (Map.Entry<Integer, DTO> entry : mapDTO.entrySet()) {
			entityMap.put(entry.getKey(), toEntity(entry.getValue()));
		}

		return entityMap;
	}

	/**
	 * 
	 * @param mapEntity
	 * @return dtoMap
	 */
	public Map<Integer, DTO> toMapDTO(Map<Integer, Entity> mapEntity) {
		Map<Integer, DTO> dtoMap = new HashMap<>();

		for (Map.Entry<Integer, Entity> entry : mapEntity.entrySet()) {
			dtoMap.put(entry.getKey(), toDTO(entry.getValue()));
		}

		return dtoMap;
	}
}