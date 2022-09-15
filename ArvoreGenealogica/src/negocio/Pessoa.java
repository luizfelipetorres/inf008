package negocio;

import java.util.ArrayList;

public abstract class Pessoa {
    private String nome;
    private ArrayList<Pessoa> descendentes;
    private Pessoa pai;

    public Pessoa(String nome) {
        this.setNome(nome);
        this.descendentes = new ArrayList<>();
        this.setPai(null);
    }

    public Pessoa getPai() {
        return pai;
    }

    protected void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Pessoa> getDescendentes() {
        return descendentes;
    }

    public abstract Pessoa cadastrarFilho(Pessoa pessoa);

    public String getNome() {
        return nome;
    }

    public void listarAscendentes() {
        String format;
        String className = this.getClass().getSimpleName();
        if (getPai() != null) {
            format = "%s é descendente de %s (classe: %s)\n";
            System.out.printf(format, getNome(), getPai().getNome(), className);
            getPai().listarAscendentes();
        } else {
            format = "%s é a primeira pessoa da linhagem (classe %s)\n";
            System.out.printf(format, getNome(), className);
        }
    }
}
