package gui;

import clases.Pelicula;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pelicula objPelicula = new Pelicula();
		objPelicula.setCodigo(654);
		objPelicula.setTitulo("Duro de matar 8");
		objPelicula.setGenero("Acción");
		objPelicula.setDuracion(6782);
		
		System.out.println("Nombre: " + objPelicula.getTitulo());
		System.out.println("HHMMSS: " + objPelicula.duracionHHMMSS());
	}
}
