package br.com.fiap.rh;

public class Rh {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario("Lucas", 74452, 1800);
		Engenheiro engenheiro = new Engenheiro("Fabio", 74453, 8000, "Eletr�nica", 1234567890);
		Gerente gerente = new Gerente("Gabriel", 74454, 5000, "Comercial", 500);
		Presidente presidente = new Presidente("Marcelo", 85000, 30000, 5000);

		System.out.println("O funcion�rio " + funcionario.getNome() + ", com o c�digo " + funcionario.getCodigo()
				+ " tem um sal�rio de R$ " + funcionario.getSalarioBase());

		System.out.println("O engenheiro " + engenheiro.getNome() + ", com o c�digo " + engenheiro.getCodigo()
				+ " tem um sal�rio de R$ " + engenheiro.getSalarioBase() + ". Trabalha no departamento de "
				+ engenheiro.getDepartamento() + ", possui o crea: " + engenheiro.getCrea()
				+ " e tem um adicional de 50% sobre o seu sal�rio base");

		System.out.println("O gerente " + gerente.getNome() + ", com o c�digo " + gerente.getCodigo()
				+ " tem um sal�rio de R$ " + gerente.getSalarioBase() + ". Trabalha na �rea " + gerente.getArea()
				+ ", com um b�nus de 10% sobre seu sal�rio base");

		System.out.println("O presidente " + presidente.getNome() + ", com o c�digo " + presidente.getCodigo()
				+ " tem um sal�rio de R$ " + presidente.getSalarioBase() + ". Tem como valor de cota de a��es: R$ "
				+ presidente.getValorCotaAcao());

	}

}
