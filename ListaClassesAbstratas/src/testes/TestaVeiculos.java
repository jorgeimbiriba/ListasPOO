package testes;

import questao02.*;

public class TestaVeiculos {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Honda", "Civic", 2023);
        Moto minhaMoto = new Moto("Yamaha", "YZF-R1", 2022);

        meuCarro.acelerar();
        minhaMoto.frear();
    }
}
