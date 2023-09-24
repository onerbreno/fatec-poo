package src;
public class Autor {
    protected String nome;
    protected String email;

    public Autor(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

}
