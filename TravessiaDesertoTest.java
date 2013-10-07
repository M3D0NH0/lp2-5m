package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import app.TravessiaDeserto;

public class TravessiaDesertoTest {
	TravessiaDeserto caminhao;
	private int x;
	private int y;
	private int z;

	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		caminhao = new TravessiaDeserto();
		x=0;
		y=0;
		z=0;
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAvancar() {
		
		caminhao.initGame();
		
		x = caminhao.getPos();
		y = caminhao.getFuel();
		
		caminhao.avancar();
		
		assertEquals(caminhao.getPos(), x+1);
		assertEquals(caminhao.getFuel(), y-1);

		assertTrue(caminhao.getFuel() > 0);
		while(caminhao.getFuel() > 0){
			caminhao.descarregar();
		}
		
		x = caminhao.getPos();
		y = caminhao.getFuel();
		caminhao.avancar();
		assertEquals(caminhao.getPos(), x);
		assertEquals(caminhao.getFuel(), y);
		
	}
	@Test
	public void testVoltar(){
		caminhao.initGame();
		x = caminhao.getPos();
		y = caminhao.getFuel();
		caminhao.voltar();
		assertEquals(caminhao.getPos(), x);
		assertEquals(caminhao.getFuel(), y);
			
		caminhao.avancar();
		caminhao.avancar();
		x = caminhao.getPos();
		y = caminhao.getFuel();
		caminhao.voltar();
		assertEquals(caminhao.getPos(), x-1);
		assertEquals(caminhao.getFuel(), y-1);
		
		while (caminhao.getFuel() > 0) {
			caminhao.descarregar();
		}
		x = caminhao.getPos();
		y = caminhao.getFuel();
		caminhao.voltar();
		assertEquals(caminhao.getPos(), x);
		assertEquals(caminhao.getFuel(), y);
		
	}
	@Test
	public void testInitGame(){ 
		caminhao.initGame();
		assertEquals(caminhao.getPos(),0);
		assertEquals(caminhao.getFuel(), caminhao.getMaxFuel());
		for (int i = 0; i < caminhao.getMAP_SIZE(); i++) {
			assertTrue(caminhao.getMap(i) == 0 );
		}
	}
	@Test
	public void testCarregar(){		
		caminhao.initGame();
		
		x = caminhao.getFuel();
		caminhao.carregar();
		assertEquals(caminhao.getFuel(), x);
		
		caminhao.descarregar();
		x = caminhao.getFuel();
		y = caminhao.getPos();
		caminhao.carregar();
		assertEquals(caminhao.getFuel(), caminhao.getMaxFuel());
		assertEquals(caminhao.getPos(), y);
		
		caminhao.avancar();
		caminhao.descarregar();
		y = caminhao.getPos();
		x = caminhao.getFuel();
		z = caminhao.getMap(y);
		caminhao.carregar();
		assertEquals(caminhao.getMap(y), z-1);
		assertEquals(caminhao.getFuel(), x+1);
		
		caminhao.avancar();
		x = caminhao.getFuel();
		y = caminhao.getPos();
		z = caminhao.getMap(y);
		caminhao.carregar();
		assertEquals(caminhao.getFuel(), x);
		assertEquals(caminhao.getMap(y), z);
		
		
	}
	@Test
	public void testDescarregar(){
		caminhao.initGame();
		
		x = caminhao.getFuel();
		y = caminhao.getPos();
		z = caminhao.getMap(y);
		while (caminhao.getFuel() > 0) {
			caminhao.descarregar();
		}
		assertEquals(caminhao.getFuel(), z);
		
		x = caminhao.getFuel();
		y = caminhao.getPos();
		z = caminhao.getMap(y);
		caminhao.descarregar();
		assertEquals(caminhao.getFuel(), x);
		assertEquals(caminhao.getMap(y), z);
		
		caminhao.carregar();
		x = caminhao.getFuel();
		y = caminhao.getPos();
		z = caminhao.getMap(y);
		caminhao.descarregar();
		assertEquals(caminhao.getFuel(), x-1);
		assertEquals(caminhao.getMap(y), z+1);
		
	}
	@Test
	public void testProcessCommand(){
		
		
	}
	@Test
	public void testTranslateCommand(){
		
			
	}
	@Test
	public void testAjuda(){
		
	}
	@Test
	public void testPrintStatus(){
		
		
		
	}
	@Test
	public void testEndMensage(){
		caminhao.initGame();
		comboBreaker();
		comboBreaker();
		comboBreaker();
		comboBreaker();		
		duploAvancar();
		duploCarregar();
		comboBreaker();
		duploCarregar();
		duploCarregar();
		duploCarregar();
		duploAvancar();
		duploCarregar();
		duploAvancar();
		duploAvancar();
		duploAvancar();
		assertTrue(caminhao.isWinner());
		assertEquals(caminhao.getEndMessage(),"Voce GANHOU!");
		caminhao.initGame();
		duploAvancar();
		duploAvancar();
		duploAvancar();
		assertEquals(caminhao.getEndMessage(),"Voce PERDEU.");
		assertTrue(caminhao.isGameOver());
		
	}
	@Test
	public void testIsWinner(){ 
		caminhao.initGame();
		comboBreaker();
		comboBreaker();
		comboBreaker();
		comboBreaker();		
		duploAvancar();
		duploCarregar();
		comboBreaker();
		duploCarregar();
		duploCarregar();
		duploCarregar();
		duploAvancar();
		duploCarregar();
		duploAvancar();
		duploAvancar();
		duploAvancar();
		assertEquals(caminhao.getPos(), caminhao.getMAP_SIZE());
	}
	@Test
	public void testIsGameOver(){
		caminhao.initGame();
		comboBreaker();
		comboBreaker();
		comboBreaker();
		comboBreaker();		
		duploAvancar();
		duploCarregar();
		comboBreaker();
		duploCarregar();
		duploCarregar();
		duploCarregar();
		duploAvancar();
		duploCarregar();
		duploAvancar();
		duploAvancar();
		duploAvancar();
		assertTrue(caminhao.isWinner());
		
		caminhao.initGame();
		x = caminhao.getFuel();
		y = caminhao.getPos();
		z = caminhao.getMap(y);
		duploAvancar();
		duploAvancar();
		duploAvancar();
		assertTrue(caminhao.getFuel() <= 0);
		assertTrue(caminhao.getPos() != caminhao.getMAP_SIZE());
		assertTrue(caminhao.getMap(caminhao.getPos()) == 0);
		assertTrue(caminhao.isGameOver());
	}
	public void duploDescarregar() {
		caminhao.descarregar();
		caminhao.descarregar();
	}

	public void duploCarregar() {
		caminhao.carregar();
		caminhao.carregar();
	}

	public void duploVoltar() {
		caminhao.voltar();
		caminhao.voltar();
	}

	public void duploAvancar() {
		caminhao.avancar();
		caminhao.avancar();
	}
	
	public void comboBreaker(){
		duploAvancar();
		duploDescarregar();
		duploVoltar();
	}
}
