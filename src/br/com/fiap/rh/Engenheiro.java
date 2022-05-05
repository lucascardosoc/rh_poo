package br.com.fiap.rh;

public class Engenheiro extends Empresa {

	private String departamento;
	private int crea;

	public Engenheiro(String nome, int codigo, double salarioBase) {
		super(nome, codigo, salarioBase);
	}

	public Engenheiro(String nome, int codigo, double salarioBase, String departamento, int crea) {
		super(nome, codigo, salarioBase);
		this.departamento = departamento;
		this.crea = crea;
	}
	
	

	@Override
	public double getSalarioBase() {
		return super.getSalarioBase() * 1.5;
	}

	public String getDepartamento() {
		return departamento;
	}

	public int getCrea() {
		return crea;
	}

}
