package com.hospital.is.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.hospital.is.HospitalManagerApplication;
import com.hospital.is.model.PatientDTO;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HospitalManagerApplication.class)
@Transactional
public class PatientServiceTest {

	@Autowired
	private PatientService patientService;

	@Test
	public void testFindByFirstName() {
		List<PatientDTO> result = patientService.findByFirstName("everis firstName");
		System.out.println(result.get(0));
		assertEquals(1, result.size());
	}

	@Test
	public void testCreate() {
		PatientDTO dto = new PatientDTO();
		dto.setAddress("unit test address");
		dto.setFirstName("unit test first name");
		dto.setLastName("unit test last name");

		assertNull(dto.getId());

		PatientDTO result = patientService.create(dto);

		assertNotNull(result.getId());
	}

	@Test
	public void testDelete() throws Exception {

		assertNotNull(patientService.getById(3));

		patientService.delete(3);

		assertNull(patientService.getById(3));
	}

	@Test
	public void testGetById() throws Exception {
		assertNotNull(patientService.getById(8));
	}

	@Test(expected = Exception.class)
	public void testGetByIdNotFound() throws Exception {
		patientService.getById(100);
	}

	@Test
	public void testUpdate() throws Exception {
		Long id = 1l;

		PatientDTO dtoToBeUpdated = patientService.getById(id);

		assertEquals("test02", dtoToBeUpdated.getFirstName());

		dtoToBeUpdated.setFirstName("Marouane");

		PatientDTO after = patientService.update(id, dtoToBeUpdated);

		assertEquals("Marouane", after.getFirstName());
	}

}
