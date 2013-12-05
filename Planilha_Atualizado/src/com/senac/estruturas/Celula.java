package app;

public class Celula {
	
		private String equacao;
		private String posicao;
		private String valor;
		private Celula proximo;
	
	public Celula(String posicao,String equacao){
		this.equacao = equacao;
		this.posicao = posicao;
	}
	public Celula(){
		
	}
	
	public String getEquacao(){
		return this.equacao;
	}
	
	public void setEquacao(String equacao){
		this.equacao = equacao;
	}
	
	public String getPosicao(){
		return posicao;
	}
	
	public void setValor(){
		this.valor = valor;
	}
	
	public String getValor(){
		return valor;
	}
	
	public Celula getProximo(){
		return this.proximo;
	}
	
	public void setProximo(Celula celula){
		this.proximo = celula;
	}
	
	
}
