package negocio;

import java.util.*;
import java.util.function.BinaryOperator;

public class Forca {
    
    private String categoria;
    private String filmes[] = {"A era do Gelo 1","A era do Gelo 2", "Os incriveis"};
    private String novelas[] = {"Bang Bang","Vamp", "Bebe a Bordo"};
    private String marcas[] = {"Gol","Golf", "Fiesta"};
    private String palavra = "";
    private char[] palavraPreenchida;
    private Map<String, String> letras;
    
    public String getPalavraPreenchida() {
		return palavraPreenchida.stream().for


	private List<Character> lista;
 
    
    public String getCategoria() {
        return this.categoria;
    }
    
    public Forca(String categoria) {
		super();
		this.palavraPreenchida = new ArrayList();
		setCategoria(categoria);
	}


	public void setCategoria(String categoria) {
        Random r=new Random();
        int i=r.nextInt(3);
        this.categoria = categoria;
        if(this.categoria.equals("Filmes")){
            this.setPalavra(this.filmes[i]);
        }else if(this.categoria.equals("Novelas")){
            this.setPalavra(this.novelas[i]);
        }else{
            this.setPalavra(this.marcas[i]);
        }
    }
    
    public void preencher(Character c) {
    	if (palavraPreenchida == null) {
    		for (int i = 0; i < palavra.length(); i++) {
    			Character concat = ((Character) palavra.toCharArray()[i]).equals(' ') ? ' ' : '_';
    			palavraPreenchida.add(concat);
    		}    		
    	}else {
    		for (int i = 0; i < palavraPreenchida.size(); i++) {
    			if (palavra.charAt(i) == c && palavraPreenchida.get(i) == '_') {
    				palavraPreenchida.set(i, c);
    			}
    		}    
    	}
    }
    
    public void verificarResultado(String c) {
    	if (possuiLetra(c)) {
    		preencher(c.charAt(0));
    	}else {
    		
    	}
    }
    
    public boolean possuiLetra(String c) {
    	return palavra.contains(c) ? true : false; 
    }


	public String getPalavra() {
		return palavra;
	}


	public void setPalavra(String palavra) {
		this.palavra = palavra;
		preencher(' ');
	}
}
