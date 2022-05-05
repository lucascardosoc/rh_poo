package br.com.fiap.rh;

public class Empresa {

	private String nome;
	private int codigo;
	private double salarioBase;

	public Empresa(String nome, int codigo, double salarioBase) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.salarioBase = salarioBase;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public String getNome() {
		return nome;
	}

	public int getCodigo() {
		return codigo;
	}

}
