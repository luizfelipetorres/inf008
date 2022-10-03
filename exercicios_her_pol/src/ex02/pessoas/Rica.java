package ex02.pessoas;

public class Rica extends Pessoa{
    private double dinheiro;
    public Rica() {
    	this.dinheiro = Double.MAX_VALUE;
    }

    public void fazCompras(){
    	System.out.println("Comprei! Sou rico");
    }
    
    public void exibirFortuna() {
    	System.out.printf("Meu patrimonio líquido é de R$ %.2f\n", this.dinheiro);
    }
}
