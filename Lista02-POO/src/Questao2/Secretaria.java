package Questao2;

public class Secretaria extends Funcionario {

    public Secretaria(String nome, double salario,String cargo){
        super(nome,salario,cargo);
    }

    public double calcularBonus(){
        return salario*0.1;
    }
}
