package Exercicios;

public class AplicacaoAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Michael", 5.5f);
        aluno1.isAprovado();
        System.out.println("Nome do aluno: "+aluno1.getNome());
        System.out.println("Sua nota final: "+ aluno1.getNotaFinal());
        System.out.println("Aprovado? " + aluno1.status);
    }
}
