package week3;

import java.util.ArrayList;
import java.util.HashSet;

public class TwoCharacters {
	
	static int twoCharacters(String s){
		//Ư�� ���ڸ� ������ �Ȱ��� ���ڰ� �ݺ����� �ʵ���
		//���ڿ� ��ȯ, �׸��� 2���� ���ĺ����� �����Ǿ���.
		//Ǯ��
		//1. ���ڿ��� � ���ڷ� �����Ǿ��ִ��� ����
		//2. ������ ���ڷ� ������ ����.1������ s.length-1����
		//3. ������ �������� ���ڿ� ��ȯ
		//4. ��ȯ�� ���ڿ��� 2���� ���ĺ����� �����Ǿ����� Ȯ��
		//5. 4���� �����Ѵٸ� ��ȯ���ڿ��� ���� ��ȯ
		//   �����ϴ°� ���ٸ� 0 ��ȯ
		//6. 5���� ���� ���ڿ� ���̰� ���� ū �� ��ȯ
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
