package week3;

import java.util.Scanner;

public class ViralAdvertising {

	static int viralAd(int n, int m){
		int[] dayCount = new int[50];
		dayCount[0] = m/2;
		int totalCount = dayCount[0];
		
		for(int i=1;i<n;i++){
			dayCount[i] = dayCount[i-1]*3/2;
			totalCount += dayCount[i];
		}
		
		return totalCount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//init.
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = 5;			//people
        System.out.println(viralAd(n,m));
	}

}
