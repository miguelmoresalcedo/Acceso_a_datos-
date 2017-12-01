import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File carpeta = new File("numeros");
		Scanner scan = new Scanner(System.in);
		File fichero;
		int numero;
		
		
		//1. Crear la carpeta
		try{
		carpeta.mkdir();
		for (int i=0;i<10;i++){
			System.out.println("Introduce el numero:");
			numero = scan.nextInt();
			fichero = new File("numero"+numero+ ".txt");
			fichero.createNewFile();
			
		}
		}
		catch(IOException ex){
			System.out.print(ex.getMessage());
			ex.printStackTrace();
			
		}
		
		
	}

}
