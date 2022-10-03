package ex02.pessoas;

public class Rica extends Pessoa{
    private double dinheiro;

    public void fazCompras(double valor){
        if (valor >= dinheiro)
            dinheiro -= valor;
        else
            System.out.println("Dinheiro insuficiente!");
    }
}
