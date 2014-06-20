package be.vdab.teno.video.entities;

import java.util.List;

import be.vdab.teno.video.enums.Genre;

public interface IVerhuurbaar {
	int getId();
	String getTitel();
	String getOmschrijving();
	Double getPrijs();	
	List<IExemplaar> getExemplaren();
	int getAantalBeschikbareExemplaren();
}
