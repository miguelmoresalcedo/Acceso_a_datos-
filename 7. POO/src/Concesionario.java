//aqui se va a usar la clase coche
public class Concesionario {
	
	//ordena los caballos de menor a menor 
	public static void ordenarCaballos(Coche c1, Coche c2, Coche c3)
	{
		if ( (c1.getnCaballos()<c2.getnCaballos()) && (c1.getnCaballos()<c3.getnCaballos()))
		{
			
		}
	}
	
	//pone todas las matriculas como 0000xxx
	public static void matricula(Coche c1, Coche c2, Coche c3)
	{
		c1.setMatricula("0000xxx");
		c2.setMatricula("0000xxx");
		c3.setMatricula("0000xxx");
	}
	
	public static void comprobar(Coche c1, Coche c2, Coche c3)
	{
		if(Coche.getDireccion() == "PARADO")
		{
			c1.setMarcha(0);
			c2.setMarcha(0);
			c3.setMarcha(0);
		}
	}
	
	public static void main(String[] args) 
	{
		//creamos tres coches
		Coche c1 = new Coche(100,"DELANTE", 0, "3453HRF" ),
			  c2 = new Coche(150, "DELANTE", -1, "1234FRH"),
			  c3 = new Coche(200, "ATRAS", -1, "2345BDR");
		
		c1.arrancar();
		c2.girar("D");
		c3.parar();
		
		matricula(c1, c2, c3);
		
		System.out.println(c1.estado());
		System.out.println(c2.estado());
		System.out.println(c3.estado());

		
	}

}
