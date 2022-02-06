//9 – Escreva um programa Java que tem como objetivo validar se um determinado funcionário
//tem direito a bonificação. O programa precisa receber a quantidade de funcionários que
//serão cadastrados e após isso, o programa deve armazenar o nome e o salário de cada
//funcionário. Se o usuário receber até R$ 1000,00 reais, receberá 20% de bonificação. Se
//receber acima de 1000 e menos que 2000, recebe 10%. Se for acima de 2000, ao invés de
//bonificação, o funcionário terá um desconto de 10%.
//No fim do programa, deverá ter uma saída com os nomes dos funcionários, salário, bônus ou
//desconto e salário liquido.
//Utilizem arrays para armanezar os dados.
//Ex:
//
//Funcionário XPTO
//Salário: 1200,00
//Bonus: 120,00
//Salário Liquido: 1320,00
//Funcionário XYZ
//Salário: 3000,00
//Desconto: 300,00
//Salário Liquido: 2700,00
//Funcionário ABC
//Salário: 700,00
//Bonus: 140,00
//Salário Liquido: 840,00
package program;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Programa {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o numero de funcionarios: ");
		Funcionario[] funcionarios = new Funcionario[Integer.parseInt(sc.nextLine())];

		for (int i = 0; i < funcionarios.length; i++) {
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = Double.parseDouble(sc.nextLine());
			funcionarios[i] = new Funcionario(nome, salario);
		}
		
		Arrays.asList(funcionarios).forEach(System.out::println);
			
		sc.close();
	}

}
