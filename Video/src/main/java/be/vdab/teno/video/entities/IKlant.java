package be.vdab.teno.video.entities;

public interface IKlant {
	String getKlantennummer();	
	String getVoornaam();
	String setVoornaam();	
	String getAchternaam();
	String setAchternaam();
	
	Boolean valideerPincode(String pincode);
	
	IOntlening ontleen(IVideo video);
	
	
}
