package week3;
/* 170804
 * ภฬป๓มุ
 */
public class BirthdayChocolate {
	/*static int solve(int n, int[] s, int d, int m){
		int count =0;
        int sum = 0;
        int consecutive = 0;
        for(int i =0;i<n-m+1;i++){
            //for(int j=i;j<i+m-1;j++){
        	for(int j=i;consecutive<m;j++){
                sum += s[j];
                consecutive++;
            }
            System.out.println("sum : "+sum);
            if(sum==d){
            	count++;
            }
            sum = 0;
            consecutive = 0;
        }
        return count;
	}*/
	
	static int solve(int n, int[] s, int d, int m){
		int count =0;
        int sum = 0;
        for(int i =0;i<n-m+1;i++){
            for(int j=i;j<i+m;j++){
                sum += s[j];
            }
            if(sum==d){
            	count++;
            }
            sum = 0;
        }
        return count;
	}
	
	public static void main(String[] args){
		int n = 5;
		int[] s = {1,2,1,3,2};  
		int d = 3;
		int m = 2;
		int result = solve(n,s,d,m);
		System.out.println(result);
	}
}
