package src;

public class LivrosDigitais  extends Livros{

    public LivrosDigitais(String nome, double preco, String descricao, int codigo){
        super(nome, preco, descricao, codigo);
    }

    public LivrosDigitais(String nomeLivro, double preco, String descricao, int codigo, String nomeAutor, String emailAutor){
        super(nomeLivro, preco, descricao, codigo, nomeAutor, emailAutor);
    }

    public void calcularDesconto(){
        super.preco = super.preco * 0.90;
        System.out.println("Preço com desconto: " + super.preco);
    }
    
}
