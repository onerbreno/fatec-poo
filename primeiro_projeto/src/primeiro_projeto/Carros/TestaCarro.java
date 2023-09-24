package primeiro_projeto.Carros;

public class TestaCarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		carro1.marca = "Vrum vrum";
		carro1.setAno(2000);
		System.out.println("Ano do carro: " + carro1.getAno());
		System.out.println("Marco do carro: " + carro1.marca);
	}

}
