package src;

public class LivrosImpressos extends Livros {
    public LivrosImpressos(String nome, double preco, String descricao, int codigo){
        super(nome, preco, descricao, codigo);
    }

    public LivrosImpressos(String nomeLivro, double preco, String descricao, int codigo, String nomeAutor, String emailAutor){
        super(nomeLivro, preco, descricao, codigo, nomeAutor, emailAutor);
    }

    public void calcularDesconto(){
        super.preco = super.preco * 0.80;
        System.out.println("Preço com desconto: " + super.preco);
    }
    
}
