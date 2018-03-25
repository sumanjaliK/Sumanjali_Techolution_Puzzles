package com.techolutions;

import java.util.Scanner;

public class ConsecutiveSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		int count = 0;
		System.out.print("Enter number :");  
		 int n=Integer.parseInt(sc.next());
		 for (int i = 1; i <= n / 2; i++) {
				int k = 2 * n + i * (i - 1);

				long j = (long) ((-1 + Math.sqrt(1 + 4 * k)) / 2);
				if (j * (j + 1) == k) {
					System.out.println("sum [" + i + ".." + j + "] = " + n);
					count++;
				}
			}
		
		System.out.println( count);
		sc.close();

	}
}