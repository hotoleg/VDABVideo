package be.vdab.teno.video.entities;

import java.util.List;

import be.vdab.teno.video.enums.Genre;

public interface IVideo {
	int getId();
	String getTitel();
	String getOmschrijving();
	void setNaam();
	Double getPrijs();
	Genre getGenre();
	List<IExemplaar> getExemplaren();
	int getAantalBeschikbareExemplaren();
		
}
