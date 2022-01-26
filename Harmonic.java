package com.bridgelabz.basic;

import java.util.Scanner;

public class Harmonic {
public static float FindHarmonic(int N) 
{
		
		float result = 0;
		if(N != 0) {
			
			for(int i= 1; i<= N; i++) {                    
				                                           //1<=6
			                                              //result=0+1/1=1
				result = result + (float)1/i;              //2<=6
				                                          //result=1+1/1=2
			}                                            // 3<=6
		}                                                     //result=2+1/3= 2.33
		                                                //4<=6
		else {  
			System.out.println("Invalid Input");        //n=3
		}                                                //1<=3
		return result;                                   //result=0+1/1=1
	}                                                    //2<=3
	public static void main(String[] args) {               //result=1+1/2==1.5
		                                                    //3<=3
		                                                     //result=1.5+1/3
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Harmonic value : ");
		int N = sc.nextInt();
		float value = FindHarmonic(N);
		System.out.printf("Sum of Harmonic value : %.3f " , value );
	     sc.close();	
	}

	

}
