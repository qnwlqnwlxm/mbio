package week2;

import java.util.ArrayList;

public class betweenTwoSets {
	static int gcd(int big, int small){
		int tempBig = 1;
		int tempSmall = 1;
		if(big > small){
			tempBig = big;
			tempSmall = small;
		}else{
			tempBig = small;
			tempSmall = big;
		}
		while(tempBig%tempSmall!=0){
			tempSmall = tempBig%tempSmall;
		}
		return tempSmall;
		//big>small로 보장된 값이 들어오면 아래 재귀함수로 끝낼수 있음.
		//return (tempBig%tempSmall==0?tempSmall:gcd(tempBig,tempBig%tempSmall));
	}
	
	//여러개의 숫자가 들어왔을때 최대공약수 구하기
	
	static int gcd(int[] a, int n){
		int result=1;
		//배열의 길이가 1이면 그자체가 최대공약수
		if(n==1){
			return a[0];
		//배열의 길이가 2이면
		} else if(n==2){
			return gcd(a[0],a[1]);
		//배열의 길이가 3이상이면
		} else{
			for(int i=0;i<n-2;i++){
				result = gcd(gcd(a[i],a[i+1]),a[i+2]);
			}
		}
		return result;
	}
	static int lcm(int first, int second){
		return first*second/gcd(first,second);
	}
	
	static int lcm(int[] a,int n, int gcd){
		int result = 1;
		if(n==1){
			return a[0];
		}else if(n==2){
			return a[0]*a[1]/gcd;
		}else{
			for(int i=0;i<n-2;i++){
				result = lcm(lcm(a[i],a[i+1]),a[i+2]);
			}
		}
		return result;
	}
	static int getTotalX(int[] a, int[] b){
        // Complete this function
		int result = 0;
		int aGcd = gcd(a,a.length);
		int bGcd = gcd(b,b.length);
		int aLcm;
		//a의 최소공배수 구하기
		int max = 0;
		aLcm = lcm(a,a.length,aGcd);
		
		for(int i=0;i<a.length;i++){
			if(a[i]>max) max = a[i];
		}
		ArrayList<Integer> bGcdTemp = new ArrayList<Integer>();
		
		//bGcd의 약수를 구하고, 그 값이 aLcm의 배수이면		
		for(int i=1;i<=bGcd;i++){
			if(bGcd%i==0&&i>=max){
				bGcdTemp.add(i);
			}
		}
		for(int i=0;i<bGcdTemp.size();i++){
			if(bGcdTemp.get(i)%aLcm==0) result++;
		}
		
		return result;
    }
	
	public static void main(String[] args){
		int[] a = {100,99,98,97,96,95,94,93,92,91};
		int[] b = {1,2,3,4,5,6,7,8,9,10};
		//a의 최소공배수와, b의 최대공약수를 구하고
		//두수의 약수의 개수를 세면됨!
		int total = getTotalX(a, b);
        System.out.println(total);
	}
}
