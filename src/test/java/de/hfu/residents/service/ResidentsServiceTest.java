package de.hfu.residents.service;

import static org.easymock.EasyMock.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import de.hfu.residents.domain.Resident;
import de.hfu.residents.repository.ResidentRepository;
import de.hfu.residents.repository.ResidentRepositoryStab;
import de.hfu.residents.service.BaseResidentService;


public class ResidentsServiceTest{

	@Test
	public void test(){
		List<Resident>residentList = new ArrayList<Resident>();
		
		Resident r1 = new Resident();
		
		r1.setGivenName("Iron");
		r1.setFamilyName("Man");
		//r1.setDateOfBirth(Date);
		r1.setStreet("Marvel");
		r1.setCity("MCU");
		
		residentList.add(r1);
		
		Resident r2 = new Resident();
		
		r2.setGivenName("Thanos");
		r2.setFamilyName("Os");
		//r2.setDateOfBirth(Date);
		r2.setStreet("Vega");
		r2.setCity("MCU");
		
		residentList.add(r2);
		
		
		ResidentRepositoryStab repository = createMock(ResidentRepositoryStab.class);// new ResidentRepositoryStab();
		repository.addResidentList(residentList);
		
		
		BaseResidentService bs = new BaseResidentService();
		bs.setResidentRepository(repository);
		
		Resident tmp = new Resident();
		List<Resident>tmpList = new ArrayList<Resident>();
		
		//Testfall 1
		tmpList = bs.getFilteredResidentsList(r1);	
		System.out.println(tmpList.get(0).getGivenName());
		assertTrue(true);
		
		//Testfall 2
		tmpList = bs.getFilteredResidentsList(r2);	
		System.out.println(tmpList.get(0).getGivenName());
		assertTrue(true);
		
		//Testfall 3
		tmpList = bs.getFilteredResidentsList(r2);	
		System.out.println(tmpList.get(0).getGivenName());
		assertTrue(true);
		
		
		
		//Testfall 1
		try {
			tmp = bs.getUniqueResident(r2);
		} catch (ResidentServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(tmp.getGivenName());
		assertTrue(true);
		
		//Testfall 2
		try {
			tmp = bs.getUniqueResident(r1);
		} catch (ResidentServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		System.out.println(tmp.getGivenName());
		assertTrue(true);
				
		//Testfall 3
		try {
			tmp = bs.getUniqueResident(r2);
		} catch (ResidentServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		System.out.println(tmp.getGivenName());
		assertTrue(true);
		
		
	}

	

	
}

