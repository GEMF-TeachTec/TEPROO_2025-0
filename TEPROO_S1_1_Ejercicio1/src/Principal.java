import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaración de variables
		int horasTrabajadas, ruleta;
		char categoria;
		float tarifaHora, sueldoBruto, pDscto, descuento, sueldoNeto;
		String bonificacion;
		
		//Entrada de datos
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ingrese las horas trabajadas: ");
		horasTrabajadas = scan.nextInt();
		//scan.nextLine(); //Para consumir el caracter de salto de línea del entero
		
		//System.out.print("Ingrese la tarifa horaria: ");
		//tarifaHora = scan.nextFloat();
		System.out.print("Ingrese la categoría: ");
		categoria = scan.next().charAt(0);
		categoria = Character.toUpperCase(categoria);
		
		scan.close();
		
		//Proceso
		//Determinar tarifa horaria
		switch(categoria) {
		case 'A': 
			tarifaHora = 12.5f; 
			break;
		case 'B': 
			tarifaHora = 15.5f; 
			break;
		case 'C': 
			tarifaHora = 18.5f; 
			break;
		default: 
			tarifaHora = 20.5f;
		}
		
		//Calcular sueldo bruto
		sueldoBruto = horasTrabajadas * tarifaHora;
		
		//Determinar el porcentaje de descuento
		if(sueldoBruto < 4000) {
			pDscto = 0.1025f;
		} else if(sueldoBruto < 7000) {
			pDscto = 0.1350f;
		} else {
			pDscto = 0.1575f;
		}
		
		//Calcular el descuento
		descuento = sueldoBruto * pDscto;
		
		//Calcular sueldo neto
		sueldoNeto = sueldoBruto - descuento;
		
		ruleta = 1 + (int) (Math.random() * (6-1) + 1);
		
		switch(ruleta) {
		case 1: 
			bonificacion = "Vale S/. 50"; 
			break;
		case 2: 
			bonificacion = "Vale S/. 75"; 
			break;
		case 3: 
			bonificacion = "Vale S/. 100"; 
		case 4: 
			bonificacion = "Vale S/. 125"; 
		case 5: 
			bonificacion = "Vale S/. 150"; 
			break;
		default: 
			bonificacion = "Vale S/. 200"; 
		}

		
		//Salida de resultados
		System.out.printf("Tarifa: %c\n", categoria);
		System.out.printf("Tarifa: %.2f\n", tarifaHora);
		System.out.printf("Sueldo bruto: %,.2f\n", sueldoBruto);
		System.out.printf("Descuento (%.2f%%): %,.2f\n", (pDscto * 100), descuento);
		System.out.printf("Sueldo bruto: %,.2f\n", sueldoNeto);
		System.out.printf("Bonificación (%d): %s\n", ruleta, bonificacion);
	}

}
