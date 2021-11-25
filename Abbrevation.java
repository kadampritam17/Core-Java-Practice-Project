//Problem Statement : 
//		Q1.Write a program that takes your full name as input and displays the abbreviations of 
//		the first and middle names except the last name which is displayed as it is.
//		For example, if your name is Sneha Amod Parchure, then the output should be S.A.Parchure.


package q1_AbbrevNameOutput;

import java.util.Scanner;

public class Abbrevation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Full Name : ");
		String s = scanner.nextLine();
		System.out.println("Entered Full Name : " + s);
		
		String[] arr = s.split(" ");
		String newStr = "";
		String p1, p2 = "";
		for(String n : arr)
		{
			p1 = n.toUpperCase().substring(0,1);
			p2 = n.substring(1,n.length());
			
//			By +
			newStr = newStr + p1 + ".";
//			by concat
//			newStr = newStr.concat(p1.toUpperCase().concat(p2.toLowerCase().concat(" ")));
		}
		newStr=newStr.substring(0,newStr.length()-1) + p2.toLowerCase();
		System.out.println(newStr);

	}

}
