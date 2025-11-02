package moduloQuatroExCinco;

import java.util.ArrayList;

public class ModuloQuatroExCinco {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ArrayList<String> numeros = new ArrayList<>();
        
        numeros.add("10");
        numeros.add("20");
        numeros.add("abc");
        numeros.add("30");
        

        ArrayList<Integer> numerosConvertidos = new ArrayList<>();

        for (String s : numeros) {
            try {
                int num = Integer.parseInt(s);
                numerosConvertidos.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Erro ao converter \"" + s + "\": " + e.getMessage());
            }
        }

        System.out.println("\nNúmeros que foram convertidos com sucesso:");
        for (int n : numerosConvertidos) {
            System.out.print(n + " ");
        }
    }

}
