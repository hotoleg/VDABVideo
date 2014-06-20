package be.vdab.teno.video.services.impl;

import be.vdab.teno.video.dao.IVerhuurbaarDao;
import be.vdab.teno.video.entities.IVerhuurbaar;
import be.vdab.teno.video.services.IDaoFactory;
import be.vdab.teno.video.services.IVerhuurbaarService;

/**
 * 
 * @author stijn
 *
 *
 */

public class VerhuurbaarService implements IVerhuurbaarService {

	private IVerhuurbaarDao verhuurbaarDao ;
	
	public VerhuurbaarService(IDaoFactory daoFactory){
		this.verhuurbaarDao = daoFactory.createVerhuurbaarDao();
	}
	
	public IVerhuurbaar getVerhuurbaarById(int Id) {					
		return verhuurbaarDao.findById(Id);
	}

}
