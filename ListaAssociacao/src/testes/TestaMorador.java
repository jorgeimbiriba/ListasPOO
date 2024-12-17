package testes;
import questao03.*;

public class TestaMorador {
        public static void main(String[] args) {
            Morador jorge = new Morador("Jorge");
            Casa casa = new Casa("Rua Barão do Rio Branco, 123");

            casa.setMorador(jorge);

            System.out.println("Morador da casa: " + casa.getMorador().getNome());
            System.out.println("Casa de Jorge: " + jorge.getCasa().getEndereco());
        }

}
