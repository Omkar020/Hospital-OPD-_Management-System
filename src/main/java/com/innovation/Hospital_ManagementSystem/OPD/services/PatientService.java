package com.innovation.Hospital_ManagementSystem.OPD.services;

import java.util.List;
import java.util.Optional;

import com.innovation.Hospital_ManagementSystem.OPD.model.CasePaper;
import com.innovation.Hospital_ManagementSystem.OPD.model.Patient;

public interface PatientService {
	 Patient insert (Patient p);
		void delete(long pid);
		Patient update(long pid,Patient p);
		Patient serach(long pid);
		List<Patient>getAll();
}
