package Exercicio1;

public class Primata extends Mamifero{

	public Primata(String especie,int patas,boolean cacador){
		super(especie, patas, cacador);
	}
	public String toString(){
		String saida="Sou Primata.\n";
		
		saida += super.toString();
		
		
		
		return saida;
	}
	
}
