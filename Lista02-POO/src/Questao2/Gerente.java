package Questao2;

public class Gerente extends Funcionario {

    public Gerente(String nome,double salario,String cargo){
        super(nome,salario,cargo);
    }

    public double calcularBonus(){
        return salario*0.3;
    }
}
