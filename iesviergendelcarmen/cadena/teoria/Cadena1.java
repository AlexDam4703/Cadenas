package com.iesviergendelcarmen.cadena.teoria;

import java.util.Arrays;

public class Cadena1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena1 = "hola";
		String cadena2 = "hola";
		String cadena3 = new String ("hola");
		//En este primer caso comparamos las direcciones de memoria 
		System.out.println("cadena2 == cadena2: "+ (cadena1 == cadena2));
		System.out.println("cadena1 == cadena3: " + (cadena1 == cadena3));
		// En este segundo caso comparamos el contenido de las posiciones de memoria
		System.out.println("contenido cadena2 == cadena2: "+ (cadena1.equals(cadena2)));
		System.out.println("contenido cadena1 == cadena3: " + (cadena1.equalsIgnoreCase(cadena3)));
		
		//El metodo split elimina de la cadena la regla que introduzcas y genera cadenas nuevas cuando lo encuentra
		//Este metodo retorna un vector 
		String cadena4 = "hola mundo desde programacion java";
		String [] cadenaDividida = cadena4.split(" ");
		System.out.println(Arrays.toString(cadenaDividida));
		//Lo sigiente se usa para dar formato a un string por partes, funciona de la misma forma que el pintf
		String outputCadena = String.format("%d/%s/%d",17,"enero",2018);
		System.out.println(outputCadena);
	}

}
