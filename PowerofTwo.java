package com.bridgelabz.basic;

import java.util.Scanner;

	public class PowerofTwo
	{
	public static void calcPowerOfTwo(int N) 
	{
			
			int power=1;
			//for testing
			                                              //N=5;
	                                                       //5>=0 5<=31		
	        if( N >= 0  && N <= 31){                       //inside forloop
	                                                         //i=0 0<=5 true //1<=5 true
	           for(int i= 0; i<= N; i++){                      //2^0 = 1  2^1=2
	                                                             //pwer=2*1=2
	                System.out.println("2^" + i + "=" + power );  //power=
	                power = (2 * power) ;                          
	            }                                                  //5<=5 true
	        }                                                        //
		}
		public static void main(String[] args) {
			
			
			//read input using command line argument
			//convert command line argument to integer
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the limit ");
			int N = sc.nextInt();
			

			calcPowerOfTwo(N);
		}

	}



