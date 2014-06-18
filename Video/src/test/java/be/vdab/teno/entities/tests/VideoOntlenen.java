package be.vdab.teno.entities.tests;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import be.vdab.teno.video.entities.IExemplaar;
import be.vdab.teno.video.entities.IKlant;
import be.vdab.teno.video.entities.IOntlening;
import be.vdab.teno.video.entities.IVideo;
import be.vdab.teno.video.entities.Klant;
import be.vdab.teno.video.exceptions.GeenExemplarenBeschikbaarException;

@Ignore
public class VideoOntlenen {

	@Test
	public void maakOntlening(){
		IKlant klant = new Klant();
		final int VIDEO_ID = 0;
		
		IVideo video = mock(IVideo.class);
		final IExemplaar exemplaar = mock(IExemplaar.class);
		
		when(video.getId()).thenReturn(VIDEO_ID);
		when(video.countBeschikbareExemplaren()).thenReturn(3);
		when(video.getExemplaren()).thenReturn(new LinkedList<IExemplaar>() {{ 
			add(exemplaar);
			add(exemplaar);
			add(exemplaar); }});
						
		IOntlening ontlening = klant.ontleen(video);
		
		Assert.assertNotNull(ontlening);
		Assert.assertEquals(klant, ontlening.getKlant());
		Assert.assertEquals(exemplaar, ontlening.getExemplaar());				
	}

	@Test(expected=GeenExemplarenBeschikbaarException.class)
	public void geenExemplarenBeschikbaar(){
		IKlant klant = new Klant();
		final int VIDEO_ID = 0;
		
		
		IVideo video = mock(IVideo.class);
		when(video.getId()).thenReturn(VIDEO_ID);
		when(video.countBeschikbareExemplaren()).thenReturn(0);
				
		IOntlening ontlening = klant.ontleen(video);
					
	}
	
}
