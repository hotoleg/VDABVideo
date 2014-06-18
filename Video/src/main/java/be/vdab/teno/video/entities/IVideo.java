package be.vdab.teno.video.entities;

import java.util.List;

import be.vdab.teno.video.enums.Genre;

public interface IVideo {
	int getId();
	String getNaam();
	String setNaam();
	Double getPrijs();
	Genre getGenre();
	List<IExemplaar> getExemplaren();
	int countBeschikbareExemplaren();
		
}
