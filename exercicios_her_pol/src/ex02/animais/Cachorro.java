package ex02.animais;

public class Cachorro extends Animal{
    public Cachorro(){
        super();
    }
    public Cachorro(String nome){
        super(nome);
    }

    public String late(){
        return "Au!";
    }
}
