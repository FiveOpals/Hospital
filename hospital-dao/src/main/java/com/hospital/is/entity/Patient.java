package com.hospital.is.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient extends Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * Le pr�nom de la personne
	 */
	@Column(name = "firstname")
	private String firstName;

	/**
	 * Le nom de la personne
	 */
	@Column(name = "lastname")
	private String lastName;

	/**
	 * L'adresse de la personne
	 */
	private String address;

	/**
	 * Le num�ro de t�l�phone de la personne
	 */
	private String phone;

	/**
	 * La date de naissance de la personne
	 */
	private String birthdate;

	/**
	 * @return the firstName
	 */
	public final String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public final String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public final void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the address
	 */
	public final String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public final void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the phone
	 */
	public final String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public final void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the birthDate
	 */
	public final String getBirthdate() {
		return birthdate;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public final void setBirthdate(String birthDate) {
		this.birthdate = birthDate;
	}

//	private MedicalFolder medicalFolder;
//
//	/**
//	 * @return the medicalFolder
//	 */
//	public MedicalFolder getMedicalFolder() {
//		return medicalFolder;
//	}
//
//	/**
//	 * @param medicalFolder the medicalFolder to set
//	 */
//	public void setMedicalFolder(MedicalFolder medicalFolder) {
//		this.medicalFolder = medicalFolder;
//	}
//
//	/*
//	 * (non-Javadoc)
//	 * 
//	 * @see java.lang.Object#toString()
//	 */
//	@Override
//	public String toString() {
//		return super.toString() + "\n   [medicalFolder=" + medicalFolder + "]\n";
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
