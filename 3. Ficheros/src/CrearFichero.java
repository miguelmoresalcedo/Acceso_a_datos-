import java.io.*;

public class CrearFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fichero = new File("hola.txt");
		
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
