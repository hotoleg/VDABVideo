package be.vdab.teno.video.services.tests;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import be.vdab.teno.video.dao.IVerhuurbaarDao;
import be.vdab.teno.video.entities.IVideo;
import be.vdab.teno.video.services.IVideoService;
import be.vdab.teno.video.services.impl.VideoService;
import be.vdab.teno.video.tests.factories.TestDaoFactory;

public class VideoServiceTest {

	private IVideoService videoService;
	
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {		
		videoService = new VideoService(TestDaoFactory.get());			
	}

	@After
	public void tearDown() throws Exception {
		videoService = null;
	}

	@Test
	public void testFindVideo0() {
		//TODO: Set expected values
		final int ID_OF_TEST_VIDEO = 0;
		final IVideo expectedVideo = mock(IVideo.class);
		
		//Setup mockDao
		IVerhuurbaarDao mockDao = mock(IVerhuurbaarDao.class);
		when(mockDao.findById(ID_OF_TEST_VIDEO)).thenReturn(expectedVideo);		
		TestDaoFactory.get().setVerhuurbaarDao(mockDao);
		
		//Do test: Get Video
		IVideo actual = videoService.findVideoById(ID_OF_TEST_VIDEO);
		
		Assert.assertNotNull(actual);
		Assert.assertEquals(expectedVideo, actual);				
	}
	
	

}
