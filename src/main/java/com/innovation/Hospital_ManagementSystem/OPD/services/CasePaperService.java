package com.innovation.Hospital_ManagementSystem.OPD.services;

import java.util.List;
import com.innovation.Hospital_ManagementSystem.OPD.model.Appointment;
import com.innovation.Hospital_ManagementSystem.OPD.model.CasePaper;

public interface CasePaperService {
    CasePaper insert (CasePaper cp);
	void delete(long cid);
	CasePaper update(long cid,CasePaper cp);
	CasePaper serach(long cid);
	List<CasePaper>getAll();
}
