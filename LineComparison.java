package com.bridgelabz.lineComparison;

import java.util.Scanner;


public class LineComparison {
	
	public static int x1, x2, y1, y2, x3, x4, y3, y4;
    static Double length1, length2;
    Scanner scanner = new Scanner(System.in);

    public void lengthValue() {
       
        System.out.println("For given line");
        System.out.println("Enter co-ordinates of x1 and y1");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        System.out.println("Enter co-ordinates of x2 and y2");
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        System.out.println("For second line");
        System.out.println("Enter co-ordinates of x3 and y3");
        x3 = scanner.nextInt();
        y3 = scanner.nextInt();
        System.out.println("Enter co-ordinates of x4 and y4");
        x4 = scanner.nextInt();
        y4 = scanner.nextInt();
    }
   
    

    public void lengthCalculation() {
        length1 = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println("Length of first line = " + length1 + " units");
        length2 = Math.sqrt((x4 - x3) ^ 2 + (y4 - y3) ^ 2);
        System.out.println("Length of second line = " + length2 + " units");
    }

    public void ifEquals() {
        if (length1 == length2) {
            System.out.println("Lines are Equal");
        }
        else {
            System.out.println("Lines are Not Equal");
        }
    }

    public void checkRelation() {
        if (length1 == length2) {
            System.out.println("Lines are equal");
        }
         else if (length1 > length2) {
            System.out.println("line 1 is Greater than line 2");
         }
         else {
            System.out.println("Line 1 is Less than line 2");
        }
        
        scanner.close();
        
     
       
    }
    
}
    
		        
		     
		       
		    