package clases;
public class Alumno {
	//Atributos
	public int codigo;
	public String nombre;
	public int nota1;
	public int nota2;
	
	//Métodos
	public double calcularPromedio() {
		return (nota1 + nota2)/2.0;
	}
 
}
