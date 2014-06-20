package be.vdab.teno.video.entities;

import java.util.Date;

public interface IOntlening {
	IExemplaar getExemplaar();	
	IKlant getKlant();
	Date getDatumVanOntlening();
	Date getDatumVanTeruggave();
}
