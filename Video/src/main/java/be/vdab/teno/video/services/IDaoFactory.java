package be.vdab.teno.video.services;

import be.vdab.teno.video.dao.IExemplarenDao;
import be.vdab.teno.video.dao.IVerhuurbaarDao;

/**
 * 
 * @author stijn
 * 
 * De DaoFactory is verantwoordelijk voor het aanmaken van een DAO. Bij het aanmaken (via de constructor) van een Service bezorgen we deze de factory.
 * Dit eerder dan de Dao hard te coderen in de Service zelf. Dit principe heet IoC Inversion of Control, en laat ons toe betere Unit testen te schrijven.
 *  
 */

public interface IDaoFactory {	
	IExemplarenDao createExemplarenDao();
	IVerhuurbaarDao createVerhuurbaarDao();	
	//TODO: verder uit te breiden.
}
