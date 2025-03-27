package clases;

public class Pelicula {
	//Atributos
	private int codigo;
	private String titulo;
	private String genero;
	private int duracion;
	
	//Métodos de acceso (Getters y Setters)
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	//Operaciones
	public String duracionHHMMSS() {
		//Variables
		int hh, mm, ss;
		
		//Proceso
		hh = this.duracion / 3600;
		mm = (this.duracion % 3600) / 60;
		ss = (this.duracion % 3600) % 60;
		
		//return hh + ":" + mm + ":" + ss;
		return String.format("%02d:%02d:%02d", hh, mm, ss);
	}
}
