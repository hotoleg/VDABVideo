package be.vdab.teno.video.services;

import java.util.Set;

import be.vdab.teno.video.entities.IExemplaar;
import be.vdab.teno.video.entities.IVideo;

public interface IExemplaarService {
	IExemplaar findExemplaarById(int id);
	Set<IExemplaar> findBeschikbareExemplaren(IVideo video);
	
}
