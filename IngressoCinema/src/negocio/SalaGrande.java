package negocio;

public class SalaGrande extends Sala{

    public SalaGrande(int idSessao) {
        super(500, idSessao);
        setValorBilhete(12);
    }

    @Override
    public void comprarIngresso() {
        if (getQtdAssentosDisponiveis() > (getQtdAssentos() * 0.1))
            super.comprarIngresso();
        else
            System.out.println("Só é possível comprar até a sala ter 10% de capacidade");
    }
}
