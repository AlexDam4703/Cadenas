package com.iesviergendelcarmen.cadena.teoria;

import java.util.Scanner;

public class NumeroDecimal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String posibleNumero = in.next();
		in.close();
		boolean correcto = posibleNumero.matches("-?[0-9]+([.,]?[0-9]+)?");
		if (correcto) {
			posibleNumero = posibleNumero.replace(',','.');
			System.out.printf("el numero %f%n", Double.parseDouble(posibleNumero));
			System.out.printf("Su raiz cubica es: %.3f",Math.cbrt(Double.parseDouble(posibleNumero)));
		}
		else 
			System.out.println("Esto no es un numero");
	}

}
