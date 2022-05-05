package br.com.fiap.rh;

public class Presidente extends Empresa {

	private double valorCotaAcao;

	public Presidente(String nome, int codigo, double salarioBase) {
		super(nome, codigo, salarioBase);
	}

	public Presidente(String nome, int codigo, double salarioBase, double valorCotaAcao) {
		super(nome, codigo, salarioBase);
		this.valorCotaAcao = valorCotaAcao;
	}

	@Override
	public double getSalarioBase() {
		return super.getSalarioBase() + valorCotaAcao;
	}

	public double getValorCotaAcao() {
		return valorCotaAcao;
	}

}
