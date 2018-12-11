/**
 * 
 */
package com.hospital.is.dao.Impl;

import java.util.Map;

import com.hospital.is.dao.AppointmentDAO;
import com.hospital.is.model.Appointment;

/**
 * @author user001
 *
 */
public class AppointmentDAOImpl extends DAOImpl<Appointment> implements AppointmentDAO {

	public AppointmentDAOImpl(Map<Integer, Appointment> dataSet) {
		super(dataSet);
	}

}
