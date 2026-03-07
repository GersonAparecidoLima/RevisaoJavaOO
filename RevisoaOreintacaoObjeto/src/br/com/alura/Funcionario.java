package br.com.alura;

public abstract class Funcionario {
	
	protected String nome;
	private String cargo;
	protected  double salario;
	private  int controleReajuste = 0;
	
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public void exibirInformacoes() {
		System.out.printf("Funcionario %s - Salário %.2f \n", nome,  salario);
	}
	
	

	public void reajustarSalario(double percentual) {
		
		if (controleReajuste >= 1) {
			System.out.println("\nNão pode fazer mais reajuste");
		}else {			
			salario += salario * (percentual/100);
			System.out.printf("\nNovo salario de %s é %.2f \n", nome, salario);			
		}

		
	}
	
	//um método abstrato só será implementado pelas classes filhas
	public abstract void calcularPLR();
		

	
	
	
}
