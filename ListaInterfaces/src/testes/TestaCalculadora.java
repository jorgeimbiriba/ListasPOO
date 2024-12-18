package testes;
import questao01.Calculadora;

public class TestaCalculadora {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        double resultadoAdicao = calculadora.adicionar(5, 3);
        double resultadoSubtracao = calculadora.subtrair(10, 4);
        double resultadoMultiplicacao = calculadora.multiplicar(2, 6);
        double resultadoDivisao = calculadora.dividir(15, 3);

        System.out.println("Adição: " + resultadoAdicao);
        System.out.println("Subtração: " + resultadoSubtracao);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);
        System.out.println("Divisão:"+ resultadoDivisao);
    }
}
