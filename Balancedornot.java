package com.techolutions;

import java.util.Scanner;
import java.util.Stack;

public class Balancedornot {
	
	  static int[] balancedOrNot(String[] expressions, int[] maxReplacements) {
	    	int[] ans = new int[maxReplacements.length];
	    	for(int i=0; i<expressions.length;i++){
	    		   ans[i] = check(expressions[i], maxReplacements[i]);
	    	}
	    	return ans;
	    }
	  
	  static int check(String expression, int maxReplacement){
	    Stack<Character> stack = new Stack<Character>();
	    int count = 0;
	    for(char ch : expression.toCharArray()){
	      if(ch == '<'){
	        stack.push('<');
	      }
	      else if(stack.empty()){
	        count++;
	      }
	      else{
	        stack.pop();
	      }
	      }
	 
	 
	      if(!stack.empty()){
	          count+= stack.size();
	      }	 
	       return count <= maxReplacement ? 1 : 0;
	 
	    }


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter size of Expression :");  
		 int size=Integer.parseInt(sc.next());
		 String[] input =new String[size];
		 for(int i=0; i<input.length;i++){
			 
			 System.out.print("Enter "+i +" Expression :");  
			 input[i]=sc.next();
		 }
		 
	    int[] in =new int[2];
	    System.out.print("Enter 1st  maxReplacement :"); 
	    in[0]=Integer.parseInt(sc.next());
	    System.out.print("Enter 2nd  maxReplacement :"); 
	    in[1]=Integer.parseInt(sc.next());
	    
	    int[] res = balancedOrNot(input, in);
	    for(int i : res){
	      System.out.println(i);

	}

}
}
