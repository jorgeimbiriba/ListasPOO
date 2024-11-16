package Testes;
import Modelo.Funcionario;

public class TestaFuncionario {
    public static void main(String[] args){
        Funcionario funcionario1 = new Funcionario("Roberto","Gerente",10200);
        Funcionario funcionario2 = new Funcionario("Bruno","Almoxarife",2800);
        Funcionario funcionario3 = new Funcionario("Lorena","Recepcionista",1500);


        funcionario1.horas(2);
        funcionario2.horas(3);
        funcionario3.horas(4);

        funcionario1.exibir();
        System.out.println("****************");
        funcionario2.exibir();
        System.out.println("****************");
        funcionario3.exibir();
    }
}
