package exercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Controle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Aluno> alunos = new ArrayList<>();

    while (true) {
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        if (nome.toLowerCase().equals("fim")) {
            break;
        }

        System.out.print("Digite a nota 1: ");
        int nota1 = scanner.nextInt();
        System.out.print("Digite a nota 2: ");
        int nota2 = scanner.nextInt();
        
        Aluno aluno = new Aluno(nome, nota1, nota2);
        alunos.add(aluno);
        
        scanner.nextLine();
    }

    scanner.close();

    double somaNotas = 0;

    for (Aluno aluno : alunos) {
      somaNotas += (aluno.nota1 + aluno.nota2) / 2;
    }

    double mediaTurma = somaNotas / alunos.size();

    int aprovados = 0;
    int reprovados = 0;
  
    for (Aluno aluno : alunos) {
      double mediaAluno = (aluno.nota1 + aluno.nota2) / 2;
      if (mediaAluno >= 60) {
        aprovados++;
      } else {
        reprovados++;
      }

      if (aluno.nota1 < mediaTurma || aluno.nota2 < mediaAluno) {
        System.out.println("Aluno " + aluno.nome + " com nota abaixo da média da turma!");
      }
    }

    System.out.println(aprovados + " Aprovados!");
    System.out.println(reprovados + " Reprovados:(");
    
  }
}
