package br.com.fiap.rh;

public class Rh {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario("Lucas", 74452, 1800);
		Engenheiro engenheiro = new Engenheiro("Fabio", 74453, 8000, "Eletrônica", 1234567890);
		Gerente gerente = new Gerente("Gabriel", 74454, 5000, "Comercial", 500);
		Presidente presidente = new Presidente("Marcelo", 85000, 30000, 5000);

		System.out.println("O funcionário " + funcionario.getNome() + ", com o código " + funcionario.getCodigo()
				+ " tem um salário de R$ " + funcionario.getSalarioBase());

		System.out.println("O engenheiro " + engenheiro.getNome() + ", com o código " + engenheiro.getCodigo()
				+ " tem um salário de R$ " + engenheiro.getSalarioBase() + ". Trabalha no departamento de "
				+ engenheiro.getDepartamento() + ", possui o crea: " + engenheiro.getCrea()
				+ " e tem um adicional de 50% sobre o seu salário base");

		System.out.println("O gerente " + gerente.getNome() + ", com o código " + gerente.getCodigo()
				+ " tem um salário de R$ " + gerente.getSalarioBase() + ". Trabalha na área " + gerente.getArea()
				+ ", com um bônus de 10% sobre seu salário base");

		System.out.println("O presidente " + presidente.getNome() + ", com o código " + presidente.getCodigo()
				+ " tem um salário de R$ " + presidente.getSalarioBase() + ". Tem como valor de cota de ações: R$ "
				+ presidente.getValorCotaAcao());

	}

}
