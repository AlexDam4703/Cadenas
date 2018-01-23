package com.iesviergendelcarmen.cadena.ejercicios;

public class Contrasena {
 private String contrasena;

public Contrasena(String contrasena) {
	super();
	this.contrasena = contrasena;
}
 public boolean correcta () {
	 return contrasena.matches(".*([A-Z]+[a-z]+[0-9]+).*");
 }
@Override
public String toString() {
	return "Contraseña [contrasena=" + contrasena + ", correcta()=" + correcta() + "]";
}
 
}
