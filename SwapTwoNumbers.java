package com.bridgelabz.basic;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) 
	{
        
		Scanner sc= new Scanner(System.in);      
		
		System.out.println("Enter the value for number ");
	  	
		
		int num1=sc.nextInt();  
		
		System.out.println("Enter the second number:");
		int num2=sc.nextInt();
		
		System.out.println("The numbers to swap :" +num1  + num2);
		

		Swap(num1, num2);
	
	}

public static int Swap(int num1,int num2)

{
  	     num1=num1+num2;                                 //num1=20 num2=30   num1=30 num2=20
	      num2=num1-num2;                                         //num1=20+30=50
	       num1=num1-num2;                                        //num2=50-30=20
	                                                              //num1=50-20=30
	       System.out.println("The swaped numbers are :" +num1 + + num2);
	       
	       return 1;
}



}
