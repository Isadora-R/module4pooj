package moduloQuatroExTres;

import java.util.ArrayList;
import java.util.Random;

public class ModuloQuatroExTres {
	
	ArrayList<Integer> inteiros = new ArrayList<>();

	Random rand = new Random();
	
	public void inicializaLista() {
	    for (int i = 0; i < 15; i++) {
	        int numeroAleatorio = rand.nextInt(100);
	        inteiros.add(numeroAleatorio);
	    }
	}

	
	public void imprimeInteiros() {
		for (int inteiros : inteiros) {
			System.out.print(inteiros + ", ");
		}
		System.out.println();
	}
	
	public void removePares() {
	    inteiros.removeIf(num -> num % 2 == 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModuloQuatroExTres lista = new ModuloQuatroExTres();
		
		lista.inicializaLista();
		System.out.println("Lista de números inteiros:");
		lista.imprimeInteiros();
		System.out.println("Remove números pares:");
		lista.removePares();
		lista.imprimeInteiros();

	}

}
