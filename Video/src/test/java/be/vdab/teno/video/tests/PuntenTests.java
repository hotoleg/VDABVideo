package be.vdab.teno.video.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import be.vdab.teno.video.entities.tests.MandjeTests;
import be.vdab.teno.video.entities.tests.VideoOntlenen;
import be.vdab.teno.video.services.tests.VerhuurbaarServiceTest;
import be.vdab.teno.video.services.tests.VideoServiceTest;

/**
 * 
 * @author stijn
 *
 * Deze testsuite, net zoals de bijhorende testen, moeten ongewijzigd blijven.
 * 
 * Al deze testen moeten succesvol verlopen om een minimum van de punten te halen.
 * 
 */

@RunWith(Suite.class)
@SuiteClasses({ VideoOntlenen.class, VideoServiceTest.class, MandjeTests.class, VerhuurbaarServiceTest.class })
public class PuntenTests {

}
