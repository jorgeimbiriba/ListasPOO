package Teste;
import Questao2.*;
public class TestaFuncionarios {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Eduardo",2500,"Gerente de Estoque");
        Programador programador1 = new Programador("Henrique",2850,"Desenvolvedor Junior");
        Secretaria secretaria1 = new Secretaria("Natália",2400,"Secretária Pessoal do Presidente");



        System.out.println(gerente1.getNome() + " seu bônus será de " + gerente1.calcularBonus() + " reais");
        System.out.println(programador1.getNome() + " seu bônus será de " +programador1.calcularBonus() + " reais");
        System.out.println(secretaria1.getNome() + " seu bônus será de " +secretaria1.calcularBonus() + " reais");
    }
}
