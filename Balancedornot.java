import java.util.Stack;


public class BalancedOrNot {

	 static int[] balancedOrNot(String[] expressions, int[] maxReplacements) {
	    	int[] ans = new int[maxReplacements.length];
	    	for(int i=0; i<expressions.length;i++){

	    	    Stack<Character> stack = new Stack<Character>();
	    	    int count = 0;
	    	    for(char ch : expressions[i].toCharArray()){
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
	    	      ans[i] = count <= maxReplacements[i] ? 1 : 0;
	    	 
	    	    
	    	}
	    	return ans;
	    }
	  
}
