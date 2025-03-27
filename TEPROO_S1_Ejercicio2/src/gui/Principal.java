package gui;

//Importar la clase Alumno
import clases.Alumno;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno obj1 = new Alumno();
		obj1.codigo = 123;
		obj1.nombre = "Pepe";
		obj1.nota1 = 18;
		obj1.nota2 = 13;
		System.out.println("Codigo: " + obj1.codigo);
		System.out.println("Promedio: " + obj1.calcularPromedio() );
		System.out.println("Objeto1: " + obj1 );
		
		Alumno obj2 = new Alumno();
		obj2.codigo = 666;
		obj2.nombre = "Hugo";
		obj2.nota1 = 17;
		obj2.nota2 = 16;
		System.out.println("Codigo: " + obj2.codigo);
		System.out.println("Promedio: " + obj2.calcularPromedio() );
		System.out.println("Objeto2: " + obj2 );
	}
}
