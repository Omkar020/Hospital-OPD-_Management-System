package com.innovation.Hospital_ManagementSystem.OPD.services;

import java.util.List;

import com.innovation.Hospital_ManagementSystem.OPD.model.Appointment;

public interface AppointmentService {
Appointment insert (Appointment ap);
void delete(long aid);
Appointment update(long aid,Appointment ap);
Appointment serach(long aid);
List<Appointment >getAll();
}
