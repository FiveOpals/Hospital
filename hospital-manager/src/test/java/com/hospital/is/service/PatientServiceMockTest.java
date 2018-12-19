package com.hospital.is.service;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.hospital.is.dao.PatientRepository;
import com.hospital.is.entity.Patient;
import com.hospital.is.model.PatientDTO;
import com.hospital.is.service.impl.PatientServiceImpl;
import com.hospital.is.transformers.PatientConverter;

public class PatientServiceMockTest {

	@InjectMocks
	private PatientService patientService = new PatientServiceImpl();

	@Mock
	private PatientRepository patientRepository;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testCreate() {

		PatientConverter converter = new PatientConverter();

		PatientDTO dto = new PatientDTO();
		dto.setAddress("unit test address");
		dto.setFirstName("unit test first name");
		dto.setLastName("unit test last name");

		Patient value = converter.toEntity(dto);

		when(patientRepository.save(value)).thenReturn(value);

		value.setId(33l);

		System.out.println(dto);
		PatientDTO result = patientService.create(dto);
		System.out.println(result);

		System.out.println(result.getId());
		assertNotNull(result.getId());

	}
}
