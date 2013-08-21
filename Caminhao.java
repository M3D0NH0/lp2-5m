package Exercicio1;
import java.util.Scanner;
/*
Implementar um jogo, com interface por console, em JAVA.
O objetivo do jogo é fazer com que um caminhão, com tanque de TAM=6 atravesse um caminho de tamanho 10.
O jogador vai insetir comandos: avançar, voltar, carregar e descarregar.
Avançar e voltar movem o caminhão em uma posiçãoe gastam 1 combustivel.
Carregar e descarregar alteram o combustivel do caminhão e de caminho.
Na posição 0, o combustivel disponivel é infinito.
O jogo termina quando o caminhão chegar na ultima posição de caminho, ou quando acabar o combustivel o meio do caminho.
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
				"\nPosição no Mapa: "+posicao+
				"\nQuantidade de Combustivel: "+combustivel+
				"\nQuantidade de Combustiveis Nessa Posição: "+mapa[combustivel];
		return saida;
	}
	public void avancar(){
		if((combustivel > 0)&&(posicao < TAMANHO-1)){
			System.out.println("Você avançou.");
			combustivel--;
			posicao++;
			if(posicao == TAMANHO-1){
				System.out.println("Você Venceu o jogo Parabens S2.");
				System.exit(0);
			}
		}else if(posicao == 0){
			System.out.println("Você está com o Tanque vazio mas pode reabastecer pois está no inicio do Mapa.");
		}else if((combustivel == 0)&&(mapa[posicao] > 0)){
			System.out.println("Você está com o Tanque vazio mas pode reabastecer.");
		}else{
			System.out.println("Você não possui combustivel Suficiente, e não pode recarregar.");
			System.out.println("----------------Game Over----------------");
			System.exit(0);
		}
	}

	public void recuar(){

		if(posicao == 0){
			System.out.println("Você ja está no inicio da Mapa não tem como voltar.");
		}else{
			if((combustivel > 0)){
				System.out.println("Você Recuou.");
				combustivel--;
				posicao--;
			}else if((combustivel == 0)&&(mapa[posicao] > 0)){
				System.out.println("Você está com o Tanque vazio mas pode reabastecer.");
			}else{
				System.out.println("Você não possui combustivel Suficiente, e não pode recarregar.");
				System.out.println("----------------Game Over----------------");
				System.exit(0);
			}
		}
	}
	public void carregar(){
		if(posicao == 0){
			System.out.println("Você reabasteceu.");
			combustivel = 6;
		}else if(mapa[posicao] > 0){
			System.out.println("Você reabasteceu.");
			combustivel++;
			mapa[posicao]--;
		}else{
			System.out.println("Nesta parte do mapa não possui Combustiveis Disponiveis.");
		}
	}
	public void descarregar(){
		if(posicao == 0){

			System.out.println("Você está no inicio do Mapa não pode descarregar");
		}else if(mapa[posicao] == TANQUE){

			System.out.println("Está posição ja possui 6 combustiveis.");
		}else if(mapa[posicao] < TANQUE){

			System.out.println("Você descarregou.");
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
			System.out.println("O que você deseja Fazer?\n" +
					"			Avançar\n" +
					"			Voltar\n" +
					"			Carregar\n" +
					"			Descarregar\n" +
					"			Checar.");
			opcao = sc.next();

			if(opcao.equalsIgnoreCase("avançar")){
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
