package testes;
import questao02.Endereco;
import questao02.Pessoa;

public class TestaEndereco {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Barão do Rio Branco",699,"Flores","Manaus","Amazonas");
        Pessoa pessoa = new Pessoa("Jorge Henrique", endereco1);


        System.out.printf("Endereço de " + pessoa.getNome() + ": ");
        System.out.printf(pessoa.getEnderecoPrincipal().getRua());

    }
}
