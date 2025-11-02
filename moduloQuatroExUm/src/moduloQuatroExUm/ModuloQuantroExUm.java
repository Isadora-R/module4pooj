package moduloQuatroExUm;

import java.util.ArrayList;
import java.util.Random;

public class ModuloQuantroExUm {
	ArrayList<Integer> inteiros = new ArrayList<>();

	Random rand = new Random();
	
	public void inicializaLista() {
	    for (int i = 0; i < 10; i++) {
	        int numeroAleatorio = rand.nextInt(100);
	        inteiros.add(numeroAleatorio);
	    }
	}

	
	public void imprimeInteiros() {
		System.out.println("Inteiros da lista: ");
		for (int inteiros : inteiros) {
			System.out.print(inteiros + ", ");
		}
		System.out.println();
	}
	
	public void removeNumero() {
		if(inteiros.size() >= 2) {
			inteiros.remove(2);
		}
	}
	
	public void adicionaNumero(int num) {
		inteiros.add(0, num);
	}
	
	public void verificaNumero(int num) {
		if(inteiros.contains(num)) {
			System.out.println("O números está presente no ArrayList");
		}
		else {
			System.out.println("O número não está presente no ArrayList");
		}
	}
	
	public static void main(String[] args) {
	    ModuloQuantroExUm lista = new ModuloQuantroExUm();
	    
	    lista.inicializaLista();
	    lista.imprimeInteiros();
	    System.out.println("Removendo o terceiro número da lista");
	    lista.removeNumero();
	    lista.imprimeInteiros();
	    System.out.println("Adicionando o número 123 na lista");
	    lista.adicionaNumero(123);
	    lista.imprimeInteiros();
	    System.out.println("Verificando se o número 123 está na lista");
	    lista.verificaNumero(123);
	    System.out.println("Verificando se o número 10 está na lista");
	    lista.verificaNumero(10);
	    lista.imprimeInteiros();
	}
}
