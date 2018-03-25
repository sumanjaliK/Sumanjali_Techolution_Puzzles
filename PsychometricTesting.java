package com.techolutions;

import java.util.Scanner;

public class PsychometricTesting {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);  
		//System.out.print("Enter number of elements in score :");  
		 int size=Integer.parseInt(sc.next());
		 int[] input =new int[size];
		 //System.out.print("Enter the scores");  
		 for(int i=0; i<input.length;i++){
			 input[i]=Integer.parseInt(sc.next());
		 }
		 
		// System.out.println("number of queries");
		 int lowerquery =Integer.parseInt(sc.next());
		// System.out.println("Enter lower limits");
		 int[] lowerLimit =new int[lowerquery];
		 for(int i=0; i<lowerquery;i++){
			 lowerLimit[i]=Integer.parseInt(sc.next());
		 }
		 
		// System.out.println("number of queries");
		 int higherquery =Integer.parseInt(sc.next());
	//	 System.out.println("Enter upper limits");
		 int[] upperLimit =new int[higherquery];
		 for(int i=0; i<higherquery;i++){
			 upperLimit[i]=Integer.parseInt(sc.next());
		 }
		 
		 int [] result=new int[higherquery];
		 int count=0;
		 
		for (int n : input)	 {
			 for(int i=0; i<higherquery;i++){
			 if (lowerLimit[i]>= n && n<= upperLimit[i]) {
				 count++;
				 result[i]=count;
			 }
			 }
		}
				 
	}

}
