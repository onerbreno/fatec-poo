package primeiro_projeto.Carros;

public class Carro {
	private int ano;
	public String marca;

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		if (ano >= 2023) {
			this.ano = ano;
		} else {
			throw new Error("O carro deve ser novo!");
		}
	}
}