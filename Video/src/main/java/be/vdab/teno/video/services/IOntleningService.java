package be.vdab.teno.video.services;

import be.vdab.teno.video.entities.IExemplaar;
import be.vdab.teno.video.entities.IKlant;
import be.vdab.teno.video.entities.IOntlening;
import be.vdab.teno.video.entities.IVerhuurbaar;
import be.vdab.teno.video.entities.IVideo;

public interface IOntleningService {
	IOntlening createOntlening(IKlant klant, IExemplaar exemplaar);
	IOntlening createOntlening(IKlant klant, IVerhuurbaar item);
	IOntlening findOntleningByExemplaar(IExemplaar exemplaar);
	//Verder uit te breiden
}
