package punto2;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Suma {
	static int cantidadAIngresar = 0;
    static int []primerArreglo = new int[cantidadPersonas()];
	static int []segundoArreglo = new int[cantidadAIngresar];
	static int []resultado = new int[primerArreglo.length];
	public static void main(String arg[]) {
		new Suma();
	}
	
	public Suma() {
		solicitarNumeros();
		sumaDeLosArreglos(primerArreglo, segundoArreglo);
		imprimir();
	}
	
	private void solicitarNumeros() {
		for (int i = 0; i < cantidadAIngresar; i++) {
			int numArreglo1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+ (i+1) + " del primer arreglo"));
			int numArreglo2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+ (i+1) + " del segundo arreglo"));
			primerArreglo[i] = numArreglo1;
			segundoArreglo[i] = numArreglo2;
		}
	}
	
	public static Integer cantidadPersonas() {
		cantidadAIngresar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de los arreglos"));
		return cantidadAIngresar;
	}
	public static int[] sumaDeLosArreglos (int[]x, int[]y) {
		for (int i = 0; i < x.length; i++) {
				resultado[i] = x[i] + y[i];
		}
		
		return resultado;
	}
	public static void imprimir() {
		System.out.println("Primer Arreglo:");
		System.out.println(Arrays.toString(primerArreglo));
		System.out.println("Segundo Arreglo:");
		System.out.println(Arrays.toString(segundoArreglo));
		System.out.println("Resultadoo de la suma entre ambos:");
		System.out.println(Arrays.toString(resultado));
	}
}
