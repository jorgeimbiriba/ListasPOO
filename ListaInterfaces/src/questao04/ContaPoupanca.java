package questao04;

public class ContaPoupanca implements Conta{
    private double saldo = 0;

    @Override
    public double depositar(double valor) {
       return saldo += valor;

    }

    @Override
    public double sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else if (valor > 500) {
            System.out.println("Saque acima do limite diário.");
        } else {
            saldo -= valor;
        }
        return valor;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}
