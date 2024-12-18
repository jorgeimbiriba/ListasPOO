package questao01;

public class Calculadora implements Operacao {

    @Override
    public double adicionar(double num1,double num2) {
        return num1 + num2;
    }

    @Override
    public double subtrair(double num1,double num2) {
        return num1 - num2;
    }

    @Override
    public double multiplicar(double num1,double num2) {
        return num1*num2;
    }

    @Override
    public double dividir(double num1,double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero");
        }
        return num1 / num2;
    }
}
