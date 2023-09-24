package exercicio3;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
  private int idade;
  private String nome;
  public int diaNascimento;
  public int mesNascimento;
  public int anoNascimento;
  private Universidade universidade;


  public Pessoa (String nome, Universidade instanciaUniversidade, int dia, int mes, int ano) {
    this.nome = nome;
    this.diaNascimento = dia;
    this.mesNascimento = mes;
    this.anoNascimento = ano;    
    this.universidade = instanciaUniversidade;
  }
  
  public void informaNomeUniversidade() {
    System.out.println(this.nome + " trabalhou na universidade: " + this.universidade.getNome());
  }

  public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
    LocalDate dataNascimento = LocalDate.of(this.anoNascimento, this.mesNascimento, this.diaNascimento);
    LocalDate dataAtual = LocalDate.of(anoAtual, mesAtual, diaAtual);
      Period periodo = Period.between(dataNascimento, dataAtual);
      
    this.idade = periodo.getYears();
  }

  public int informaIdade() {
    return this.idade;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
