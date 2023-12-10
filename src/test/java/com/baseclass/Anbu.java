package com.baseclass;

import java.util.Scanner;

public class Anbu {
	public static void main(String[]args) {
		 System.out.println ("Enter the number");
		 Scanner sc= new Scanner (System.in);
		 int number = sc.nextInt();
		 if ( number==0) {
		 System.out.println("Even number: "+number);
		 }
		  else if (number ==2) {
		 System.out.println("Odd number: "+number);
		  }
		 
	}

}
