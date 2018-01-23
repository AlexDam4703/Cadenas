package com.iesviergendelcarmen.cadena.ejercicios;
/**
 *  Class Word
 * @author Alex
 * @version 1.0
 */
public class Word {
	private String value;
/**
 * 
 * @param value type String content of word
 */
	public Word(String value) {
		super();
		this.value = value;
	}
/**
 * 
 * @return int number of character of word 
 */
	public int getNumberOfChar () {
		return value.length();
	}
/**
 * 
 * @return boolean, true if word start with vowel
 */
	public boolean startWhithVowel () {
		return value.toLowerCase().matches("^[aeiouáéíóú].*"); //comienza por alguna de esas seguinas de cualaquier cosa (.)
	}
/**
 * 
 * @return boolean, true if word ends with vowel
 */
	public boolean endWithVowel () {
		return value.toLowerCase().matches("^.*[aeiouáéíóú]$");
	}
/**
 * 
 * @return int number of volwel 
 */
	public int countNumberOfVowel () {
		int sum = 0;
		for (int i =0; i < value.length(); i ++) {
			/*
			 * String string = value.toLowerCase().charAt(i) + "";
			 * if (string.matches ("^.*[aeiouáéíóú]$");
			 */
			Word word = new Word (value.toLowerCase().charAt(i) + "");
			if (word.startWhithVowel())
				sum++;
		}
		return sum;
	}
/**
 * 
 * @return boolean, if word content "h"
 */
	public boolean containsHorh() {
		return value.toLowerCase().contains("h");
	}
/**
 * 
 * @param string
 * @return boolean, if word is equals string2
 */
	public boolean inEqualInValue (String string) {
		return value.equalsIgnoreCase(string);
	}
/**
 * 
 * @return boolean, if word is polindrome
 */
	public boolean isPalindrome () {
		StringBuilder sBuilder = new StringBuilder(value);
		String reverseWord = sBuilder.reverse().toString(); // reverse retorna un StringBuilder por eso hay que hacerle un toString para convertirlo a String
		return reverseWord.equals(value);
	}
	@Override
	public String toString() {
		return "Word [value=" + value + ", getNumberOfChar()=" + getNumberOfChar() + ", startWhithVowel()="
				+ startWhithVowel() + ", endWithVowel()=" + endWithVowel() + ", countNumberOfVowel()="
				+ countNumberOfVowel() + ", containsHorh()=" + containsHorh() + ", inPalindrome()=" + isPalindrome()
				+ "]";
	}
	
}
