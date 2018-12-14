package com.hospital.is;

import com.hospital.is.dao.AppointmentDAO;
import com.hospital.is.dao.Impl.AppointmentDAOImpl;

public class Main {
	
	public static void main(String[] args) {
		
		AppointmentDAO adao = new AppointmentDAOImpl();
		System.out.println(adao.getAll());
adao.delete(2);
System.out.println(adao.getAll());

	}

}
