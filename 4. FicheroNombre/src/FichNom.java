import java.io.*;
import java.util.Scanner;

public class FichNom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		String nombre = scan.nextLine();
		
		System.out.println("Inserte el nombre que quieras: " + nombre);
		
		File fichero = new File(nombre + ".txt");
		
		try  					//codigo cuando todo va bien
		{
			if (fichero.createNewFile() == true)
			{
				System.out.println("El fichero ha sido creado");
			}else
			{
				System.out.println("El fichero no ha sido creado");
			}
			
		} 
		
		catch (IOException e)   //codigo cuando todo va mal
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
