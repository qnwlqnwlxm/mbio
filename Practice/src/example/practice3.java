package example;

import java.util.Scanner;


public class practice3 {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int s = in.nextInt();
	        int t = in.nextInt();
	        int a = in.nextInt();
	        int b = in.nextInt();
	        int m = in.nextInt();
	        int n = in.nextInt();
	        int[] apple = new int[m];
	        for(int apple_i=0; apple_i < m; apple_i++){
	            apple[apple_i] = in.nextInt();
	        }
	        int[] orange = new int[n];
	        for(int orange_i=0; orange_i < n; orange_i++){
	            orange[orange_i] = in.nextInt();
	        }
	        
	        int cntApple = 0;
	        int cntOrange = 0;
	        
	        for(int i=0;i<apple.length;i++){
	            int temp = a+apple[i];
	            if(temp>=s&&temp<=t){
	                cntApple++;
	            }
	        }
	        for(int i=0;i<orange.length;i++){
	            int temp = b+orange[i];
	            if(temp>=s&&temp<=t){
	                cntOrange++;
	            }
	        }
	        System.out.println(cntApple);
	        System.out.println(cntOrange);
	        
	    }

}
