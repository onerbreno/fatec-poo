package exercicio1;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa1 = new Pessoa("Albert Einstein");
        Pessoa pessoa2 = new Pessoa("Isaac Newton");

        pessoa1.ajustaDataDeNascimento(14, 3, 1879);
        pessoa2.ajustaDataDeNascimento(4, 1, 1643);

        pessoa1.calculaIdade(23, 9, 2023);
        pessoa2.calculaIdade(23, 9, 2023);


        System.out.println("Idade atual de " + pessoa1.informaNome() + ": " + pessoa1.informaIdade());
        System.out.println("Idade atual de " + pessoa2.informaNome() + ": " + pessoa2.informaIdade());
    }
}
