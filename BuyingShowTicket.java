package com.techolutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuyingShowTicket {
	
	public static int waitingTime(List<Integer> line, int pos) {
	    int waitingTime = line.get(pos);
	    for (int i = 0; i < line.size(); i++) {
	      if (i == pos) continue;
	      waitingTime += (Math.min(line.get(pos), line.get(i)));
	      if (i > pos) {
	        waitingTime--;
	      }
	    }

	    return waitingTime;
	  }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the input :");  
		int size=Integer.parseInt(sc.next());
		List<Integer> a=new ArrayList<>(size);
		for (int i=0; i< size;i++){
			a.add(Integer.parseInt(sc.next()));
		}
		
		int pos=Integer.parseInt(sc.next());
		
		System.out.println(waitingTime(a, pos));
		

	}

}
