package com.hospital.is.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.is.model.PatientDTO;
import com.hospital.is.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	private PatientService patientService;

	@GetMapping
	public List<PatientDTO> getAll() {
		return patientService.getAll();
	}

	@GetMapping("/{id}")
	public String getById(@PathVariable Long id) {
		return "mon patient numéro : " + id;
	}

	@PutMapping("/{id}")
	public PatientDTO create(@PathVariable Long id, @RequestBody PatientDTO dto) {
		return patientService.update(dto, id);
	}

	@PostMapping
	public PatientDTO create(@RequestBody PatientDTO dto) {
		return patientService.create(dto);
	}

}
