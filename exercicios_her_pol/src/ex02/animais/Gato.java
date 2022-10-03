package ex02.animais;

public class Gato extends Animal{
    public Gato(){
        super();
    }
    public Gato(String nome){
        super(nome);
    }

    public String Mia(){
        return "Miau!";
    }
}
