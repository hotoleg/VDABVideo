package be.vdab.teno.video.tests;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import be.vdab.teno.video.entities.IMandje;
import be.vdab.teno.video.entities.IVideo;

public class MandjeTests {

	IMandje mandje;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		//TODO:
		//mandje = new Mandje();
	}

	@After
	public void tearDown() throws Exception {
		mandje = null;
	}

	@Test
	public void mandjeNaInit() {
		Assert.assertEquals((Double)0.0, mandje.getTotaalPrijs());
		Assert.assertEquals( 0, mandje.getAantalVideosInMandje());
		
		IVideo video  = mock(IVideo.class);
		
		mandje.voegToe(video);
		mandje.reset();
		
		Assert.assertEquals((Double)0.0, mandje.getTotaalPrijs());
		Assert.assertEquals( 0, mandje.getAantalVideosInMandje());				
	}
	
	@Test
	public void videoToevoegenAanMandje() {
		IVideo video  = mock(IVideo.class);
		
		mandje.voegToe(video);
		
		Assert.assertEquals("Er werd 1 video verwacht in het mandje" ,1, mandje.getAantalVideosInMandje());		
		
	}
	
	@Test
	public void totaalprijs_10_10_20(){
		double[] list = {10, 10, 20};
		totaalprijsBerekenen(list , 40.0);		
	}
	
	@Test
	public void totaalprijs_10(){
		double[] list = {10};
		totaalprijsBerekenen(list , 10.0);		
	}
	
	@Test
	public void totaalprijs_10_10_20_30(){
		double[] list = {10, 10, 20, 30};
		totaalprijsBerekenen(list , 70.0);		
	}
	
	
	public void totaalprijsBerekenen(double[] prijzen, Double totaal) {
		
		
		for(double p : prijzen){
			IVideo video = mock(IVideo.class);
			when(video.getPrijs()).thenReturn(p);			
			
			mandje.voegToe(video);
			
		}
		
		Double resultaat = mandje.getTotaalPrijs();
			
		
		Assert.assertEquals(totaal, resultaat);
		
		
		
	}
	
	

}
