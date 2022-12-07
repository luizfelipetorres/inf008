package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import data.Conexao;
import model.FichaAluno;

public class FichaAlunoImpl implements FichaAlunoDAO {
	private Conexao conexao;

	public FichaAlunoImpl(Conexao conn) {
		super();
		this.conexao= conn;
	}

	@Override
	public void insert(FichaAluno ficha) {
		try {
			Statement stm = conexao.getConnection().createStatement();
			String sql = String.format(
					"INSERT INTO FICHA_ALUNO "
					+ "(NOME, PROVA1, PROVA2, TRABALHO) VALUES" + 
					"('%s', %f, %f, %f)",
					ficha.getNomeAluno(), 
					ficha.getProva1(), 
					ficha.getProva2(), 
					ficha.getTrabalho()
			);
			stm.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<FichaAluno> getAll() {
		String sql = "SELECT * FROM FICHA_ALUNO";
		List<FichaAluno> list = new ArrayList();
		try {
			Statement stm =  conexao.getConnection().createStatement();
			ResultSet result = stm.executeQuery(sql);
			while(result.next()) {
				FichaAluno ficha = new FichaAluno.Builder()
						.setNome(result.getString("nome"))
						.setProva1(result.getDouble("prova1"))
						.setProva2(result.getDouble("prova2"))
						.setTrabalho(result.getDouble("trabalho"))
						.build();
				list.add(ficha);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return list;
	}
}
