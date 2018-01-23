package com.iesviergendelcarmen.cadena.teoria;

import java.util.Scanner;

public class ExpresionRegular {
public static void main(String[] args) {
	//leer un DNI 12345678letra
	Scanner in = new Scanner(System.in);
	String dni = in.next();
	in.close();
	boolean exito = dni.toUpperCase().matches("^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]?$"); //el ? implica que lo que hay justo antes puede o no estar.
	System.out.printf("DNI %s ¿es valido? %B%n", dni, exito);
	
}
}
