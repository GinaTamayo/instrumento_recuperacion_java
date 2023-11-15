package punto1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class DatosPersonas {
	ArrayList<String> datosPersonas;
	ArrayList<Integer> cantidadPersonas;
	int totalPersonas, mayorEdad, menorEdad;
	
	public static void main(String args[]) {
		new DatosPersonas();
	}
	
	public DatosPersonas() {
		cantidadPersonas = new ArrayList<Integer>();
		String continuar;
		do {
			datosPersonas = new ArrayList<String>();
			pedirDatos();
			continuar = JOptionPane.showInputDialog("¿Desea seguir ingresando?");
		} while (continuar.equalsIgnoreCase("si"));
		cantidadPersonas.add(totalPersonas);
		cantidadPersonas.add(mayorEdad);
		cantidadPersonas.add(menorEdad);
		imprimirDatos();
	}
	
	
	
	private void pedirDatos() {
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
		String documento = JOptionPane.showInputDialog("Ingrese su documento");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
		String profesion = JOptionPane.showInputDialog("Ingrese su profesion");
		datosPersonas.add(nombre);
		datosPersonas.add(documento);
		datosPersonas.add(Integer.toString(edad));
		datosPersonas.add(profesion);
		imprimirDatosPersonales();
		mayoriaEdad(edad);
		totalPersonas ++;
	}
	
	private void mayoriaEdad(int edad) {
		if (edad >= 18) {
			mayorEdad ++;
		} else if (edad < 18) {
			menorEdad ++;
		}
	}
	
	private void imprimirDatos() {
		String mensaje = "Total de personas registradas: " + cantidadPersonas.get(0) + "\n";
		mensaje += "Total de pesonas mayores de edad: " + cantidadPersonas.get(1) + "\n";
		mensaje += "Total de pesonas menores de edad: " + cantidadPersonas.get(2);
		System.out.println(mensaje);
	}
	
	private void imprimirDatosPersonales() {
		String mensaje = "Nombre: " + datosPersonas.get(0) + "\n";
		mensaje += "Documento: " + datosPersonas.get(1) + "\n";
		mensaje += "Edad: " + datosPersonas.get(2) + "\n";
		mensaje += "Profesion: " + datosPersonas.get(3) + "\n";
		System.out.println(mensaje);
	}
}
