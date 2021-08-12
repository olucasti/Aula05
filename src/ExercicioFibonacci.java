import java.util.Scanner;

public class ExercicioFibonacci {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		int n, ant1, ant2, atual;
		
		ant2 = 1;
		atual = 0;
		
		System.out.println("Quantos elementos você quer exibir? " );
		n = leitor.nextInt();
		
		for (int i=0; i<n; i++) {
			ant1=ant2;
			ant2= atual;
			atual = ant1 + ant2;
			System.out.println(atual);	
			
		}
			
	}

}
