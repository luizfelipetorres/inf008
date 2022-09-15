package ui;

import negocio.Filha;
import negocio.Filho;
import negocio.Pessoa;

public class Principal {

    public static void main(String[] args) {
        //Joao raiz
        Pessoa raiz = new Filho("Joao");

        //Filha mulher que pode ou não ter doença (50%)
        Pessoa lulu = raiz.cadastrarFilho(new Filha("Lulu"));

        //Descendente homem de mulher tem 50% de chance de morte
        Pessoa luiz = lulu.cadastrarFilho(new Filho("Luiz"));

        //Se luiz estiver vivo, o primeiro filho sempre vive
        Pessoa vivo = luiz.cadastrarFilho(new Filho("Vivo"));

        //Segundo filho de um homem é natimorto
        Pessoa morto = luiz.cadastrarFilho(new Filha("Morto"));

        //Gambiarra para tratar NPE em caso de cadastrarFilho em natimorto
        try {
            System.out.println("Linhagem de Luiz");
            luiz.listarAscendentes();

            System.out.println("\nLinhagem de Natimorto");
            morto.listarAscendentes();
        } catch (NullPointerException e) {

            System.out.println("Natimorto não pode ter filhos! ");
        }
    }
}
