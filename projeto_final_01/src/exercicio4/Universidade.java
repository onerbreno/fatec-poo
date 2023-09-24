package exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
  private String nome;
  private List<Departamento> departamentos;
  private int maximoDeDepartamentos = 50;

  public Universidade(String nome) {
    this.nome = nome; 
    this.departamentos = new ArrayList<Departamento>();
  }

  public void adicionarDepartamento(Departamento departamento) {
    if (this.departamentos.size() >= maximoDeDepartamentos) {
      System.out.println("Máximo de departamentos da universidade foi atingido.");
    } else {
      this.departamentos.add(departamento);
      departamento.universidade = this;
    }
  }
  
  public void listarDepartamentos() {
    System.out.println("Departamentos da Universidade " + this.nome + ":");
    for (Departamento departamento : departamentos) {
      System.out.println(departamento.getNome());
    }
  }
  
  public String getNome() {
    return this.nome;
  }


}
