package be.vdab.teno.video.entities;

import java.util.Set;

public interface IMandje {
	void reset();
	IKlant getKlant();
	Set<IVideo> getVideos();
	void voegToe(IVideo video);
	void verwijder(IVideo video);
	Double getTotaalPrijs();
	int getAantalVideosInMandje(); 
}
