package moduloQuatroExDois;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class ModuloQuatroExDois {

    ArrayList<Double> decimais = new ArrayList<>();
    Random rand = new Random();

    public void inicializaLista() {
        for (int i = 0; i < 10; i++) {
            double numeroAleatorio = rand.nextDouble() * 100;
            decimais.add(numeroAleatorio);
        }
    }

    public void imprimeNumeros() {
        for (double num : decimais) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }
    
    public void ordenaCrescente() {
        Collections.sort(decimais);
    }

    
    public void ordenaDecrescente() {
        Collections.sort(decimais, Collections.reverseOrder());
    }

    public static void main(String[] args) {
        ModuloQuatroExDois lista = new ModuloQuatroExDois();
        lista.inicializaLista();
        System.out.println("Lista com númros aleatórios:");
        lista.imprimeNumeros();
        
        lista.ordenaCrescente();
        System.out.println("Em ordem crescente:");
        lista.imprimeNumeros();

        lista.ordenaDecrescente();
        System.out.println("Em ordem decrescente:");
        lista.imprimeNumeros();
    }
}
