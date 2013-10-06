package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import app.TravessiaDeserto;

public class TravessiaDesertoTest {
	TravessiaDeserto td;
	int x;
	int y;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		td = new TravessiaDeserto();
		x=0;
		y=0;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAvancar() {

		td.initGame();
		
		x = td.getPos();
		y = td.getFuel();
		
		td.avancar();
		
		assertEquals(td.getPos(), x+1);
		assertEquals(td.getFuel(), y-1);

		assertTrue(td.getFuel() > 0);
		while(td.getFuel() > 0){
			td.descarregar();
		}
		
		x = td.getPos();
		y = td.getFuel();
		td.avancar();
		assertEquals(td.getPos(), x);
		assertEquals(td.getFuel(), y);
		
	}
	@Test
	public void testVoltar(){
		td.initGame();
		x = td.getPos();
		y = td.getFuel();
		td.voltar();
		assertEquals(td.getPos(), x);
		assertEquals(td.getFuel(), y);
			
		td.avancar();
		td.avancar();
		x = td.getPos();
		y = td.getFuel();
		td.voltar();
		assertEquals(td.getPos(), x-1);
		assertEquals(td.getFuel(), y-1);
		
		while (td.getFuel() > 0) {
			td.descarregar();
		}
		x = td.getPos();
		y = td.getFuel();
		td.voltar();
		assertEquals(td.getPos(), x);
		assertEquals(td.getFuel(), y);
		
	}
	@Test
	public void testInitGame(){
		td.initGame();
		assertEquals(td.getPos(), 0);
		assertEquals(td.getFuel(), 6);
	}
	@Test
	public void testCarregar(){		
		
		
		
		
	}
	@Test
	public void testDescarregar(){
	}
	@Test
	public void testAjuda(){
	}
	@Test
	public void testProcessCommand(){
	}
	@Test
	public void testTranslateCommand(){
	}
	@Test
	public void testPrintStatus(){
	}
	@Test
	public void testEndMensage(){
	}
	@Test
	public void testIsWinner(){ 	
	}
	@Test
	public void testIsGameOver(){
	}
}
