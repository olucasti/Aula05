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
			switch (meioTransporte) {
			case 1:
				System.out.println("Informe o último número da sua placa:  ");
				placa = leitor.nextInt();
				leitor.nextLine();
				switch (placa) {
				case 1:
				case 2:
					System.out.println("Segunda Dia do funcionário:  " +nome + "  do setor " + setor);
					System.out.println("----------------------------------------------------------" );
				case 3:
				case 4:
					System.out.println("Terça Dia do funcionário:  " +nome + "  do setor " + setor);
					System.out.println("----------------------------------------------------------" );
					break;
				case 5:
				case 6:
					System.out.println("Quarta Dia do funcionário:  " +nome + "  do setor " + setor);
					System.out.println("----------------------------------------------------------" );
					break;
				case 7:
				case 8:
					System.out.println("Quinta Dia do funcionário:  " +nome + "  do setor " + setor);
					System.out.println("----------------------------------------------------------" );
					break;
				case 9:
				case 0:
					System.out.println("Sexta Dia do funcionário:  " +nome + "  do setor " + setor);
					System.out.println("----------------------------------------------------------" );
					break;
				default:
					System.out.println("Informação inválida:  ");
					break;
				}	
				break;
			case 2:
				System.out.println("Obrigado por ir de Ônibus! "  +nome + "  do setor " + setor);	
				break;
			default:
			// informa que é inválido
				System.out.println("Valor digitado inválido");
			}
			
		}
		leitor.close();
	}

}
