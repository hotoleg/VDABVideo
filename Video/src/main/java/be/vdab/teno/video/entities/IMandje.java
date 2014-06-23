package be.vdab.teno.video.entities;

import java.util.Set;

public interface IMandje {
	void reset();
	IKlant getKlant();	
	Set<IBestellijn> getBestellijnen();	
	Set<IVerhuurbaar> getItems();
	Integer getAantalVoor(IVerhuurbaar video);
	void voegToe(IVerhuurbaar video);
	void verwijder(IVerhuurbaar video);
	Double getTotaalPrijs();
	int getAantalItemsInMandje(); 
}
