package be.vdab.teno.video.services;

import be.vdab.teno.video.entities.IBoek;
import be.vdab.teno.video.enums.Genre;

public interface IBoekenService {
	IBoek findBoekById(int id);
	IBoek findBoekByGenre(Genre genre);
	IBoek findBoekBySchrijver(String schrijver);
	
}
