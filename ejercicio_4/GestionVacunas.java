package refactorizacion;

/*
 * @author Adrian George Olteanu
 * @version 1.0.0
 * @param entrada
 * @param dni=DNI
 * @param nv=Número vacuna
 * @param v1=Vacuna 1
 * @param v2=Vacuna 2
 * @param d1=Día 1
 * @param d2=Día 2
 */

import java.util.Scanner;

public class GestionVacunas {

	public static void main(String[] args) {

		String nombre, dni, nv = "";
		String v1 = "", v2 = ""
		String d1 = "", d2 = "";

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el nombre del paciente:");
		nombre = teclado.next();
		System.out.println("Introduzca el dni del paciente:");
		dni = teclado.next();
		System.out.println("Vacuna 1 o 2?");
		nv = teclado.next();
	}
}
