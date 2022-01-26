package com.bridgelabz.basic;

import java.util.Scanner;

public class EvenOrOdd {
   public static int evenodd(int a)
   {
	   if(a%2==0)
	   {
		   System.out.println("Number is even");
		   
	   }
	   else
	   {
		   
		  System.out.println("Number is odd");
		   
	   }
	   
	   
	   return 1;
   }
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number to check");
	int b=sc.nextInt();
	evenodd(b);
	
    }

}
