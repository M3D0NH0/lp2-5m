package Exercicio1;
import java.util.Scanner;
/*
Implementar um jogo, com interface por console, em JAVA.
O objetivo do jogo � fazer com que um caminh�o, com tanque de TAM=6 atravesse um caminho de tamanho 10.
O jogador vai insetir comandos: avan�ar, voltar, carregar e descarregar.
Avan�ar e voltar movem o caminh�o em uma posi��oe gastam 1 combustivel.
Carregar e descarregar alteram o combustivel do caminh�o e de caminho.
Na posi��o 0, o combustivel disponivel � infinito.
O jogo termina quando o caminh�o chegar na ultima posi��o de caminho, ou quando acabar o combustivel o meio do caminho.
 */
public class Caminhao {
	private int TAMANHO=10;
	private int[] mapa = new int[TAMANHO];
	private int TANQUE=6;
	private int posicao = 0;
	private int combustivel = 6;

	public String imprimeStatus(){
		String saida="";
		saida += "Tamanho do Mapa: "+TAMANHO+
				"\nTamanho do Tanque: "+TANQUE+
				"\nPosi��o no Mapa: "+posicao+
				"\nQuantidade de Combustivel: "+combustivel+
				"\nQuantidade de Combustiveis Nessa Posi��o: "+mapa[combustivel];
		return saida;
	}
	public void avancar(){
		if((combustivel > 0)&&(posicao < TAMANHO-1)){
			System.out.println("Voc� avan�ou.");
			combustivel--;
			posicao++;
			if(posicao == TAMANHO-1){
				System.out.println("Voc� Venceu o jogo Parabens S2.");
				System.exit(0);
			}
		}else if(posicao == 0){
			System.out.println("Voc� est� com o Tanque vazio mas pode reabastecer pois est� no inicio do Mapa.");
		}else if((combustivel == 0)&&(mapa[posicao] > 0)){
			System.out.println("Voc� est� com o Tanque vazio mas pode reabastecer.");
		}else{
			System.out.println("Voc� n�o possui combustivel Suficiente, e n�o pode recarregar.");
			System.out.println("----------------Game Over----------------");
			System.exit(0);
		}
	}

	public void recuar(){

		if(posicao == 0){
			System.out.println("Voc� ja est� no inicio da Mapa n�o tem como voltar.");
		}else{
			if((combustivel > 0)){
				System.out.println("Voc� Recuou.");
				combustivel--;
				posicao--;
			}else if((combustivel == 0)&&(mapa[posicao] > 0)){
				System.out.println("Voc� est� com o Tanque vazio mas pode reabastecer.");
			}else{
				System.out.println("Voc� n�o possui combustivel Suficiente, e n�o pode recarregar.");
				System.out.println("----------------Game Over----------------");
				System.exit(0);
			}
		}
	}
	public void carregar(){
		if(posicao == 0){
			System.out.println("Voc� reabasteceu.");
			combustivel = 6;
		}else if(mapa[posicao] > 0){
			System.out.println("Voc� reabasteceu.");
			combustivel++;
			mapa[posicao]--;
		}else{
			System.out.println("Nesta parte do mapa n�o possui Combustiveis Disponiveis.");
		}
	}
	public void descarregar(){
		if(posicao == 0){

			System.out.println("Voc� est� no inicio do Mapa n�o pode descarregar");
		}else if(mapa[posicao] == TANQUE){

			System.out.println("Est� posi��o ja possui 6 combustiveis.");
		}else if(mapa[posicao] < TANQUE){

			System.out.println("Voc� descarregou.");
			mapa[posicao]++;
			combustivel --;
		}
	}


	public static void main(String[] args) {
		Caminhao carro=new Caminhao();
		boolean loop=false;
		Scanner sc= new Scanner(System.in);
		System.out.println(carro.imprimeStatus());

		do{



			String opcao = "";
			System.out.println("O que voc� deseja Fazer?\n" +
					"			Avan�ar\n" +
					"			Voltar\n" +
					"			Carregar\n" +
					"			Descarregar\n" +
					"			Checar.");
			opcao = sc.next();

			if(opcao.equalsIgnoreCase("avan�ar")){
				carro.avancar();
			}else if(opcao.equalsIgnoreCase("voltar")){
				carro.recuar();
			}else if(opcao.equalsIgnoreCase("carregar")){
				carro.carregar();
			}else if(opcao.equalsIgnoreCase("descarregar")){
				carro.descarregar();
			}else if(opcao.equalsIgnoreCase("checar")){
				System.out.println(carro.imprimeStatus());
			}



		}while(loop !=true);

		sc.close();



	}
}
