package com.innovation.Hospital_ManagementSystem.OPD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.innovation.Hospital_ManagementSystem.OPD.model.Patient;
import com.innovation.Hospital_ManagementSystem.OPD.model.Prescription;
import com.innovation.Hospital_ManagementSystem.OPD.services.PrescriptionService;

@RestController
@RequestMapping("/opd")
@CrossOrigin(origins = "http://localhost:4200")
public class PrescriptionController {
@Autowired
PrescriptionService ps;

@GetMapping("/prescription")
public List<Prescription>getAll()
{
	return ps.getAll();
}
@PostMapping("/prescription")
public Prescription insert(@RequestBody Prescription p)
{
	return ps.insert(p);
}

@PutMapping("/prescription/{id}")
public Prescription update(@PathVariable ("id") long id,@RequestBody Prescription p)
{
	return ps.update(id,p);
}
@GetMapping("/prescription/{id}")
public Prescription search(@PathVariable("id")long id)
{
	return ps.serach(id);
}
}