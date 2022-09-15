package negocio;

public class FilhoNatimorto extends Pessoa {

    public FilhoNatimorto(String nome) {
        super(nome);
    }

    @Override
    public Pessoa cadastrarFilho(Pessoa pessoa) {
        try {
            String eMessage = String.format("Natimorto %s não pode cadastrar filhos!", this.getNome());
            throw new Exception(eMessage);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;

    }
}
