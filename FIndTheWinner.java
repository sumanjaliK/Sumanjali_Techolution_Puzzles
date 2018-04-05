
public class FindTheWinner {
	
	static String winner(int[] andrea, int[] maria, String s) {
		int andreaSum=0;
		int mariaSum=0;
		int start=0;
		
		if("Odd".equalsIgnoreCase(s)) {
			start=1;
		}
		while(start < andrea.length){
			 andreaSum += andrea[start] - maria[start];
				mariaSum+= maria[start] - andrea[start];
				start=start+2;
			}
			return andreaSum >= mariaSum ? andreaSum == mariaSum? "Tie" : "Andrea": "Maria";
	}

}
