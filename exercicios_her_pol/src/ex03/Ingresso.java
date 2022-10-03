package ex03;

abstract public class Ingresso {
    private double valor;

    public Ingresso(){
        valor = 200f;
    }


    public void imprimeValor(){
        System.out.printf("O valor do ingresso é R$ %.2f", getValor());
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
