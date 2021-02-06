package Exercicios;

public class AplicacaoCalculadora {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        // usando variável para colocar o método.
      int soma =  c.soma(2,9);

        System.out.println(" Valor soma:" + soma);
        // usando o método diretamente na impressão no terminal
        System.out.println("subtração: "+ c.subtrai(3,1) );
        System.out.println("divisão: " + c.divide(8,3));
        System.out.println("Multiplicação: " + c.multiplica(5,5));
    }
}
