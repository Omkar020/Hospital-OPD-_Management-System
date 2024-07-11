package com.innovation.Hospital_ManagementSystem.OPD.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovation.Hospital_ManagementSystem.OPD.model.Prescription;

@Repository
@Qualifier("priRepo")
public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {

}
