package src;

public abstract class Livros {

    private String nome;
    protected double preco;
    private String descricao;
    private int codigo;
    private Autor autor;

    public Livros(String nome, double preco, String descricao, int codigo){
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.codigo = codigo;

    }

    public Livros(String nomeLivro, double preco, String descricao, int codigo, String nomeAutor, String emailAutor){
        this.nome = nomeLivro;
        this.preco = preco;
        this.descricao = descricao;
        this.codigo = codigo;
        this.autor = new Autor(nomeAutor, emailAutor);

    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void mostrarDetalhesLivro(){
        System.out.println("Nome do livro: " + this.nome);
        System.out.println("Preço do livro:  R$" + this.preco);
        System.out.println("Descrição do livro: " + this.descricao);
        System.out.println("Código do livro: " + this.codigo);

        if(autor != null){
            System.out.println("Nome do autor: " + this.autor.nome);
            System.out.println("Email do autor: " + this.autor.email);
        }
    }

    public abstract void calcularDesconto();
}