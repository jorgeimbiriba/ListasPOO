package questao04;

public class ContaCorrente implements Conta {
    private double saldo = 0;

    @Override
    public double depositar(double valor) {
        return saldo += valor;
    }

    @Override
    public double sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
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
