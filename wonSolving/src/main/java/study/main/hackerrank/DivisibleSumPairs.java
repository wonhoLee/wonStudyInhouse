package study.main.hackerrank;

public class DivisibleSumPairs {
	// Complete the divisibleSumPairs function below.
    static int divisibleSumPairs(int n, int k, int[] ar) {
    	int nCnt = 0;
    	for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if((ar[i] + ar[j]) % k == 0) {
					nCnt++;
				}
			}
		}
    	return nCnt;
    }

    public static void main(String[] args) {
//    	int n = 6;
//    	int k = 3;
//    	int[] ar = {1, 3, 2, 6, 1, 2};
    	int n = 6;
    	int k = 5;
    	int[] ar = {1,2,3,4,5,6};
    	
    	System.out.println(divisibleSumPairs(n, k, ar));
	}
}
