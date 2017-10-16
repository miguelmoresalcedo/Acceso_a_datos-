import java.io.*;
import java.util.Scanner;

/* Crear un menu con ficheros
 * 1. Crear fichero
 * 2. Mostrar informacion del fichero(nombre, ruta absoluta, ruta relativa, longitud)
 * 3. Mostrar longitud del fichero
 * 4. Comprobar si existe
 * 5. Borrar fichero
 * 6. Salir
 */

public class MenuFich {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String nombre = scan.nextLine();
		Scanner sc = new Scanner(System.in);
		System.out.println("Selecciona la opcion que quieres: 1. Crea Fichero, 2. Muestra informacion, 3. Muestra longitud, 4. Comprueba si existe, 5. Borra fichero, 6. Salir");
		int numero = sc.nextInt();
		
		
		switch(numero){
		case 1:
			System.out.println("Ponle un nombre a tu fichero: ");
			File fichero = new File(nombre + ".txt");
			
			try  					
			{
				if (fichero.createNewFile() == true)
				{
					System.out.println("El fichero ha sido creado");
				}else
				{
					System.out.println("El fichero no ha sido creado");
				}
				
			} 
			
			catch (IOException e)  
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
		case 2:
			fichero = new File(nombre + ".txt");
			fichero.getName();
			fichero.getPath();
			fichero.getAbsolutePath();
			fichero.length();
			
			System.out.println("La informacion del fichero es: " + fichero.getName() + "," + fichero.getPath() + "," + fichero.getAbsolutePath() + "," + fichero.length());
			break;
			
		case 3:
			fichero = new File(nombre + ".txt");
			fichero.length();
			System.out.println("La longitud del fichero es: " + fichero.length());
			break;
			
		case 4:
			fichero = new File(nombre + ".txt");
			try  					
			{
				if (fichero.createNewFile() == true)
				{
					System.out.println("El fichero ha sido creado");
				}else
				{
					System.out.println("El fichero no ha sido creado");
				}
				
			} 
			
			catch (IOException e)  
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
			
		case 5:
			fichero = new File(nombre + ".txt");
			fichero.delete();
			 break;
		
		}
	}

}