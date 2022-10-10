package negocio;

public class SalaPequena extends Sala{

    public SalaPequena(int qtdAssentos, int idSessao) {
        super(100, idSessao);
        setValorBilhete(9);
    }
}
