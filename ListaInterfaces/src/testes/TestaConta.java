package testes;

import questao04.Conta;
import questao04.ContaCorrente;
import questao04.ContaPoupanca;
import java.util.ArrayList;
import java.util.List;

public class TestaConta {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();
        contas.add(new ContaCorrente());
        contas.add(new ContaPoupanca());

        contas.get(0).depositar(1000);
        contas.get(1).depositar(500);

        contas.get(0).sacar(200); // Saque de uma conta corrente
        contas.get(1).sacar(300); // Saque de uma conta poupança (acima do limite)

        System.out.println("Saldo da conta corrente: " + contas.get(0).getSaldo());
        System.out.println("Saldo da conta poupança: " + contas.get(1).getSaldo());
    }
}
