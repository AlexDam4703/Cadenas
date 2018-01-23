package com.iesviergendelcarmen.cadena.ejercicios;

import java.util.Scanner;

public class TesteWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a word");
		Scanner in = new Scanner (System.in);
		Word word = new Word (in.next());
		in.close();
		System.out.println(word);
	}

}
