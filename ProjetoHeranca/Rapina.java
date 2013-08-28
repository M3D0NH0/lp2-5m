package Exercicio1;

public class Rapina extends Ave{
	public Rapina(String especie, boolean cacador){
		super(especie,0, cacador);
	}
	public String toString(){
		String saida="Sou Rapina.\n";
		saida += super.toString();
		return saida;
	}
	
}
