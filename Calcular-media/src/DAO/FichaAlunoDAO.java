package DAO;

import java.util.List;

import model.FichaAluno;

public interface FichaAlunoDAO {
	public void insert(FichaAluno ficha);

	public List<FichaAluno> getAll();
}
