package be.vdab.teno.video.entities.tests;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import be.vdab.teno.video.entities.IBoek;
import be.vdab.teno.video.entities.IMandje;
import be.vdab.teno.video.entities.IVideo;
import be.vdab.teno.video.entities.impl.Mandje;

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
		mandje = new Mandje();
	}

	@After
	public void tearDown() throws Exception {
		mandje = null;
	}

	@Test
	public void mandjeNaInit() {
		Assert.assertEquals((Double)0.0, mandje.getTotaalPrijs());
		Assert.assertEquals( 0, mandje.getAantalItemsInMandje());
		
		IVideo video  = mock(IVideo.class);
		
		mandje.voegToe(video);
		mandje.reset();
		
		Assert.assertEquals((Double)0.0, mandje.getTotaalPrijs());
		Assert.assertEquals( 0, mandje.getAantalItemsInMandje());				
	}
	
	@Test
	public void videoToevoegenAanMandje_1() {
		IVideo video  = mock(IVideo.class);
		
		mandje.voegToe(video);
		
		Assert.assertEquals("Er werd 1 video verwacht in het mandje" ,1, mandje.getAantalItemsInMandje());		
		
	}
	
	@Test
	public void itemsToevoegenAanMandje_3() {
		IVideo video1  = mock(IVideo.class);
		IVideo video2  = mock(IVideo.class);
		IBoek boek1 = mock(IBoek.class);
		
		mandje.voegToe(video1);
		mandje.voegToe(video2);
		mandje.voegToe(boek1);
		
		Assert.assertEquals("Er werden 3 items verwacht in het mandje" ,3, mandje.getAantalItemsInMandje());		
		
	}
	
	@Test
	public void videoVerwijderenAanMandje_3() {
		IVideo video1  = mock(IVideo.class);
		IVideo video2  = mock(IVideo.class);
		IBoek boek1 = mock(IBoek.class);
		
		mandje.voegToe(video1);
		mandje.voegToe(video2);
		mandje.voegToe(boek1);
		
		Assert.assertEquals("Er werden 3 items verwacht in het mandje" ,3, mandje.getAantalItemsInMandje());		
			
		
		mandje.verwijder(video1);
		
		Assert.assertEquals("Er werden 2 items verwacht in het mandje" ,2, mandje.getAantalItemsInMandje());
		
		
		
	}
	
	

	@Test
	public void videoToevoegenAanMandje_3en1() {
		IVideo video1  = mock(IVideo.class);
		IVideo video2  = mock(IVideo.class);
		IBoek boek1 = mock(IBoek.class);
		
		mandje.voegToe(video1);
		mandje.voegToe(video2);
		mandje.voegToe(boek1);
		mandje.voegToe(video1);
		
		Assert.assertEquals("Er werden 3 items verwacht in het mandje" ,3, mandje.getAantalItemsInMandje());		
		Assert.assertEquals("Er werden 2 exemplaren verwacht" ,(Integer)2, mandje.getAantalVoor(video1));		
		Assert.assertEquals("Er werd 1 exemplaren verwacht" ,(Integer)1, mandje.getAantalVoor(video2));		
		Assert.assertEquals("Er werd 1 exemplaren verwacht" ,(Integer)1, mandje.getAantalVoor(boek1));		
		
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
