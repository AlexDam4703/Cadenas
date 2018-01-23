package com.iesviergendelcarmen.cadena.teoria;

import java.util.Scanner;

public class AuxiliarTarjetaCredito {

	public static void main(String[] args) {
		System.out.println("Intrudece el numero de la visa");
		Scanner in = new Scanner (System.in);
		String  numeroTarjeta = in.nextLine();
		in.close();
		//expresion regular para comprobar
		String regexNumeroTarjeta = "\\s*[0-9]{4}(\\s|-)?[0-9]{4}(\\s|-)?[0-9]{4}(\\s|-)?[0-9]{4}\\s*";
		System.out.printf("Comprobando numero %s: %b%n", numeroTarjeta, numeroTarjeta.matches(regexNumeroTarjeta));
		//trim lo que hace es eliminar los espacios en blaco tanto al principio como al final
		String numeroTarjetaFinal = numeroTarjeta.trim().replaceAll("[-\\s]","");
		System.out.println(numeroTarjetaFinal);
		/*
		char cero = '0';
		char uno = '1';
		suma = cero + uno;
		el resultado de esto es 97 que es la suma de los valores en unicode de los dos char, al restarle 48 obtenemos el valor
		*/
		int suma = 0;
		for (int i =0 ; i < numeroTarjeta.length() -1 ; i ++) {
			int numero = numeroTarjetaFinal.charAt(i) -48 ; // se guarda como int para que nos lo muestre su posicion en unicode + 48 en decimal
			if (i % 2 !=0 ) {
				numero *= 2;
			}
			suma += numero ;
		}
		int multiplicacion = suma * 9;
		String multiplicacionCadena = multiplicacion + ""; 
		// por ejemplo si diera 903 length cada una de las posiciones representa al 9, 0 o 3.
		String ultimoNumero = multiplicacionCadena.substring(multiplicacionCadena.length()-1);
		System.out.printf("suma: %d, miltiplicacion %d, ultima cifra %s%n",suma,multiplicacion,ultimoNumero);
	}

}
