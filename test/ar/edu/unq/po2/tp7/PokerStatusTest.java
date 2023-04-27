package ar.edu.unq.po2.tp7;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {
	private PokerStatus poker;
	
	@BeforeEach
	public void setUp() {
		poker = new PokerStatus();
	}
	
	@Test
	void testVerificarPoker() {
		assertTrue(poker.verificar("2D","2P","2C","2T","3P"));
		assertTrue(poker.verificar("QD","QP","QC","2T","QT"));
		assertTrue(poker.verificar("5D","5P","5C","5T","3P"));
		assertTrue(poker.verificar("10D","10P","10C","10T","3P"));
		assertTrue(poker.verificar("7D","QP","QC","QD","QT"));
		assertFalse(poker.verificar("2D","2P","1C","2T","3P"));
	}
	
	@Test
	void testVerificarColor() {
		assertTrue(poker.verificar("2D","3D","2C","2D","3D"));
		assertTrue(poker.verificar("QP","8P","1P","2P","QT"));
		assertTrue(poker.verificar("7D","QC","JC","KC","2C"));
		assertFalse(poker.verificar("2D","2P","1C","2T","3P"));
	}
	
	@Test
	void testVerificarTrio() {
		assertTrue(poker.verificar("2D","2P","2C","7T","3P"));
		assertTrue(poker.verificar("JD","QP","QC","2T","QT"));
		assertTrue(poker.verificar("JD","JP","1C","1T","1T"));
		//assertFalse(poker.verificar("2D","2P","1C","7T","3P"));
	}
}
