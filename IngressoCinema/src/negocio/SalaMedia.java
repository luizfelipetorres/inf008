package negocio;

public class SalaMedia extends Sala {
    public SalaMedia(int idSessao) {
        super(300, idSessao);
        if (idSessao > 5)
            setValorBilhete(12);
        else
            setValorBilhete(9);
    }
}
