package Fecha;

public class MainEjer {
	
	public static Fecha crearFecha(){
		Fecha f = new Fecha();
		return f;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fecha f1 = new Fecha();
		
		f1 = crearFecha();
		System.out.println("La fecha de nacimiento es:"  + f1.escribeCorto());
		System.out.println(f1.escribeLargo());
	}

}
