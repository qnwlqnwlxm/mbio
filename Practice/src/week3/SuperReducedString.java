package week3;

public class SuperReducedString {
	
	static String super_reduced_string(String s){
		for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i)==s.charAt(i+1)){
				s = s.substring(0, i) + s.substring(i+2);
				i = -1;
			}
		}
		if(s.length()==0) return "Empty String";
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="aaabccddd";
		String s2 = "baab";
		String s3 = "aa";
			
		System.out.println(super_reduced_string(s1));
		System.out.println(super_reduced_string(s2));
		System.out.println(super_reduced_string(s3));
	}

}
