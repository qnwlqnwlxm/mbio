package week3;

import java.util.ArrayList;
import java.util.HashSet;

public class TwoCharacters {
	
	static int twoCharacters(String s){
		//특정 문자를 지워서 똑같은 문자가 반복되지 않도록
		//문자열 변환, 그리고 2개의 알파벳으로 구성되야함.
		//풀이
		//1. 문자열이 어떤 문자로 구성되어있는지 구함
		//2. 각각의 문자로 조합을 만듬.1개부터 s.length-1까지
		//3. 각각의 조합으로 문자열 변환
		//4. 변환된 문자열이 2개의 알파벳으로 구성되었는지 확인
		//5. 4번을 만족한다면 변환문자열의 길이 반환
		//   만족하는게 없다면 0 반환
		//6. 5에서 구한 문자열 길이가 가장 큰 값 반환
		//
		int result = 0;
		char[] c = {};
		c = s.toCharArray();
		System.out.println(c);
		ArrayList<Character> temp = new ArrayList<Character>();
		for(int i=0;i<c.length;i++){
			temp.add(c[i]);
		}
		System.out.println(temp);
		HashSet<Character> temp2 = new HashSet<Character>(temp);
		System.out.println(temp2);
		temp = new ArrayList<Character>(temp2);
		System.out.println(temp);
		return result;
	}
	
	public static void main(String[] args){
		//a,b,e,f
		//a|b|e|f|a,b|a,e|a,f|b,e|b,f|e,f|a,b,e|a,b,f|b,e,f
		String s = "beabeefeab";
		System.out.println(twoCharacters(s));
	}
}
