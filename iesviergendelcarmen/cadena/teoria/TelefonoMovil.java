package com.iesviergendelcarmen.cadena.teoria;

import java.util.Scanner;

public class TelefonoMovil {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String telefono = in.next();
		in.close();
		boolean correcto = telefono.matches("^(\\+?34)?[67][0-9]{8}");
		System.out.println(correcto);

	}

}
