package Modelo;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private double horasExtrasTrabalhadas;

    public String getNome(){
        return nome;
    }

    public String getCargo(){
        return cargo;
    }

    public double getSalario(){
        return salario;
    }
    public Funcionario(String nome,String cargo,double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public double horas(double horasExtrasTrabalhadas){
        this.horasExtrasTrabalhadas = horasExtrasTrabalhadas;
        return aumento();
    }

    public double aumento(){
        return salario + (200*horasExtrasTrabalhadas);
    }

    public void exibir(){
        System.out.println(getNome());
        System.out.println(getCargo());
        if(horasExtrasTrabalhadas>0){
            System.out.println("Seu salário é de: " + getSalario() + " reais");
            System.out.println("Devido às " + horasExtrasTrabalhadas + " horas extras");
            System.out.println("Seu salário no final do mês será: " + aumento() + " reais");
        }else{
            System.out.println(getSalario());
        }
    }
}
