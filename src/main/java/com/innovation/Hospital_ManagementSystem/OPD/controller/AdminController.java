package com.innovation.Hospital_ManagementSystem.OPD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.innovation.Hospital_ManagementSystem.OPD.model.Admin;
import com.innovation.Hospital_ManagementSystem.OPD.services.AdminService;

@RestController
@RequestMapping("/opd")
@CrossOrigin(origins = "http://localhost:4200")

public class AdminController {
 @Autowired
 AdminService as;
 @GetMapping("/admin/{email}/{password}")
 public Admin login(@PathVariable("email")String email,@PathVariable("password")String password)
 {
	 return as.login(email,password);
 }
	
 
}
