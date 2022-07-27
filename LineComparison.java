package com.bridgelabz.lineComparison;

import java.util.Scanner;


public class LineComparison {
      int x1,x2,y1,y2;
	  public static void calculateLength () {
		
		System.out.println("Welcome To Line Comparison Computation Program ");
		Scanner scanner = new Scanner(System.in);

	      System.out.println("Enter the Co-ordinates of x1 and y1 : ");
	      int x1 =  scanner.nextInt();
	      int y1 =  scanner.nextInt();
	      System.out.println("Enter the Co-ordinates of x2 and y2 : ");
	      int x2 =  scanner.nextInt();
	      int y2 =  scanner.nextInt();
	      
	      double length = Math.sqrt((x2 - x1)^2  +  (y2 - y1)^2);
	      System.out.println("Length of the given Line is : " + length + " units");
	       
	      scanner.close();
	    } 
	   
	  public static void main(String[] args) {
		  
		  calculateLength ();
		  
	  }
	  
	}


