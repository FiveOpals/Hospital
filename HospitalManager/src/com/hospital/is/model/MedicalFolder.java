package com.hospital.is.model;

import java.util.Map;

public class MedicalFolder {

	private Map<String, Disease> diseaseList;
	private String id;

	/**
	 * @return the diseaseList
	 */
	public Map<String,Disease> getdiseaseList() {
		return diseaseList;
	}

	/**
	 * @param diseaseList the diseaseList to set
	 */
	public void setDiseaseList(Map<String,Disease> diseaseList) {
		this.diseaseList = diseaseList;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MedicalFolder [diseaseList=" + diseaseList + "]";
	}

	/**
	 * @return id 
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
