package com.techolutions;

import java.util.Scanner;

public class CountingGroups {
   
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in); 
    	System.out.println("Enter input");
    	 int rows=Integer.parseInt(sc.next());
    	 
    	 int cols=Integer.parseInt(sc.next());
    	 
    	 int[][] A = new int[rows][cols];

    	 for(int i=0; i<rows; i++) {
    		 for(int j=0; j<cols; j++) {
    			 A[i][j]=Integer.parseInt(sc.next());
    	    	 
    			 
    		 }
    	 }
        int totalNumGroups = 0; 
        int curCnt = 0;
        
   	 int size=Integer.parseInt(sc.next());
   	 
   	 int r[]= new int[size];
   	int result[]= new int[size];
   	 for(int i=0; i<size; i++) {
   		r[i]=Integer.parseInt(sc.next());
   	 }
   	for(int i=0; i<size; i++) {
         
        for(int x=0; x<r[i]; x++) {
            for(int y=0; y<r[i]; y++) {
                if (A[x][y] == 1 || A[x][y] == 0) {
                    curCnt = 0;  
                    totalNumGroups = totalNumGroups+ cleanBlock(A, x,y, curCnt);    
                }
            }
            
        }
        result[i]=totalNumGroups;
        System.out.println( totalNumGroups);
   	}

        
    
    }


    public static int cleanBlock(int[][] A, int x, int y, int cnt) { 
        A[x][y] = 0;
        if (inMatrix(x-1,y  ,A.length,A[0].length) == 1 && A[x-1][y] == 1) {
            cleanBlock(A, x-1,y  ,cnt); 
            cnt = 1;
            }
        if (inMatrix(x+1,y  ,A.length,A[0].length) == 1 && A[x+1][y] == 1) {
            cleanBlock(A, x+1,y  ,cnt); 
            cnt = 1;
            }
        if (inMatrix(x,y-1 ,A.length,A[0].length) == 1 && A[x][y-1] == 1) {
            cleanBlock(A, x,y-1  ,cnt); 
            cnt = 1;
            }
        if (inMatrix(x,y+1 ,A.length,A[0].length) == 1 && A[x][y+1] == 1) {
            cleanBlock(A, x,y+1  ,cnt); 
            cnt = 1;
            }

        return cnt;
    }

    public static int inMatrix(int x, int y, int lenX, int lenY) {
        if ( (x >= 0 && x <= (lenX-1)) && (y >= 0 && y <= (lenY-1)) )
            return 1;
        else
            return 0;
    }    
}
