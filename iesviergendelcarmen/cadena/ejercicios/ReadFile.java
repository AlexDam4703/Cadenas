package com.iesviergendelcarmen.cadena.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> womenList = new ArrayList <> ();
		List<String> womenListStartWithA = new ArrayList <> ();
		List<String> womenListNoEndWithVowel = new ArrayList <> ();
		List<String> womenListLonger = new ArrayList <> ();
		List<String> womenListShort = new ArrayList <> ();
		Scanner in = new Scanner (System.in);
		int longerName = 0;
		int shortesName = Integer.MAX_VALUE;
		while (in.hasNextLine()) {
			String nameOfWomen = in.nextLine();
			if (nameOfWomen.startsWith("a"))
				womenListStartWithA.add(nameOfWomen);
			if (nameOfWomen.matches("^.*[^aeiou]$"))
				womenListNoEndWithVowel.add(nameOfWomen);
			womenList.add(nameOfWomen);
			if (nameOfWomen.length() <= shortesName) {
				if (nameOfWomen.length() < longerName) {
				shortesName = nameOfWomen.length();
				womenListShort.clear();
				}
				womenListShort.add(nameOfWomen);
			}
			if (nameOfWomen.length() >= longerName) {
				if (nameOfWomen.length() > longerName) {
				longerName = nameOfWomen.length();
				womenListLonger.clear();
				}
				womenListLonger.add(nameOfWomen);
			}
		}
		if (args.length != 0) {
			System.out.println("Hay un argumento");
		
			System.out.printf("%s existe? %b%n:",args[0].toString(),womenList.contains(args[0]));
		}
		else {
		System.out.println("Number of names of women: " + womenList.size());
		System.out.println("Numer women that start with A: " + womenListStartWithA.size());
		System.out.println("Numer of names that not end with vowel: " + womenListNoEndWithVowel.size());
		System.out.println(womenListLonger);
		System.out.println(womenListShort);
		}
	}

}
