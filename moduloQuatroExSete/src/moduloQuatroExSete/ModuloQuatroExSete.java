package moduloQuatroExSete;

public class ModuloQuatroExSete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Elevador elevador = new Elevador(5, 7);

		System.out.println("Andar atual: " + elevador.getAndarAtual());
		System.out.println("Pessoas presentes: " + elevador.getPessoasPresentes());
		System.out.println("Andares visitados: " + elevador.getAndaresVisitados());
		System.out.println("Pessoas saindo por andar: " + elevador.getPessoasSaindo());
		System.out.println("\n---------------------------------------------------------\n");

		elevador.entraPessoa();

		System.out.println("Andar atual: " + elevador.getAndarAtual());
		System.out.println("Pessoas presentes: " + elevador.getPessoasPresentes());
		System.out.println("Andares visitados: " + elevador.getAndaresVisitados());
		System.out.println("Pessoas saindo por andar: " + elevador.getPessoasSaindo());
		System.out.println("\n---------------------------------------------------------\n");
		
		elevador.sobeAndar();
		elevador.entraPessoa();

		System.out.println("Andar atual: " + elevador.getAndarAtual());
		System.out.println("Pessoas presentes: " + elevador.getPessoasPresentes());
		System.out.println("Andares visitados: " + elevador.getAndaresVisitados());
		System.out.println("Pessoas saindo por andar: " + elevador.getPessoasSaindo());
		System.out.println("\n---------------------------------------------------------\n");

		elevador.sobeAndar();
		elevador.saiPessoa();
		elevador.saiPessoa();
		elevador.entraPessoa();

		System.out.println("Andar atual: " + elevador.getAndarAtual());
		System.out.println("Pessoas presentes: " + elevador.getPessoasPresentes());
		System.out.println("Andares visitados: " + elevador.getAndaresVisitados());
		System.out.println("Pessoas saindo por andar: " + elevador.getPessoasSaindo());
		System.out.println("\n---------------------------------------------------------\n");

		elevador.sobeAndar();
		elevador.sobeAndar();
		elevador.sobeAndar();
		elevador.sobeAndar();
		System.out.println("Andar atual: " + elevador.getAndarAtual());
		System.out.println("Pessoas presentes: " + elevador.getPessoasPresentes());
		System.out.println("Andares visitados: " + elevador.getAndaresVisitados());
		System.out.println("Pessoas saindo por andar: " + elevador.getPessoasSaindo());
		System.out.println("\n---------------------------------------------------------\n");

		elevador.saiPessoa();
		elevador.saiPessoa();
		elevador.saiPessoa();

		System.out.println("Andar atual: " + elevador.getAndarAtual());
		System.out.println("Pessoas presentes: " + elevador.getPessoasPresentes());
		System.out.println("Andares visitados: " + elevador.getAndaresVisitados());
		System.out.println("Pessoas saindo por andar: " + elevador.getPessoasSaindo());
		System.out.println("\n---------------------------------------------------------\n");

		elevador.desceAndar();
		elevador.desceAndar();
		elevador.desceAndar();
		elevador.desceAndar();
		elevador.desceAndar();
		elevador.desceAndar();
	}

}
