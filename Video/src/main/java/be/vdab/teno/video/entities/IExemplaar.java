package be.vdab.teno.video.entities;

public interface IExemplaar {
	IVideo getVideo();
	boolean isBeschikbaar();
	IOntlening ontleen(IKlant ontlener);
	void leverIn();
}
