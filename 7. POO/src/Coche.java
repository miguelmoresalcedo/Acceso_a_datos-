//EJERCICIOS DE CLASES
public class Coche 
{
	//Atributos
	private int nCaballos; //poner siempre private por que sino no sabemos como nos lo pondra el compliador
	private String direccion;
	private int marcha;
	private String matricula;
	
	//Constructor, siempre tienen que ser publicos
	
	public Coche() //siempre igual al nombre de la clase
	{
		nCaballos = 5;
		direccion = "PARADO";
		marcha = 0;
		matricula = "DESCONOCIDA";
	}
	 //tambien podriamos poner las variable igual que en la clase coche y despues poniendo this.nCaballos para llamar 
	 //al de la clase = nCaballos que seria el nuevo que hemos creado.
	
	public Coche(int nC, String d, int m, String mat) //creamos variables nuevas y le asignamos las de los atributos
	{
		nCaballos = nC;
		direccion = d;
		marcha = m;
		matricula = mat;
	}
	
	public  void arrancar()
	{
		direccion = "Delante";
		marcha = marcha + 1;
	}
	
	public void girar(String giro)
	{
		if(giro == "D"){
			direccion = "DERECHA";
		}else if(giro == "I"){
				direccion = "IZQUIERDA";
	}
		
		}
	
	public void parar()
	{
		direccion = "PARADO";
		marcha = 0;
	}
	
	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}
	
	
	
	public String estado()
	{
		return "Caballos: " + nCaballos + 
				" Direccion: " + direccion + 
				" Marcha: " + marcha + 
				" Marticula: " + matricula;
		
	}

	public int getnCaballos() {
		return nCaballos;
	}

	public void setnCaballos(int nCaballos) {
		this.nCaballos = nCaballos;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	public static String getDireccion() {
		return null;
	}
	
	
	//Escribir por pantalla los coches ordenados por numero de caballos(- a +)
	//Retirar todos los coches  concesionario --> Matriculas poner 0000xxx
	//Comprobar el funcionamiento de los vehiculos "PARADOS" fijando la marcha a 0
	
		
	
	}
	



