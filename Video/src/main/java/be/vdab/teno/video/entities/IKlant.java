package be.vdab.teno.video.entities;

public interface IKlant {
	String getVoornaam();
	String setVoornaam();	
	String getAchternaam();
	String setAchternaam();
	IOntlening ontleen(IVideo video);
	
	
}
