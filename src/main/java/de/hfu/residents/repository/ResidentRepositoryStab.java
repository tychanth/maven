package de.hfu.residents.repository;

import java.util.List;

import de.hfu.residents.domain.Resident;

public class ResidentRepositoryStab implements ResidentRepository {
	private List<Resident> residentList;

	public List<Resident> getResidents() {
		return residentList;
	}
	
	public void addResidentList(List<Resident> residentList){
		this.residentList = residentList;
	}

}