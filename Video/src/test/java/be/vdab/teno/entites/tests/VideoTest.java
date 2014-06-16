package be.vdab.teno.entites.tests;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import be.vdab.teno.video.entities.IVideo;
import be.vdab.teno.video.enums.Genre;
import be.vdab.teno.video.services.IVideoService;


public class VideoTest {

	private IVideoService videoService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//TODO: Execute SQL script to populate DB with testdata
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		//TODO:
		//videoService = new videoServiceImpl();				
	}

	@After
	public void tearDown() throws Exception {
		videoService = null;
	}

	@Test
	public void testfindVideo0() {
		//TODO: Set expected values
		final int ID_OF_TEST_VIDEO = 0;
		Genre expectedGenre = Genre.Avontuur;
		String expectedNaam = "";
		Double expectedPrijs = 0.00;
		
		//Get Video
		IVideo video = videoService.findVideoById(ID_OF_TEST_VIDEO);
		
		Assert.assertEquals("Het ID is niet correct.", ID_OF_TEST_VIDEO, video.getId());
		Assert.assertEquals("Het genre is niet correct.", expectedGenre, video.getGenre());
		Assert.assertEquals("De naam is niet correct.", expectedNaam, video.getNaam());
		Assert.assertEquals("De prijs is niet correct.", expectedPrijs, video.getPrijs());				
	}
	
	
	

}
