package com.iesviergendelcarmen.cadena.ejercicios;

import java.util.Scanner;

public class TestContaseña {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Introduxca la contraseña");
		Scanner in = new Scanner (System.in);
		Contrasena contrasena = new Contrasena (in.next());
		in.close();
		System.out.println(contrasena);
		*/
		final String FUENTE_CARACTERES	 = "aAbBcCdDeEfFgGhHiIjJkKlLm-\n" + 
				"MnN ̃n\n" + 
				" ̃\n" + 
				"NoOpPqQrRsStTuUvVwWxXyYzZ0123456789¿?()=@.:,;!¡&\n" + 
				"{}\n" + 
				"";
		System.out.println("tamaño de fuente de caracteres: " +FUENTE_CARACTERES.length());
	//generar el nº de claves a crear de 0-999
		//int numeroDeClaves = (int) (Math.random() * 1000); // Si se quisiera llegar hasta 1000 habria que multiplciarlo por 1001
		for (int i = 0; i < 1000; i++) {
			int tamanoClave = (int) (Math.random() * FUENTE_CARACTERES.length());
			System.out.println(tamanoClave);
			Contrasena contrasena = null;
			 String SContrasena = "";
			for(int j=0 ; j < tamanoClave; j ++) {
				int posicion = (int) (Math.random() * FUENTE_CARACTERES.length());
				SContrasena += FUENTE_CARACTERES.charAt(posicion);
			}
			
			System.out.println(SContrasena);
			contrasena = new Contrasena (SContrasena);
		}
	}

}
