package com.techolutions;

import java.util.Scanner;

public class InTheFuture {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		//System.out.print("Enter number of problems Asha solves per day :");
		int a=Integer.parseInt(sc.next());
		///System.out.print("Enter number of problems Kelly solves per day :");
		int k=Integer.parseInt(sc.next());
		//System.out.print("Enter number of problems  Asha is ahead of Kelly :");
		int p=Integer.parseInt(sc.next());
		
		int sum =a+p;
		if (sum == k)System.out.print( p+1);
		else if (sum<k)System.out.print(k-sum);
		else System.out.print("-1");
		
		sc.close();

	}

}
