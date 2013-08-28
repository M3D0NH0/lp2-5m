package Exercicio1;

public class Domestico extends Ave{
	
	public Domestico(String especie, int patas, boolean cacador){
		super(especie, patas, cacador);
	}
	public String toString(){
		String saida="Sou Domestico.\n";
		saida += super.toString();
		return saida;
	}
}
