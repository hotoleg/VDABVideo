package be.vdab.teno.video.entities;

import be.vdab.teno.video.enums.Genre;

public interface IVideo {
	int getId();
	String getNaam();
	String setNaam();
	Double getPrijs();
	Genre getGenre();
		
}
