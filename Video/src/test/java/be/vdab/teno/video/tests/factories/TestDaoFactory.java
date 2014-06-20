package be.vdab.teno.video.tests.factories;

import org.mockito.Mock;

import be.vdab.teno.video.dao.IExemplarenDao;
import be.vdab.teno.video.dao.IVerhuurbaarDao;
import be.vdab.teno.video.services.IDaoFactory;

/**
 * 
 * @author stijn
 *
 * Factory bedoeld om te gebruiken in Unit testen. Deze laat toe om 
 *
 */
public class TestDaoFactory implements IDaoFactory {
	
	private static TestDaoFactory instance = new TestDaoFactory(); 
	
	public static TestDaoFactory get(){
		return instance;
	}
	
	/* --- IExemplarenDao --- */
	private IExemplarenDao exemplarenDao;
	
	public void setExemplarenDao(IExemplarenDao dao){
		this.exemplarenDao = dao;
	}
	
	public IExemplarenDao createExemplarenDao() {
		return this.exemplarenDao;
	}
	
	/* --- IVerhuurbaarDao --- */
	private IVerhuurbaarDao verhuurbaarDao;
	
	public void setVerhuurbaarDao(IVerhuurbaarDao dao){
		this.verhuurbaarDao = dao;
	}
	

	public IVerhuurbaarDao createVerhuurbaarDao() {
		return this.verhuurbaarDao;
	}
	
}
