package ex03;

public class Vip extends Ingresso{
    private double valorAdicional = 30f;

    @Override
    public void imprimeValor(){
        System.out.printf("Valor do ingresso VIP: R$ %2.f", (getValor() + getValorAdicional()));
    }

    public double getValorAdicional() {
        return valorAdicional;
    }
}
