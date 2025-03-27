package clases;

public class Paciente {
	//Atributos
	private int codigo;
	private String nombre;
	private String nroHistoria;
	private double talla;
	private double peso;
	
	//Métodos de acceso: 
	//Getters (Leen los datos)
	//Setters (Modifican los datos)
	public int getCodigo() { return codigo; }
	
	public void setCodigo(int codigo) {
		this.codigo = codigo; 
	}

	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }

	public String getNroHistoria() { return nroHistoria; }
	public void setNroHistoria(String nroHistoria) { this.nroHistoria = nroHistoria; }

	public double getTalla() { return talla; }
	public void setTalla(double talla) { this.talla = talla; }

	public double getPeso() { return peso; }
	public void setPeso(double peso) { this.peso = peso; }
}
