package be.vdab.teno.video.entities.impl;

import java.util.Set;

import be.vdab.teno.video.entities.IBestellijn;
import be.vdab.teno.video.entities.IKlant;
import be.vdab.teno.video.entities.IMandje;
import be.vdab.teno.video.entities.IVerhuurbaar;
import be.vdab.teno.video.entities.IVideo;

public class Mandje implements IMandje{

	public void reset() {
		// TODO Auto-generated method stub
		
	}

	public IKlant getKlant() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<IBestellijn> getBestellijnen() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<IVerhuurbaar> getItems() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getAantalVoor(IVideo video) {
		// TODO Auto-generated method stub
		return null;
	}

	public void voegToe(IVideo video) {
		// TODO Auto-generated method stub
		
	}

	public void verwijder(IVideo video) {
		// TODO Auto-generated method stub
		
	}

	public Double getTotaalPrijs() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getAantalItemsInMandje() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Integer getAantalVoor(IVerhuurbaar video) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void voegToe(IVerhuurbaar video) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verwijder(IVerhuurbaar video) {
		// TODO Auto-generated method stub
		
	}

}
