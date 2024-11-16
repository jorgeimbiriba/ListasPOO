package Testes;
import Modelo.Estudante;
public class TestaEstudante {
    public static void main (String[] args){
        Estudante estudante1 = new Estudante("Marcelo",18,"2024559647");
        Estudante estudante2 = new Estudante("Éder",25,"1247893142");
        Estudante estudante3 = new Estudante("Fernando",25,"2145783689");
        estudante1.exibir();
        System.out.println("********************");
        estudante2.exibir();
        System.out.println("********************");
        estudante3.exibir();
    }
}
