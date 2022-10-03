package ex02.animais;

public class Cachorro extends Animal{
    public Cachorro(){
        super();
        setRaca("CACHORRO");
    }
    public Cachorro(String nome){
        super(nome);
        setRaca("CACHORRO");
    }

    public String late(){
        return "Au!";
    }
    
    
}
