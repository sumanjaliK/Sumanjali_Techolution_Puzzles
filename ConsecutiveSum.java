
public class ConsecutiveSum {
	static int consecutive(long n) {

		int count = 0;
		System.out.print("Enter number :");  
		
		 for (int i = 1; i <= n / 2; i++) {
				int k = (int) (2 * n + i * (i - 1));

				long j = (long) ((-1 + Math.sqrt(1 + 4 * k)) / 2);
				if (j * (j + 1) == k) {
					count++;
				}
			}
		return count;

	
	}

}
