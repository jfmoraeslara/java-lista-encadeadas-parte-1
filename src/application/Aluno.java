package application;

public class Aluno {

	private int matricula;
	private String nome;
	
	public Aluno() {		
	}
	
	public Aluno(int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Aluno: Matricula = " + matricula + ", nome = " + nome + "";
	}		

}

