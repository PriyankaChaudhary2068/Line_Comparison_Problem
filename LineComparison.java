package com.bridgelabz.lineComparison;

import java.util.Scanner;


public class LineComparison {
	
      int x1,x2,x3,x4,y1,y2,y3,y4;
	  public static void CheckLineEquality () {
		
		System.out.println("Welcome To Line Comparison Computation Program ");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Co-ordinates of x1 and y1 : ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        
        System.out.println("Enter the Co-ordinates of x2 and y2 : ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        
        Double length1 = Math.sqrt((x2 - x1)^2  +  (y2 - y1)^2);
        
        System.out.println("Enter the Co-ordinates of x3 and y3 : ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        
        System.out.println("Enter the Co-ordinates of x4 and y4 : ");
        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();
        
        Double length2 = Math.sqrt((x4 - x3)^2  +  (y4 - y3)^2);
        
        System.out.println("Length of the first Line is : " + length1 + " units" );
        System.out.println("Length of the second Line is : " + length2 + " units" );
		System.out.println();
		
         if(length1.equals(length2))
            System.out.println("Both lines are EQUAL ");
         else
            System.out.println("Both lines are Not EQUAL ");
         
         
	      scanner.close();
	    } 
	  
	   
	  public static void main(String[] args) {
		  
		  CheckLineEquality ();
		  
	  }
	  
	}


