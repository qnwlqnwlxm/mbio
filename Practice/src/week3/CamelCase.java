package week3;

public class CamelCase {
	static int camelCase(String s){
		//lowerCamelCase에서 단어 갯수 구하는 문제
		//A~Z : 아스키 65~90
		//a~z : 아스키 97~122
		//아스키코드가 97보다 작은 문자 갯수+1 반환하면됨
		int result = 0;
		char[] c = {};
		c = s.toCharArray();
		for(int i=0;i<c.length;i++){
			if(c[i] < 97){
				result++;
			}
		}
		return result+1;
	}
	
	public static void main(String[] args){
		String str = "saveChangesInTheEditor";
		System.out.println(camelCase(str));
		//해커랭크 Editorial..
		//split은 정규식에 따라 짤라주는거
		String[] words = str.split("[A-Z]");
         System.out.println(words.length);
	}
}
