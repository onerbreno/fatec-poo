package primeiro_projeto.Pessoa;

public class Pessoa {
    private String nome;
    private int idade; 
    private String endereco;
    private long cpf;
 
    public Pessoa(String nome, int idade, String endereco, int cpf) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    public void mostrarPessoa() {
		System.out.println("Nome: " + this.getNome() + "\nEndereço: " + this.getEndereco());
    }

    public String getNome(){
        return this.nome;
    }   

    public void setNome(String nome){
        this.nome = nome;
    }    

    public int getIdade(){
        return this.idade;
    }    

    public void setIdade(int idade){
        this.idade = idade;
    }    

    public String getEndereco(){
        return this.endereco;
    }    
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }    

    public long getCpf(){
        return this.cpf;
    }    

    public void setCpf(int cpf){
        this.cpf = cpf;
    }    
    

}
