package be.vdab.teno.video.services.impl;

import be.vdab.teno.video.dao.IVerhuurbaarDao;
import be.vdab.teno.video.entities.IVideo;
import be.vdab.teno.video.enums.Genre;
import be.vdab.teno.video.services.IDaoFactory;
import be.vdab.teno.video.services.IVideoService;

public class VideoService implements IVideoService {
	
	IVerhuurbaarDao dao;
	
	public VideoService(IDaoFactory daoFactory){
		dao = daoFactory.createVerhuurbaarDao();
	}
	
	public IVideo findVideoByGenre(Genre genre) {
		// TODO Auto-generated method stub
		return null;
	}

	public IVideo findVideoById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
