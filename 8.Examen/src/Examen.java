import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Producto[] tabla = new Producto[4];
			
			//1. Creacion de los productos
			for(int i=0;i<tabla.lenght;i++)
					{
					tabla[i] = new Producto;
					}
			
			//2. Leer fichero
			//nombre1;precio1;nombre2;precio2;
			//nombre3;precio3;nombre4;precio4;
			try{
				
			File fichero = new File("Producto.txt"); //crear fichero en la carpeta y escribir los precio
			FileReader ficheroR = new FileReader(fichero); //leemos el fichero.
			char[] cadena = new char[1]; //creamos la cadena donde queremos tenerlo
			int resultado;
			int contador = 0;
			int nProducto = 0;
			String valor  = "";
			String nombreA = "";
			String precioA = "";
			
			resultado = ficheroR.read(cadena); //aqui ya lo tendria leido
			
			while (resultado!=-1)
			{
				if (cadena[0] != ';') //cuando no tenga ; sumar el valor a la cadena
					valor += cadena[0];
				else
					if ((contador%2 == 0))// Nombre,  si es par
						nombreA = valor;
					else //precio
					{
						precioA = valor;
					tabla[nProducto].setNombre(nombreA);
					tabla[nProducto].setPrecio(Integer.parseInt(precioA));
					nombreA = "";
					precioA = "";
					nProducto++;
					}
				valor = "";
				contador++;
			}
			resultado = ficheroR.read(cadena); //lo vuelvo a leer
	
		}
		
			//precioA = valor;
			//tabla[nProducto].setNombre(nombreA);
			//tabla[nProducto].setPrecio(Integer.parseInt(precioA));
			
			//3. aumentar y disminuir producto
			tabla[0].aumentar(10);
			tabla[1].aumentar(20);
			
			//4. Escribir valores
			for (int i = 0; i<tabla[i].escribir());


	catch(FileNotFoundException e){
				e.printStackTrace();
			}
			catch(IOException e){
				e.printStackTrace();
			}
	
	}

}
