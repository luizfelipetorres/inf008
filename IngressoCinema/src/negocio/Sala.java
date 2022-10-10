package negocio;

abstract public class Sala {
    private int qtdAssentos;
    private int idSessao;
    private double valorBilhete;

    private int qtdAssentosDisponiveis;

    public void comprarIngresso(){
        if (qtdAssentosDisponiveis > 0){
            qtdAssentosDisponiveis--;
            System.out.println("Ingresso comprado!");
        }
        else {
            System.out.println("Sala lotada!");
        }
    }

    public double getLucroSala(){
        return valorBilhete * (qtdAssentos - qtdAssentosDisponiveis);
    }

    public Sala(int qtdAssentos, int idSessao) {
        this.qtdAssentos = qtdAssentos;
        this.idSessao = idSessao;
        this.valorBilhete = 0;
        this.qtdAssentosDisponiveis = qtdAssentos;
    }

    public int getQtdAssentos() {
        return qtdAssentos;
    }

    public void setQtdAssentos(int qtdAssentos) {
        this.qtdAssentos = qtdAssentos;
    }

    public int getIdSessao() {
        return idSessao;
    }

    public void setIdSessao(int idSessao) {
        this.idSessao = idSessao;
    }

    public double getValorBilhete() {
        return valorBilhete;
    }

    public void setValorBilhete(double valorBilhete) {
        this.valorBilhete = valorBilhete;
    }

    public int getQtdAssentosDisponiveis() {
        return qtdAssentosDisponiveis;
    }

    public void setQtdAssentosDisponiveis(int qtdAssentosDisponiveis) {
        this.qtdAssentosDisponiveis = qtdAssentosDisponiveis;
    }

    public int getQtdPessoas(){
        return qtdAssentos - qtdAssentosDisponiveis;
    }
}
