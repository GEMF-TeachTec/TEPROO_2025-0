package clases;

public class Trabajador {
	//Atributos
	public int codigo;
	public String nombre;
	public int horasTrabajadas;
	public double tarifaHoraria;
	
	//Métodos
	public double sueldoBruto() {
		return horasTrabajadas * tarifaHoraria;
	}

	public double descuento() {
		double sBruto = sueldoBruto();
		double dscto;
		
		if (sBruto < 4000) {
			dscto = 0.10 * sBruto;
		} else if (sBruto < 7000) {
			dscto = 0.13 * sBruto;
		} else {
			dscto = 0.15 * sBruto;
		}
		
		return dscto;
	}

	public double sueldoNeto() {
		return sueldoBruto() - descuento();
	}
}
