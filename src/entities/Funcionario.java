package entities;

public class Funcionario {

	private String nome;
	private double salario;
	private double bonus;

	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		setSalario(salario);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
		calcularBonificacao();
	}

	public double getBonus() {
		return bonus;
	}

	public double getSalarioLiquido() {
		return salario + bonus;
	}

	private void calcularBonificacao() {
		if (this.salario <= 1000) {
			bonus = salario * 0.2;
		} else if (this.salario > 1000 && this.salario < 2000) {
			bonus = salario * 0.1;
		} else {
			bonus = salario * -0.1;
		}

	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Funcionario: ");
		sb.append(nome);

		sb.append("\nSalario: ");
		sb.append(String.format("%.2f", salario));

		if (bonus >= 0) {
			sb.append("\nBonus: ");
			sb.append(String.format("%.2f", bonus));
		} else {
			sb.append("\nDesconto: ");
			sb.append(String.format("%.2f", bonus * -1));
		}
		sb.append("\nSalario Liquido: ");
		sb.append(String.format("%.2f", getSalarioLiquido()));
		return sb.toString();
	}
}
