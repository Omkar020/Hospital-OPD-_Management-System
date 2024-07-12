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
import com.innovation.Hospital_ManagementSystem.OPD.model.CasePaper;
import com.innovation.Hospital_ManagementSystem.OPD.services.CasePaperService;

@RestController
@RequestMapping("/opd")
@CrossOrigin(origins = "http://localhost:4200")
public class CasePaperController {
@Autowired
CasePaperService cs;
@GetMapping("/casepaper")
public List<CasePaper> getAll()
{
	return cs.getAll();
}
@PostMapping("/casepaper")
public CasePaper insert (@RequestBody CasePaper cp)
{
	return cs.insert(cp);
}
@DeleteMapping("/casepaper{id}")
public void delete(@PathVariable("id")long id)
{
	cs.delete(id);
}
@PutMapping("/casepaper/{id}")
public CasePaper update(@PathVariable ("id") long id,@RequestBody CasePaper cp)
{
	return cs.update(id,cp);
}
@GetMapping("/Appointment/{id}")
public CasePaper search(@PathVariable("id")long id)
{
	return cs.serach(id);
}

}
