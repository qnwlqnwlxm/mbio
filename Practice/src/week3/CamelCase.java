package week3;

public class CamelCase {
	static int camelCase(String s){
		//lowerCamelCase���� �ܾ� ���� ���ϴ� ����
		//A~Z : �ƽ�Ű 65~90
		//a~z : �ƽ�Ű 97~122
		//�ƽ�Ű�ڵ尡 97���� ���� ���� ����+1 ��ȯ�ϸ��
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
		//��Ŀ��ũ Editorial..
		//split�� ���ԽĿ� ���� ©���ִ°�
		String[] words = str.split("[A-Z]");
         System.out.println(words.length);
	}
}
