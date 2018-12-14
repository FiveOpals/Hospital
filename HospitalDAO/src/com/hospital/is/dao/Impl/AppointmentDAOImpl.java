/**
 * 
 */
package com.hospital.is.dao.Impl;

import com.hospital.is.StaticDatabase;
import com.hospital.is.dao.AppointmentDAO;
import com.hospital.is.entity.Appointment;

/**
 * @author user001
 *
 */
public class AppointmentDAOImpl extends DAOImpl<Appointment> implements AppointmentDAO {
	

	public AppointmentDAOImpl() {
		dataSet=StaticDatabase.appointementMap;
	}

}
