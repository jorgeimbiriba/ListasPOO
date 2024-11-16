package Modelo;

public class Estudante {
    private String nome;
    private int idade;
    private String matricula;

    public String getNome() {
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getMatricula(){
        return matricula;
    }

    public void exibir(){
        System.out.println(getNome());
        System.out.println(getIdade());
        System.out.println(getMatricula());
    }

    public Estudante(String nome,int idade,String matricula){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }
}
