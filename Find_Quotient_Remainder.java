package com.bridgelabz.basic;

import java.util.Scanner;

public class Find_Quotient_Remainder {

	public static int FindQuotientRemainder(int divident,int divisor)
	{
		
		int quotient=divident/divisor;
		int remainder=divident%divisor;
		System.out.println("The quotient is" +quotient);
		System.out.println("The remainder is" +remainder);		
	    return 1;
	}
	
	public static void main(String[] args) 
	{
		
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter divident");
      int num1=sc.nextInt();
      System.out.println("Enter divisor");
      int num2=sc.nextInt();
	  System.out.println(FindQuotientRemainder(num1, num2));
	  sc.close();
	
	}

}
