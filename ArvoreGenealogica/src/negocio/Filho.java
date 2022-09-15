package negocio;


public class Filho extends Pessoa {

    public Filho(String nome) {
        super(nome);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String getNome() {
        return "Sr. " + super.getNome();
    }

    @Override
    public Pessoa cadastrarFilho(Pessoa pessoa) {
        Pessoa filho;
        if (this.getDescendentes().size() == 1)
            filho = new FilhoNatimorto(pessoa.getNome());
        else
            filho = pessoa;

        filho.setPai(this);
        this.getDescendentes().add(filho);
        return filho;
    }
}
