package gui;

import clases.Trabajador;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trabajador objTrab = new Trabajador();
		objTrab.codigo = 258;
		objTrab.nombre = "Luis";
		objTrab.horasTrabajadas = 10;
		objTrab.tarifaHoraria = 5.5;
		
		System.out.println("Bruto: " + objTrab.sueldoBruto());
		System.out.println("Dscto: " + objTrab.descuento());
		System.out.println("Neto: " + objTrab.sueldoNeto());
	}

}
