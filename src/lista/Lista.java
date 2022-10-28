package lista;

public class Lista implements ListaEncadeada {
	// elemento de controle de primeiro e ultimo
	private Elemento primeiro;
	private Elemento ultimo;
	private int tamanho;

	@Override
	public void adiciona(int valor) {
		Elemento elemento = new Elemento(valor);
		if (primeiro == null) {
			primeiro = elemento;
			ultimo = elemento;
		} else {
			ultimo.setProximo(elemento);
			ultimo = elemento;			
		}
		tamanho++;	
	}

	@Override
	public void remove() {
		if(tamanho == 0) {
			System.out.println("Lista vazia!");			
		} else {
			primeiro = primeiro.getProximo();			
		}
		tamanho--;	
	}

	@Override
	public boolean procura(int valor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void listaElementos() {
		// TODO Auto-generated method stub		
	}

	@Override
	public void esvazia() {
				
	}
}
