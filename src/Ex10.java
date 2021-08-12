import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner
		leitor = new Scanner(System.in);
		String nome, setor;
		int meioTransporte, placa;
		
		for (int i=1; i<=150; i++) {
			System.out.println("Digite o nome do funcionário: ");
			nome = leitor.nextLine();
			System.out.println("Digite o setor do funcionário: ");
			setor = leitor.nextLine();
			System.out.println("Digite o meio de transporte: 1 - Carro ou 2 - Õnibus ");
			meioTransporte = leitor.nextInt();
			leitor.nextLine(); // gambiarra para consumir enter na fila pra zerar e não dar buffer.
			
			
		}
	}

}
