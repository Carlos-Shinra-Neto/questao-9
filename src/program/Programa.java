//9 � Escreva um programa Java que tem como objetivo validar se um determinado funcion�rio
//tem direito a bonifica��o. O programa precisa receber a quantidade de funcion�rios que
//ser�o cadastrados e ap�s isso, o programa deve armazenar o nome e o sal�rio de cada
//funcion�rio. Se o usu�rio receber at� R$ 1000,00 reais, receber� 20% de bonifica��o. Se
//receber acima de 1000 e menos que 2000, recebe 10%. Se for acima de 2000, ao inv�s de
//bonifica��o, o funcion�rio ter� um desconto de 10%.
//No fim do programa, dever� ter uma sa�da com os nomes dos funcion�rios, sal�rio, b�nus ou
//desconto e sal�rio liquido.
//Utilizem arrays para armanezar os dados.
//Ex:
//
//Funcion�rio XPTO
//Sal�rio: 1200,00
//Bonus: 120,00
//Sal�rio Liquido: 1320,00
//Funcion�rio XYZ
//Sal�rio: 3000,00
//Desconto: 300,00
//Sal�rio Liquido: 2700,00
//Funcion�rio ABC
//Sal�rio: 700,00
//Bonus: 140,00
//Sal�rio Liquido: 840,00
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
