package com.iesviergendelcarmen.cadena.ejercicios;

public class Contrasena {
 private String contrasena;

public Contrasena(String contrasena) {
	super();
	this.contrasena = contrasena;
}
/*
 public boolean correcta () {
	 return contrasena.matches("^.*[a-z]+[A-Z]+.*$");
 }
 */
public boolean correcta1 () {
	
	return tiene8Caracteres() && tieneLetraMinuscula() && tieneLetraMayuscula() && tieneNumero() && tieneNoAlfnumerico();
}
private boolean tiene8Caracteres () {
	return contrasena.length() >= 8;
}
private boolean tieneLetraMinuscula () {
	boolean salir = false;
	for (int i =0; i < contrasena.length(); i ++) {
		if (Character.isLowerCase(contrasena.charAt(i))) {
			salir = true;
			break;
		}
	}
	return salir || contrasena.contains("ñ");
	//contrasena.matches("^.*[a-zñ]+.*$");
}
private boolean tieneLetraMayuscula(){
	boolean salir = false;
	for (int i =0; i < contrasena.length(); i ++) {
		if (Character.isUpperCase(contrasena.charAt(i))) {
			salir = true;
			break;
		}
	}
	return salir || contrasena.contains("Ñ");
	//contrasena.matches("^.*[A-ZÑ]+.*$");
}
private boolean tieneNumero() {
	boolean salir = false;
	for (int i =0; i < contrasena.length(); i ++) {
		if (Character.isDigit(contrasena.charAt(i))) {
			salir = true;
			break;
		}
	}
	return salir || contrasena.contains("ñ");
	//contrasena.matches("^.*[0-9]+.*$");
	}
private boolean tieneNoAlfnumerico () {
	boolean salir = false;
	for (int i =0; i < contrasena.length(); i ++) {
		if (!Character.isLetterOrDigit(contrasena.charAt(i))) {
			salir = true;
			break;
		}
	}
	return salir || contrasena.contains("ñ");
	//contrasena.matches("^.*[\\W_]+.*$");
}
@Override
public String toString() {
	return "Contrasena [contrasena=" + contrasena + ", correcta1()=" + correcta1() + ", tiene8Caracteres()="
			+ tiene8Caracteres() + ", tieneLetraMinuscula()=" + tieneLetraMinuscula() + ", tieneLetraMayuscula()="
			+ tieneLetraMayuscula() + ", tieneNumero()=" + tieneNumero() + ", tieneNoAlfnumerico()="
			+ tieneNoAlfnumerico() + "]";
}


}
