
public class InTheFuture {
	static int minNum(int A, int K, int P) {
		int sum =A+P;
		if (sum == K) return (P+1);
		else if (sum<K) return (K-sum);
		else return -1;
		
		
	}

}
