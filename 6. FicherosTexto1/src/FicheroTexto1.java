import java.io.*;


public class FicheroTexto1 {
	public static void escribirFichero(String[] lista){
		
		try {
			// 1. Crear ficheros 
			File fichero = new File("fichero.txt");
			FileWriter ficheroEscritura = new FileWriter(fichero);
			
			// 2. Escribir nombres
			for(int i=0;i<lista.length;i++)
			{
				ficheroEscritura.write(lista[i]);
			}
			// 3. Cerrar fichero
			ficheroEscritura.close();
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public static void imprimirTabla(String[] lista)
	{
		System.out.println("Contenido de la tabla");
		for(int i=0; i<lista.length;i++){
			System.out.println("Posicion " + i + ":" + lista[i]);
		}
	}
	
	public static void leerFichero(String[] lista){
		
		try {
			// 1. Crear ficheros 
			File fichero = new File("fichero.txt");
			FileReader ficheroLectura = new FileReader(fichero);
			
			// Bucle de lectura
			char[] nombre = new char[4];
			
			int res, i=0;
			res = ficheroLectura.read(nombre);
			
			while(res != -1)
			{
				//Tratar la letra
				lista[i] = String.valueOf(nombre);
				res = ficheroLectura.read(nombre);
			    i++;
			} 
			
			// 3. Cerrar fichero
			ficheroLectura.close();
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
	}

	
	public static void main(String[] args)
	{
		String[] lista = {"Pepe", "Ana", "Juan"};
		//paso vacia la lita para que luego la rellene
		escribirFichero(lista);
		
		lista[0] = "";
		lista[1] = "";
		lista[2] = "";

		leerFichero(lista);
		imprimirTabla(lista);
		
	}

}
