package Questao2;

public class Programador extends Funcionario {

    public Programador(String nome,double salario,String cargo){
        super(nome,salario,cargo);
    }

    public double calcularBonus(){
        return salario*0.2;
    }
}
