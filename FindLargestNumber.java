package com.bridgelabz.basic;

import java.util.Scanner;

public class FindLargestNumber {
	
	public static int largest(int num1,int num2, int num3)                              
	{
		if(num1 > num2 && num1 > num3) {
			System.out.println("The largest Number is : " + num1);
		}
		else if(num2 > num1 && num2 > num3){
			System.out.println(" The largest Number : " + num2);                 
		}
		else {
			System.out.println("The largest Number : " + num3);
		}
		
		return 1;
	
	}
	
public static void main(String[] args) 
	{
	    
    	System.out.println("Enter the first value:");
    	Scanner sc= new Scanner(System.in);
    	int a=sc.nextInt();
    	System.out.println("Enter the second value:");
    	int b=sc.nextInt();
    	System.out.println("Enter the third value:");
    	int c=sc.nextInt();
    	largest(a, b, c);
    	sc.close();
	
	}

}
