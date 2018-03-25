package com.techolutions;

import java.util.Scanner;

public class FIndTheWinner {

	private static int andreaSum=0;
	private static int mariaSum=0;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		//System.out.print("Enter Andrea array size  :");  
		int asize=Integer.parseInt(sc.next());
		int[] andrea =new int[asize];
		//System.out.print("Enter Andrea elements :");  

		for(int i=0; i<asize;i++){
			andrea[i]=Integer.parseInt(sc.next());
		}
//		System.out.print("Enter Maria array size  :");  
		int msize=Integer.parseInt(sc.next());
		int[] maria =new int[msize];
		//System.out.print("Enter Maria elements :");  
		for(int i=0; i<msize;i++){
			maria[i]=Integer.parseInt(sc.next());
		}
		//System.out.print("Enter game type  :");  
		String game=sc.next();
		int start=0;
if("odd".equalsIgnoreCase(game)) {
	start=1;
}

while(start < asize){
 andreaSum += andrea[start] - maria[start];
	mariaSum+= maria[start] - andrea[start];
	
	start=start+2;
}

if(andreaSum > mariaSum) System.out.println("Andrea");
else if(andreaSum < mariaSum) System.out.println("Maria");
else System.out.println("Tie");

	}

}
