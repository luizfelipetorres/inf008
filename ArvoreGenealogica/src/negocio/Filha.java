package negocio;

import java.util.Random;

public class Filha extends Pessoa {

    @Override
    public String getNome() {
        return "Sra. " + super.getNome();
    }

    public Filha(String nome) {
        super(nome);
    }

    @Override
    public Pessoa cadastrarFilho(Pessoa pessoa) {
        Pessoa filha;
        Random random = new Random();
        int doenca = random.nextInt(2);
        System.out.println(doenca);

        if (doenca == 1 && pessoa.getClass() == Filho.class)
            filha = new FilhoNatimorto(pessoa.getNome());
        else
            filha = pessoa;

        filha.setPai(this);
        getDescendentes().add(filha);
        return filha;
    }
}
