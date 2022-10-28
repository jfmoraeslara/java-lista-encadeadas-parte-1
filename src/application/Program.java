package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x;
		Aluno[][] vetorInt = new Aluno[3][2];
		
		vetorInt[0][0] = new Aluno(1, "Ana Paula");
		vetorInt[0][1] = new Aluno(2, "Maria");
		vetorInt[1][0] = new Aluno(3, "João");
		
		for (int i=0; i<vetorInt.length; i++) {
			for (int j=0; j<2; j++) {
				System.out.println(vetorInt[i][j]);
			}
		}
		
		sc.close();
	}
}
