package com.bridgelabz.basic;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		 int number;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number ::");
	      number = sc.nextInt();
	                                                     //number=24
	      for(int i = 2; i< number; i++) {                //i=2 2<24 true
	         while(number%i == 0) {                           //24%2==0
	            System.out.println(i+" ");                   //2 2 2 3
	            number = number/i;                          //number=12
	         }                                       
	      }
	      if(number >2) 
	      {
	         System.out.println(number);
	      }
	   }
		
		
		// TODO Auto-generated method stub

	}


