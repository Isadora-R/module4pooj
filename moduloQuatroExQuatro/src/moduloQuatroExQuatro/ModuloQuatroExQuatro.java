package moduloQuatroExQuatro;

import java.util.ArrayList;

public class ModuloQuatroExQuatro {
	
	private ArrayList<Produto> produtos = new ArrayList<>();
	
	public void adicionarProduto(Produto p) {
		produtos.add(p);
	}
	
	public String procuraProdutoMaisCaro() throws Exception {
		if (produtos.isEmpty()) {
			throw new Exception("A lista de produtos está vazia!!!");
		}
		
		Produto aux = produtos.get(0);
		for (Produto produto : produtos) {
			if (produto.getPreco() > aux.getPreco()) {
				aux = produto;
			}
		}
		return aux.getNome();
	}
	
	public void imprimeProdutos() {
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		ModuloQuatroExQuatro listaProdutos = new ModuloQuatroExQuatro();
		
		listaProdutos.adicionarProduto(new Produto("Arroz", 12.30));
		listaProdutos.adicionarProduto(new Produto("Feijão", 4.32));
		listaProdutos.adicionarProduto(new Produto("Sal", 1.99));
		listaProdutos.adicionarProduto(new Produto("Trigo", 2.34));
		listaProdutos.adicionarProduto(new Produto("Leite", 5.67));
		
		System.out.println("Produtos na lista: ");
		listaProdutos.imprimeProdutos();
		
		String aux;
		
			aux = listaProdutos.procuraProdutoMaisCaro();
			System.out.println("Produto mais caro da lista: " + aux);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
