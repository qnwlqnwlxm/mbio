package week3;

public class DivisibleSumPairs {
	static int divisibleSumPairs(int n, int k, int[] ar){
		int count=0;
		int sum=0;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				sum = ar[i] + ar[j];
				if(sum%k==0) count++;
				sum = 0;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int k = 3;
		int[] ar = {1,3,2,6,1,2};
		int result = divisibleSumPairs(n,k,ar);
		System.out.println(result);
	}

}
