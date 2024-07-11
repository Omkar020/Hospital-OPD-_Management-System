package com.innovation.Hospital_ManagementSystem.OPD.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.innovation.Hospital_ManagementSystem.OPD.model.Admin;
import com.innovation.Hospital_ManagementSystem.OPD.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {
@Autowired
@Qualifier ("admRepo")
AdminRepository admRepo;

@Override
public Admin login(String em, String ps) {
	// TODO Auto-generated method stub
	return admRepo.findByEmailAndPassword(em,ps);
}




}
