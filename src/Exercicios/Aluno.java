package Exercicios;

public class Aluno {
    private String nome;
    private double notaFinal;
    public boolean status;

    public Aluno(String aluno, float notaFinal) {
        this.nome = aluno;
        this.notaFinal = notaFinal;
    }
    public boolean isAprovado(){
        if(this.notaFinal >= 7){
            this.status = true;
        }else{
            this.status = false;
        }
        return this.status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String aluno) {
        this.nome = aluno;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }
}
