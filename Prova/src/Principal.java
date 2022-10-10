import negocio.Administrativo;
import negocio.Professor;
import ui.Escola;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Escola escola = new Escola();
		escola.cadastrarFuncionario(new Administrativo(1000, 3, 8));
		escola.cadastrarFuncionario(new Professor(2000, 5, 0));
		System.out.println(escola.calcularFolhaPagamento());
		
	}

}
