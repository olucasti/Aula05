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
			switch (meioTransporte) {
			case 1:
				System.out.println("Informe o �ltimo n�mero da sua placa:  ");
				placa = leitor.nextInt();
				leitor.nextLine();
				switch (placa) {
				case 1:
				case 2:
					System.out.println("Segunda Dia do funcion�rio:  " +nome + "  do setor " + setor);
					System.out.println("----------------------------------------------------------" );
				case 3:
				case 4:
					System.out.println("Ter�a Dia do funcion�rio:  " +nome + "  do setor " + setor);
					System.out.println("----------------------------------------------------------" );
					break;
				case 5:
				case 6:
					System.out.println("Quarta Dia do funcion�rio:  " +nome + "  do setor " + setor);
					System.out.println("----------------------------------------------------------" );
					break;
				case 7:
				case 8:
					System.out.println("Quinta Dia do funcion�rio:  " +nome + "  do setor " + setor);
					System.out.println("----------------------------------------------------------" );
					break;
				case 9:
				case 0:
					System.out.println("Sexta Dia do funcion�rio:  " +nome + "  do setor " + setor);
					System.out.println("----------------------------------------------------------" );
					break;
				default:
					System.out.println("Informa��o inv�lida:  ");
					break;
				}	
				break;
			case 2:
				System.out.println("Obrigado por ir de �nibus! "  +nome + "  do setor " + setor);	
				break;
			default:
			// informa que � inv�lido
				System.out.println("Valor digitado inv�lido");
			}
			
		}
		leitor.close();
	}

}
