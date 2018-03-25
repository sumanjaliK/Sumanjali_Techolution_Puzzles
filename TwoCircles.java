package com.techolutions;

import java.util.Scanner;
class TwoCircles{

	static void circle(int x1, int y1, int r1, int x2, int y2, int r2)
	{
		int c1,c2;
		if (x1==0) {
			c1=y1;
			c2=y2;			
		}
		else {
			c1=x1;
			c2=x2;
		}

		if (Math.abs(c1-c2) > Math.abs(r1+r2))
			System.out.println ( "Disjoint Outside");
		else if(Math.abs(c1-c2) < Math.abs(r1-r2))
			System.out.println ( "Disjoint Inside");
		else if(Math.abs(c1-c2) == r1 + r2 || Math.abs(c1-c2) == Math.abs(r1-r2))
			System.out.println ( "Touching");
		else if(Math.abs(r1-r2) < Math.abs(c1-c2) && Math.abs(r1+r2) > Math.abs(c1-c2))
			System.out.println ( "Intersecting");
		else if(x1 == x2 || y1 == y2)
			System.out.println ( "Concentric");
		else
			System.out.println ( "May be other type!!!");
	}

	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the input :");  
		int size=Integer.parseInt(sc.next());
		int a[][]=new int[size][6];
		for (int i=0; i< size;i++){
			for (int j=0; j< 6;j++){
				a[i][j]=Integer.parseInt(sc.next());
			}				
		}
		for (int i=0; i< size;i++){
			circle(a[i][0],a[i][1],a[i][2], a[i][3], a[i][4], a[i][5]);

		}
		sc.close();
	}
}
