public class PsychometricTesting {
	static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {

		int [] result=new int[lowerLimits.length];
		int count=0;
		for (int n : scores)	 {
			for(int i=0; i<scores.length;i++){
				if (lowerLimits[i]>= n && n<= upperLimits[i]) {
					count++;
					result[i]=count;
				}
			}
		}

		return result;
	}

}
