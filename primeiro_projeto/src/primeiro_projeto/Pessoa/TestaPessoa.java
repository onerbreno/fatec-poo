package primeiro_projeto.Pessoa;

public class TestaPessoa {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Daninhella", 19, "Curaçum of Beno", 2323);
		// System.out.println("Nome: " + pessoa1.getNome() + "\nEndereço: " + pessoa1.getEndereco());
		pessoa1.mostrarPessoa();
		
		Pessoa pessoa2 = new Pessoa("Breno", 19, "Coração da Daninhella", 2324);
		// System.out.println("Nome: " + pessoa2.getNome() + "\nEndereço: " + pessoa2.getEndereco());
	};
	
}