package com.innovation.Hospital_ManagementSystem.OPD.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovation.Hospital_ManagementSystem.OPD.model.Patient;

@Repository
@Qualifier("patientRepo")
public interface PatientRepository extends JpaRepository<Patient, Long> {
Patient findByEmailAndPassword(String emaol,String password);
}
