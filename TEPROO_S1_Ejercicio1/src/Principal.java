import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// TODO Auto-generated method stub
		Alumno obj1 = new Alumno();
		obj1.codigo = leerEntero(scan, "Ingrese el código: ");
		obj1.nombre = leerCadena(scan, "Ingrese el nombre: ");
		obj1.nota1 = leerEntero(scan, "Ingrese la nota 1: ");
		obj1.nota2 = leerEntero(scan, "Ingrese la nota 2: ");
		
		scan.close();
		
		System.out.println("Codigo: " + obj1.codigo);
		System.out.println("Nombre: " + obj1.nombre);
		System.out.println("Nota 1: " + obj1.nota1);
		System.out.println("Nota 2: " + obj1.nota2);
		System.out.println("Promedio: " + obj1.calcularPromedio() );
		System.out.println("Objeto1: " + obj1 );
	}
	
	public static int leerEntero(Scanner scan, String mensaje) {
		int dato = 0;
		do {
			System.out.print(mensaje);
			dato = scan.nextInt();
			scan.nextLine();
		}while(dato < 100 || dato > 999);
		
		return dato;
	}

	public static String leerCadena(Scanner scan, String mensaje) {
		String dato = "";
		
			System.out.print(mensaje);
			dato = scan.nextLine();
		
		return dato;
	}
}
