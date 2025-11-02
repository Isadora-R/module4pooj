package moduloQuatroExSete;

import java.util.ArrayList;

public class Elevador {

	private int andarAtual;
	private int totalAndares;
	private int capacidade;
	private int pessoasPresentes;

	private ArrayList<Integer> andaresVisitados = new ArrayList<>();
	private ArrayList<Integer> pessoasSaindo = new ArrayList<>();

	public Elevador(int totalAndares, int capacidade) {
		this.andarAtual = 0;
		this.totalAndares = totalAndares;
		this.capacidade = capacidade;
		this.pessoasPresentes = 0;
	}

	public void entraPessoa() {
		if (pessoasPresentes < capacidade) {
			pessoasPresentes++;
		} else {
			System.out.println("Elevador atingiu sua capacidade máxima de " + capacidade + " pessoas.");
		}
	}

	public void saiPessoa() {
		if (pessoasPresentes > 0) {
			pessoasPresentes--;

			if (pessoasSaindo.size() <= andarAtual) {
				for (int i = pessoasSaindo.size(); i <= andarAtual; i++) {
					pessoasSaindo.add(0);
				}
			}
			pessoasSaindo.set(andarAtual, pessoasSaindo.get(andarAtual) + 1);
		} else {
			System.out.println("O elevador está vazio!");
		}
	}

	public void sobeAndar() {
		if (andarAtual == this.totalAndares) {
			System.out.println("Elevador está no último andar.");
		} else {
			this.andarAtual++;
			andaresVisitados.add(andarAtual);
		}
	}

	public void desceAndar() {
		if (andarAtual == 0) {
			System.out.println("Elevador está no térreo.");
		} else {
			andarAtual--;
			andaresVisitados.add(andarAtual);

		}
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public int getPessoasPresentes() {
		return pessoasPresentes;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public ArrayList<Integer> getAndaresVisitados() {
		return andaresVisitados;
	}

	public ArrayList<Integer> getPessoasSaindo() {
		return pessoasSaindo;
	}

}
