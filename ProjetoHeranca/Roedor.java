package Exercicio1;

public class Roedor extends Mamifero {
	
	public Roedor(String especie, int patas, boolean cacador){
		super(especie,patas,cacador);
	}
	public String toString(){
		String saida="Sou Roedor.\n";
		saida+= super.toString();
		return saida;
		
	}
}
