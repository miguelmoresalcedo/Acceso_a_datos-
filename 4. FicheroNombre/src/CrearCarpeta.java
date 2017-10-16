import java.io.*;
import java.util.Scanner;

public class CrearCarpeta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String nombreCarpeta = scan.nextLine();
		System.out.println("Tu carpeta se llama " + nombreCarpeta);
		
		File carpeta = new File(nombreCarpeta);
		carpeta.mkdirs();
		
		try  					//codigo cuando todo va bien
		{
			if (carpeta.createNewFile() == true)
			{
				System.out.println("La carpeta ha sido creada");
			}else
			{
				System.out.println("La carpeta no ha sido creada");
			}
			
		} 
		
		catch (IOException e)   //codigo cuando todo va mal
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}

}
