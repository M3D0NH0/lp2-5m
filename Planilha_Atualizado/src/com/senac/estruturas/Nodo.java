package app;

public class Nodo {
	private Nodo prox;
	private Celula celula;
	private String posicao;
	
	public Nodo(Celula celula, String posicao){
		this.celula = celula;
		this.posicao = posicao;
	}
	
	public Nodo(){
		
	}
	
	public void criaCelula(String posicao, String equacao){
		Celula celula1;
		celula1 = new Celula(posicao, equacao);
		this.celula.setProximo(celula1);
		
	}
	
	public Nodo getProximo(){
		return this.prox;
	}
	
	public void setProximo(Nodo nodo){
		this.prox = nodo;
	}
	
	public Celula getCelula(){
		return this.celula;
	}
	
	public String getPosicao(){
		return this.posicao;
	}
	
	public String toString(){
		String saida="";
		
		saida += "\nPosicao do Nodo : " + getPosicao()+
				 "\nPosicao da Celula : " + celula.getPosicao()+
				 "\nEquacao Celula : " + celula.getEquacao();
				
		return saida;
	}
	
	
}
