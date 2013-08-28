package Exercicio1;

public class SistemaAnimal {

	public static void main(String[] args) {
		Animal a = new Roedor("Coelho",4,false);
		System.out.println(a);

		Animal b = new Primata("Primata",2,false);
		System.out.println(b);
		
		Animal c = new Rapina("Rapina",true);
		System.out.println(c);
		
		Animal d = new Domestico("Domestico",2,true);
		System.out.println(d);
	}


}
