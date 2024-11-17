package Teste;
import Questao4.*;
public class TestaProdutos {
    public static void main(String[] args) {
        Livro livro = new Livro("O Senhor dos Anéis", 50.0, 10, "J.R.R. Tolkien");
        Eletronico celular = new Eletronico("iPhone 14", 8000.0, 5, "Apple");
        Alimento leite = new Alimento("Leite Integral", 4.5, 20, "30/11/2023");

        livro.exibirDetalhes();
        System.out.println();
        celular.exibirDetalhes();
        System.out.println();
        leite.exibirDetalhes();
    }
}