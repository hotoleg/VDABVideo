package be.vdab.teno.video.services.tests;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import be.vdab.teno.video.dao.IVerhuurbaarDao;
import be.vdab.teno.video.entities.IVerhuurbaar;
import be.vdab.teno.video.services.IVerhuurbaarService;
import be.vdab.teno.video.services.impl.VerhuurbaarService;
import be.vdab.teno.video.tests.factories.TestDaoFactory;


public class VerhuurbaarServiceTest {

	private IVerhuurbaarService verhuurbaarService;
	private IVerhuurbaarDao mockDao;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		mockDao = mock(IVerhuurbaarDao.class);		
		TestDaoFactory.get().setVerhuurbaarDao(mockDao);
		verhuurbaarService = new VerhuurbaarService(TestDaoFactory.get());
	}

	@After
	public void tearDown() throws Exception {
		verhuurbaarService = null;
		mockDao = null;
		TestDaoFactory.get().setVerhuurbaarDao(null);
	}


	@Test
	public void testGetVerhuurbaarById() {
		//Setup		
		final int TEST_ID = 0;
		IVerhuurbaar expectedIVerhuurbaar = mock(IVerhuurbaar.class);
		when(mockDao.findById(TEST_ID)).thenReturn(expectedIVerhuurbaar);
		
		//Do test
		IVerhuurbaar actual = this.verhuurbaarService.getVerhuurbaarById(TEST_ID);
		
		//Validate
		Assert.assertEquals(expectedIVerhuurbaar, actual);
	}

}
