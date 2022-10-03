package ex02.animais;

public class Gato extends Animal{
    public Gato(){
        super();
        setRaca("GATO");
    }
    public Gato(String nome){
        super(nome);
        setRaca("GATO");
    }

    public String Mia(){
        return "Miau!";
    }
}
