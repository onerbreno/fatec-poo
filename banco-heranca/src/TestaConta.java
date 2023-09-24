
public class TestaConta {
	public static void main(String[] args) {


		ContaCorrente c1 = new ContaCorrente(25466, "Denise");
		ContaPoupanca c2 = new ContaPoupanca(25466, "Osmam");
		ContaInvestimento c3 = new ContaInvestimento(3547448, "Breno");

		c1.depositar(500);
		c2.depositar(1000);
		c3.depositar(2000);

		c1.sacar(200);
		c2.sacar(500);
		c3.sacar(1000);

		System.out.println(c1.getNomeTitular());
		System.out.println(c1.getSaldo());

		System.out.println(c2.getNomeTitular());
		System.out.println(c2.getSaldo());

		System.out.println(c3.getNomeTitular());
		System.out.println(c3.getSaldo());
	
	}
}