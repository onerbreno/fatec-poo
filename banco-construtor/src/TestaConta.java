
public class TestaConta {
	public static void main(String[] args) {
		Conta conta1 = new Conta(213213, "Daninhella");
		Conta conta2 = new Conta(1233, "Brenda");

		conta2.depositar(10000);
		conta2.transferir(2000, conta1);
		
		System.out.println(conta2.getSaldo());
		System.out.println(conta1.getSaldo());
		
	}
}