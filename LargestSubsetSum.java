
public class LargestSubsetSum {
	static long[] maxSubsetSum(int[] k) { 
		
		long[] sum = new long[k.length];
		int LIM = 0;
		while (LIM < k.length) {
			long count = 1;
			for (int i = 2; i <= k[LIM]/2; i++) {
				if (k[LIM] % i == 0) {
					count += i;
				}
			}
			sum[LIM] = count + k[LIM];
			LIM++;

		}
		return sum;
}

		 

}
