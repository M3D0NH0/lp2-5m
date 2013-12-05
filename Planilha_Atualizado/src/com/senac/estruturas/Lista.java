package app;

public class Lista {
	private String posicao;
	private Nodo nodo;
	private Lista proximo;
	private Nodo nodoAux;
	
	public Lista(Nodo nodo1, String posicao){
		this.nodo = nodo1;
		this.posicao = posicao;
	}
	public Lista(String posicao){
		this.posicao = posicao;
	}
	
	public void criaNodo(Celula celula, String posicao){
		
		Nodo nodo1 = new Nodo(celula,posicao);
		
		if(nodo == null){
			nodo = nodo1;
		} else if(nodo.getProximo() == null){
			nodo.setProximo(nodo1);
		} else {
			nodoAux = nodo;
			while(nodoAux.getProximo() != null){
				
				nodoAux = nodoAux.getProximo();
				
			}
			
			this.nodoAux.setProximo(nodo1);
		}
		//nodo = NodoAux;
		//this.nodo.setProximo(nodo1);

	}
	
	public Lista getProximo(){
		return this.proximo;
	}
	
	
	public void setProximo(Lista lista){
		this.proximo = lista;
	}
	
	public Nodo getNodo(){
		return nodo;
	}
	
	public String getPosicao(){
		return posicao;
	}
	
	public String toString(){
		String saida="";
		
		saida += "\nLista: "+
				"\nPosicao da Lista : " + getPosicao()+
				nodo.toString();
		if(nodo.getProximo() == null){

		}else{
			while(nodo.getProximo() != null){
				nodoAux = nodo.getProximo();
				nodo = nodoAux;


				saida += nodo.toString();
			}
		}

		return saida;
	}


}
