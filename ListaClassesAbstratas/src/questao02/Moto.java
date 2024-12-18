package questao02;

public class Moto extends Veiculo{
    public Moto(String marca, String modelo, int ano){
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar(){
        System.out.println(getModelo() + " acelerando");
    }

    @Override
    public void frear(){
        System.out.println(getModelo() + " freando...");
    }
}
