
//Com o abstract, não será mais possível cria um objeto a partir dela, somente as que herdam ela
//Cria uma classe abstrata
//Caracteristicas, pode ter metodos e metodos abstratos 

public abstract class Conta {
	static int incremento;
	private int numConta;
	private int id;
	protected double saldo;
	private String nomeTitular;

	public Conta(int numConta, String nomeTitular) {
		this.id = incremento++;
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void depositar(double valor) {
		if (valor < 0) {
			throw new Error("Valor deve ser positivo");
		}

		this.saldo += valor;
	}

	public abstract void sacar(double valor);

	public void transferir(double valor, Conta destino) {
		if (this.saldo < valor) {
			throw new Error("Saldo insuficiente");
		}
		
		this.sacar(valor);
		destino.depositar(valor);
	}

}
