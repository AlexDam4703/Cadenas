package com.iesviergendelcarmen.cadena.ejercicios;

import java.util.Scanner;

public class TestContaseña {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduxca la contraseña");
		Scanner in = new Scanner (System.in);
		Contrasena contrasena = new Contrasena (in.next());
		in.close();
		System.out.println(contrasena);
	}

}
