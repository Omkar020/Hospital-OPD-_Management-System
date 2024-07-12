package com.innovation.Hospital_ManagementSystem.OPD.services;

import java.util.List;


import com.innovation.Hospital_ManagementSystem.OPD.model.Prescription;

public interface PrescriptionService {
	Prescription insert (Prescription ps);
	Prescription update(long pid,Prescription ps);
	Prescription serach(long pid);
	List<Prescription>getAll();
}
