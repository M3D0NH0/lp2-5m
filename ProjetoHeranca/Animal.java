package Exercicio1;

public class Animal{
	private String especie;
	private int patas;
	private boolean cacador;
	
	
	
	public Animal(String especie, int patas, boolean cacador){
		
		this.especie = especie;
		this.patas = patas;
		this.cacador = cacador;
		
	}
	
	public String getEspecie(){
		return especie;
	}
	
	public int getPatas(){
		return patas;
	}
	
	public boolean isCacador(){
		return cacador;
	}
	public boolean isPresa(){
		return !cacador;
	}
	
	public String toString(){
		String saida="";
		
		if(isCacador()){
			saida +="Sou Caçador.\n";
		}else{
			saida +="Não sou Cacador.\n";
		}
		
		switch(getPatas()){
		case 0:
			saida +="Consigo Voar.\n";
			break;
		case 2:
			saida +="Sou Bipede.\n";
			break;
		case 4:
			saida +="Sou Quadrupede.\n";
			break;
		default:
			saida += String.format("Tenho %d patas.", getPatas());
			break;
		}
			
		return saida;
	}
	
	
}
