package gui;

import clases.Paciente;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente objPaciente = new Paciente();
		objPaciente.setCodigo(157);
		objPaciente.setNombre("Pedro Navaja");
		objPaciente.setNroHistoria("PRNV582");
		objPaciente.setTalla(1.54);
		objPaciente.setPeso(105.6);
		
		System.out.println("Nro Historia:" + objPaciente.getNroHistoria());
	}

}
