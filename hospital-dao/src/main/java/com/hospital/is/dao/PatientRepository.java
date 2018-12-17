package com.hospital.is.dao;

import org.springframework.data.repository.CrudRepository;

import com.hospital.is.entity.Patient;

public interface PatientRepository extends CrudRepository<Patient, Long>{

}
