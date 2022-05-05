package br.com.fiap.rh;

public class Gerente extends Empresa {

	private String area;
	private double bonus;

	public Gerente(String nome, int codigo, double salarioBase) {
		super(nome, codigo, salarioBase);
	}

	public Gerente(String nome, int codigo, double salarioBase, String area, double bonus) {
		super(nome, codigo, salarioBase);
		this.area = area;
		this.bonus = bonus;
	}

	@Override
	public double getSalarioBase() {
		return super.getSalarioBase() + bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public String getArea() {
		return area;
	}

}
