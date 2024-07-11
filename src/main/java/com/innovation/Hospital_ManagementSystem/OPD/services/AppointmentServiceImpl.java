package com.innovation.Hospital_ManagementSystem.OPD.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.innovation.Hospital_ManagementSystem.OPD.model.Appointment;
import com.innovation.Hospital_ManagementSystem.OPD.repository.AppointmentRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService {
@Autowired
@Qualifier ("appRepo")
AppointmentRepository appRepo;

@Override
public Appointment insert(Appointment ap) {
	// TODO Auto-generated method stub
	return appRepo.save(ap);
}

@Override
public void delete(long aid) {
	// TODO Auto-generated method stub
	appRepo.deleteById(aid);
}

@Override
public Appointment update(long aid, Appointment ap) {
	// TODO Auto-generated method stub
	Optional<Appointment> opt=appRepo.findById(aid);
	if(opt.isPresent())
	{
		Appointment app=opt.get();
		app.setCid(ap.getCid());
		app.setDt(ap.getDt());
		app.setStatus(ap.getStatus());
		app.setTm(ap.getTm());
		return appRepo.save(app);
	}
	return null;
}

@Override
public Appointment serach(long aid) {
	// TODO Auto-generated method stub
	Optional<Appointment> opt=appRepo.findById(aid);
	if(opt.isPresent())
	{
		Appointment app=opt.get();
		return app;
	}
	return null;
}

@Override
public List<Appointment> getAll() {
	// TODO Auto-generated method stub
	return appRepo.findAll();
}


}
