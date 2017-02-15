package aulaexception;

import java.util.Scanner;

public class ExemploException {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)) {
			System.out.print("Numerador:");
			int numerador = scan.nextInt();
			System.out.print("Denominador:");
			int denominador = scan.nextInt();
			
			int result = numerador / denominador;
			System.out.printf("Resultado: %d\n", result);
		} catch (Exception e) {
			System.out.println("Erro...");
			e.printStackTrace();
		} finally{
			System.out.println("Sempre executar");
		}
		
	}
	
}
