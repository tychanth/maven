package de.hfu;

import java.util.Scanner;

public class Buchstaben {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
	
		System.out.println("Hallo ich wandle kleinbuchstaben in Grossbuchstaben. Bitte etwas einegeben");
		
		String s = reader.next();
		String neu = "";
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)>90){
				neu = neu + (char)(s.charAt(i) - 32);
			}
			else{
				neu = neu + (char)s.charAt(i);
			}
				
		}
		System.out.println(neu);
		
		
		reader.close();
		
	}

}
