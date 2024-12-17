package questao02;

public class Pessoa {
    private String nome;
    private Endereco enderecoPrincipal;

    public Pessoa(String nome, Endereco enderecoPrincipal) {
        this.nome = nome;
        this.enderecoPrincipal = enderecoPrincipal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEnderecoPrincipal (Endereco endereco){
        this.enderecoPrincipal = enderecoPrincipal;
    }

    public Endereco getEnderecoPrincipal() {
        return enderecoPrincipal;
    }

}
