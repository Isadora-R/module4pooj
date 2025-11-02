package moduloQuatroExSeis;

import java.util.ArrayList;

public class ModuloQuatroExSeis {

	ArrayList<String> palavras = new ArrayList<>();
	ArrayList<String> filtradas = new ArrayList<>();

	public void inicializaLista() {
		palavras.add("itabira");
		palavras.add("unifei");
		palavras.add("java");
		palavras.add("aula");
		palavras.add("java");
		palavras.add("teste");
		palavras.add("objeto");
		palavras.add("filtragem");
		palavras.add("lista");
		palavras.add("unifei");
	}

	public ArrayList<String> filtraElementos() {
		for (String string : palavras) {
			if (string.length() > 5) {
				filtradas.add(string);
			}
		}
		return filtradas;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ModuloQuatroExSeis lista = new ModuloQuatroExSeis();
		lista.inicializaLista();
		
		
		
		 ArrayList<String> listaFiltrada = lista.filtraElementos();

	        try {
	            if (listaFiltrada.isEmpty()) {
	                throw new NoMatchingElementsException("Lista filtrada está vazia, sem palavras com mais de 5 caracteres.");
	            } else {
	                System.out.println("Palavras filtradas: " + listaFiltrada);
	            }
	        } catch (NoMatchingElementsException e) {
	            System.out.println("Erro: " + e.getMessage());
	        }

	}

}
