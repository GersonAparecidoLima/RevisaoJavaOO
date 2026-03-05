package br.com.alura;




public class Gerente extends Funcionario {

	
	
	   //  Criando métodos assessores get set
	private double bonus;
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public Gerente(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

}
