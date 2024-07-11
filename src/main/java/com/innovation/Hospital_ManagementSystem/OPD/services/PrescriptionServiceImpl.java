package com.innovation.Hospital_ManagementSystem.OPD.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.innovation.Hospital_ManagementSystem.OPD.model.Prescription;
import com.innovation.Hospital_ManagementSystem.OPD.repository.PrescriptionRepository;

@Service
public class PrescriptionServiceImpl implements PrescriptionService{
@Autowired
@Qualifier ("priRepo")
PrescriptionRepository priRepo;

@Override
public Prescription insert(Prescription ps) {
	// TODO Auto-generated method stub
	return priRepo.save(ps);
}

@Override
public void delete(long pid) {
	// TODO Auto-generated method stub
	
}

@Override
public Prescription update(long pid, Prescription ps) {
	// TODO Auto-generated method stub
	Optional<Prescription> opt=priRepo.findById(pid);
	if(opt.isPresent())
	{
		Prescription pr=opt.get();
		pr.setAid(ps.getAid());
		pr.setMedicine(ps.getMedicine());
		pr.setSuggestion(ps.getSuggestion());
		return priRepo.save(pr);
	}
	return null;
}

@Override
public Prescription serach(long pid) {
	// TODO Auto-generated method stub
	Optional<Prescription> opt=priRepo.findById(pid);
	if(opt.isPresent())
	{
		Prescription pr=opt.get();
		
		return pr;
	}
	return null;
}

@Override
public List<Prescription> getAll() {
	// TODO Auto-generated method stub
	return priRepo.findAll();
}

}