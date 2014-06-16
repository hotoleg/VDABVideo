package be.vdab.teno.entities.tests;

import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Test;

import be.vdab.teno.video.entities.IKlant;
import be.vdab.teno.video.entities.IOntlening;
import be.vdab.teno.video.entities.IVideo;
import be.vdab.teno.video.entities.Klant;

public class VideoOntlenen {

	@Test
	public void maakOntlening(){
		IKlant klant = new Klant();
		final int VIDEO_ID = 0;
		
		
		IVideo video = mock(IVideo.class);
		when(video.getId()).thenReturn(0);
				
		IOntlening ontlening = klant.ontleen(video);
		
		Assert.assertNotNull(ontlening);
		Assert.assertEquals(klant, ontlening.getKlant());
		Assert.assertEquals(VIDEO_ID, ontlening.getExemplaar().getVideo().getId());
		
		
		
		
	}
	
}
