import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner
		leitor = new Scanner(System.in);
		String nome, setor;
		int meioTransporte, placa;
		
		for (int i=1; i<=150; i++) {
			System.out.println("Digite o nome do funcion�rio: ");
			nome = leitor.nextLine();
			System.out.println("Digite o setor do funcion�rio: ");
			setor = leitor.nextLine();
			System.out.println("Digite o meio de transporte: 1 - Carro ou 2 - �nibus ");
			meioTransporte = leitor.nextInt();
			leitor.nextLine(); // gambiarra para consumir enter na fila pra zerar e n�o dar buffer.
			
			
		}
	}

}
