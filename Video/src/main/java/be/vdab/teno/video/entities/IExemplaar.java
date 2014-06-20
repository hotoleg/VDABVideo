package be.vdab.teno.video.entities;

public interface IExemplaar {
	
	/**
	 * geeft het (verhuurbaar) Item weer waarvan dit exemplaar een instantie is. (Concreet: Boek of Video, maar mogelijk uitbreidbaar)
	 * @return IVerhuurbaar
	 */
	IVerhuurbaar getItem();
	
	/**
	 * Geeft weer of een exemplaar beschikbaar is voor verhuur. Dit wil zeggen, er bestaat geen Ontlening van dit exemplaar waarvoor nog geen teruggaven is geregistreerd.
	 * 
	 * Mogelijke uitbreiding: Het exemplaar is ook nog niet gereserveerd.
	 * @return Boolean
	 */
	boolean isBeschikbaar();
	
	/**
	 * Maakt een ontlening aan waarbij dit exemplaar wordt verhuurd aan de klant. Dit gaat gepaard met de fysieke aflevering van het exemplaar.
	 * 
	 * @param ontlener
	 * @return Iontlening
	 */
	IOntlening ontleen(IKlant ontlener);
	
	/**
	 * Het exemplaar wordt teruggegeven. De ontlening eindigt. 
	 */
	void leverIn();
}
