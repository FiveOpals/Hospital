package com.hospital.is.model;

public class Appointment {
	
	private Integer id;
	private String sujet;
    private String date;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Appointment [id=" + id + ", sujet=" + sujet + ", date=" + date + "]";
	}
    
    

}
