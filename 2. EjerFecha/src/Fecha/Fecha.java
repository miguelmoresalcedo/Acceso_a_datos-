package Fecha;

public class Fecha {
	int dia, mes, anio;
	
	public Fecha()
	{
		dia = 4;
		mes = 5;
		anio = 2000;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	String escribeCorto(){
		return dia + "/" + mes + "/" + anio;
	}
	
	String escribeLargo(){
		return "Es el dia " + dia + " del mes " + mes + " del año " + anio;
	}
	
	boolean resultado(){
		if(dia < 30 && mes < 12){
			return true;
		}
		return false;
	}
	
	

}
