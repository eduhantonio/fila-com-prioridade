import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        int resposta=0;
        
	    Scanner sc = new Scanner(System.in);
	    Fila fila = new Fila();
	    int idAtual=0;
	    
	    do {
	        System.out.println("=============================");
	        System.out.println("SUS FATECANO - Oque deseja ?");
	        System.out.println("=============================");
	        
	        System.out.println("1 • Inserir paciente 'Cartão Verde'");
	        System.out.println("2 • Inserir paciente 'Cartão Amarelo'");
	        System.out.println("3 • Retirar paciente da Fila");
	        System.out.println("4 • Mostrar a Fila");
	        System.out.println("0 • Encerrar o Programa");
	        
	        System.out.print("Opção: ");
	        resposta = sc.nextInt();
	        System.out.println();
	        
	        switch (resposta) {
	            case 1:
	                idAtual++;
	                sc.nextLine();
	                System.out.println("Nome: ");
	                Paciente p1 = new Paciente(sc.nextLine(),"Verde",idAtual);
	                fila.inserirPaciente(p1);
	                break;
	            case 2:
	                idAtual++;
	                sc.nextLine();
	                System.out.println("Nome: ");
	                Paciente p2 = new Paciente(sc.nextLine(),"Amarelo",idAtual);
	                fila.inserirPaciente(p2);
	                break;
	            case 3:
	                fila.retirarPaciente();
	                break;
	            case 4:
	                fila.imprimirDados();
	                break;
	        }
	        
	    } while(resposta != 0);
	}
}
