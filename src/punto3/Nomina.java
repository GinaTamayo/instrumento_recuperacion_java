package punto3;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Nomina {
	private double descuentoEstrato = 0;
	HashMap<String, ArrayList<Double>> mapDescuento; 
	
	public static void main(String args[]) {
		new Nomina();
	}

	private Nomina() {
		mapDescuento = new HashMap<String, ArrayList<Double>>();
		ingresarDatos();
		imprimirDatos();
	}
	private void solicitarDatos() {
		String nombre = JOptionPane.showInputDialog("Ingresar nombre");
		int estrato = Integer.parseInt(JOptionPane.showInputDialog("Ingresar estrato"));
		double salario =  Double.parseDouble(JOptionPane.showInputDialog("Ingresar salario"));
		
		descuento(estrato);

		ArrayList<Double> datosGuardados = new ArrayList<Double>();
		datosGuardados.add((double) estrato);
		datosGuardados.add(salario);
		datosGuardados.add(descuentoEstrato * salario);
		datosGuardados.add(salario-(descuentoEstrato * salario));

		imprimir(datosGuardados, nombre);
		mapDescuento.put(nombre, datosGuardados);
	}
	private void ingresarDatos() {
		String continuar;
		do {
			int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingresar cantidad de trabajadores"));
			for (int i = 0; i < cantidad; i++) {
				solicitarDatos();
			}
			continuar = continuidad();
		} while (continuar.equalsIgnoreCase("si") );
	}
	
	
	private String continuidad() {
		return JOptionPane.showInputDialog("Ingrese si para seguir registrando");
	}
	
	
	private void descuento(int estrato) {
		if (estrato == 1 || estrato == 2) {
			descuentoEstrato = 0.2;
		} else if (estrato == 3 || estrato == 4) {
			descuentoEstrato = 0.4;
		} else if (estrato == 5) {
			descuentoEstrato = 0.8;
		} else if (estrato == 6) {
			descuentoEstrato = 0.10;
		}
	}

	
	private void imprimirDatos() {
		System.out.println("<<<<<< Lista de registro >>>>>>");
		for (String nombre: mapDescuento.keySet()) {
			ArrayList<Double> datosGuardados = mapDescuento.get(nombre);
			int estrato = datosGuardados.get(0).intValue();
			double salario = datosGuardados.get(1);
			double descuento = datosGuardados.get(2);
			double salarioTotal = datosGuardados.get(3);
			
			System.out.println("Nombre: " + nombre);
			System.out.println("Estrato: " + estrato);
			System.out.println("Salario: " + salario);
			System.out.println("Descuento: " + descuento);
			System.out.println("Salario Total: " + salarioTotal);
			System.out.println("------------------------------------------");
		}
	}
	
	private void imprimir(ArrayList<Double> datos, String nombre) {
		String mensaje = "Nombre: " + nombre + "\n";
		mensaje += "Estrato: " + datos.get(0) + "\n";
		mensaje += "Salario: " + datos.get(1) + "\n";
		mensaje += "Descuento: " + datos.get(2) + "\n";
		mensaje += "Salario Total: : " + datos.get(3) + "\n";
		System.out.println(mensaje);
	}
}
