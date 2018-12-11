package com.hospital.is;

import java.util.Map;
import java.util.TreeMap;
import com.hospital.is.model.*;

public class Database<T> {
	
	@SuppressWarnings("rawtypes")
	private static Map<String,Map> datasets=new TreeMap<>();
	
	final String typeParameterClass;
   
	static {
		datasets.put(Appointment.class.toString()	, StaticDatabase.getAppointmentList());
		datasets.put(Disease.class.toString()		, StaticDatabase.getDiseaseList());
		datasets.put(Doctor.class.toString()		, StaticDatabase.getDoctorList());
		datasets.put(Patient.class.toString()		, StaticDatabase.getPatientList());
		datasets.put(MedicalFolder.class.toString() , StaticDatabase.getMedicalFolderList());
	}
	
	public Database(Class<T> typeParameterClass) {
		this.typeParameterClass = typeParameterClass.toString();
	}
	
	@SuppressWarnings("unchecked")
	public Map<String,T> getDatabase(){
		return datasets.get(typeParameterClass);
	}
}
