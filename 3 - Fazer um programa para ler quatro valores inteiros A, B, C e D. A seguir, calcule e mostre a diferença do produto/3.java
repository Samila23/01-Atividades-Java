//3 - Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner (System.in);
		int a, b,c, d, diferenca;
		
		System.out.println("Digite a entrada A");
		a = sc.nextInt();
		System.out.println("Digite a entrada B");
		b = sc.nextInt();
		System.out.println("Digite a entrada C");
		c = sc.nextInt();
		System.out.println("Digite a entrada D");
		d = sc.nextInt();
		
		diferenca=(a*b - c*d);
		System.out.println("A diferenca do produto é " + diferenca);
		
		sc.close();
	}

}
