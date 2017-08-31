package week2;

public class Kangaroo {
	static String kangaroo(int x1, int v1, int x2, int v2){
		String yes = "YES";
		String no = "NO";
		if(v2>=v1){
			return no;
		}else{
			int mod = (x2-x1)%(v1-v2);	//modulus operator
			if(mod!=0){
				return no;
			}else{
				return yes;				
			}
		}
	}
	
	
	public static void main(String[] args){
		int x1 = 4523;
		int v1 = 8092;
		int x2 = 9419;
		int v2 = 8076;
		
		String result = kangaroo(x1,v1,x2,v2);
		System.out.println(result);
		
	}
}
