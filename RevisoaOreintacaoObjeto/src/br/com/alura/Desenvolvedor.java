package br.com.alura;

public class Desenvolvedor extends Funcionario {

    private String stack;
	
    public Desenvolvedor(String nome, double salario, String stack) {
        super(nome, salario);
        this.stack = stack;
    }

	@Override
	public void exibirInformacoes() {
		// TODO Auto-generated method stub
	
	    System.out.printf("\nDesenvolvedor: %s salário %.2f - Stack: %s", nome, salario, stack);

		
	}

	
	@Override
	public void calcularPLR() {
		// classe abstrata serve como um modelo para que as subclasses herdem seus comportamentos e atributos. Os métodos abstratos 
	    System.out.println("PLR do desenvolvedor");
	}
    
    
    
}
