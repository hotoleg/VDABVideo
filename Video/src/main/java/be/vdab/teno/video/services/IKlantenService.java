package be.vdab.teno.video.services;

import java.util.Set;

import be.vdab.teno.video.entities.IKlant;

public interface IKlantenService {
	IKlant findKlantById(int id);
	Set<IKlant> findKlantenByNaam(String naam);		
}
