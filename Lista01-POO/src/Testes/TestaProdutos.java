package Testes;
import Modelo.Produto;
public class TestaProdutos {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Pratos de porcelana",35.00,200);
        produto1.atualizar(50);
        Produto produto2 = new Produto("Xícaras",25.00,125);
        Produto produto3 = new Produto("Colheres",6,150);
        produto3.atualizar(20);

        System.out.println("Existem "+ produto1.getQuantidadeEmEstoque() + " " + produto1.getNome());
        System.out.println("Cada um custa " + produto1.getPreco() + " reais");
        double valorTotalPratos = produto1.valorTotal();
        System.out.println("Quantidade em estoque após atualização: " + produto1.getQuantidadeEmEstoque());
        System.out.println("O valor total do estoque é de "+ valorTotalPratos + " reais");

        System.out.println("********************");

        System.out.println("Existem "+ produto2.getQuantidadeEmEstoque() + " " + produto2.getNome());
        System.out.println("Cada uma custa " + produto2.getPreco() + " reais");
        double valorTotalXicaras = produto2.valorTotal();
        System.out.println("O valor total do estoque é de "+ valorTotalXicaras + " reais");

        System.out.println("********************");

        System.out.println("Existem "+ produto3.getQuantidadeEmEstoque() + " " + produto1.getNome());
        System.out.println("Cada uma custa " + produto3.getPreco() + " reais");
        double valorTotalColheres = produto3.valorTotal();
        System.out.println("Quantidade em estoque após atualização: " + produto3.getQuantidadeEmEstoque());
        System.out.println("O valor total do estoque é de "+ valorTotalColheres + " reais");
    }
}
