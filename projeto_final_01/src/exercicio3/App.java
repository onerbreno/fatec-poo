package exercicio3;

public class App {
    public static void main(String[] args) throws Exception {
        Universidade universidade1 = new Universidade("Princeton");
        Universidade universidade2 = new Universidade(" Cambridge");

        Pessoa pessoa1 = new Pessoa("Einstein", universidade1, 0, 0, 0);
        Pessoa pessoa2 = new Pessoa("Newton", universidade2, 0, 0, 0);

        pessoa1.informaNomeUniversidade();
        pessoa2.informaNomeUniversidade();

    }
}
