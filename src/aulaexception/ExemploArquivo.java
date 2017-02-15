package aulaexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExemploArquivo {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("arquivoteste.txt")) {
			Scanner scan = new Scanner(fis);
			while (scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
		} catch (IOException | RuntimeException e) {
			e.printStackTrace();
		} 
	}
	
}
