import java.util.Scanner;

public class Medias {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de Notas: ");
		int num = input.nextInt();
		
		System.out.printf("\n");
		
		double soma = 0;
		
		double[] notas = new double[num];
		
		for (int cont = 0; cont < notas.length; cont++) {
		
			System.out.printf("Digite a Nota %d: ", cont+1);
			notas[cont] = input.nextDouble();
			soma += notas[cont];
		
		}
		
		System.out.printf("\n");
		
		double media = soma/notas.length;
		
		System.out.printf("Média: %.2f\n", media);
		
		input.close();
		
	}

}
