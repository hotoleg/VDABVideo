package be.vdab.teno.video.services;

import be.vdab.teno.video.entities.IVideo;
import be.vdab.teno.video.enums.Genre;

public interface IVideoService {
	IVideo findVideoById(int id);
	IVideo findVideoByGenre(Genre genre);
}
