package week3;

public class MigratoryBirds {
	static int migratoryBirds(int n, int[] ar){
		int[] count = {0,0,0,0,0};
		int max = 0;
		int index = 0;
		for(int i : ar){
			switch(i){
			case 1:
				count[0]++;
				break;
			case 2:
				count[1]++;
				break;
			case 3:
				count[2]++;
				break;
			case 4:
				count[3]++;
				break;
			case 5:
				count[4]++;
				break;
			}
		}
		max = count[0];
		for(int i = 0; i< count.length;i++){
			if(count[i]>max){
				max = count[i];
				index = i;
			}
		}
		return index+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int[] ar = {1,4,4,4,5,3};
		int result = migratoryBirds(n,ar);
		System.out.println(result);
	}

}
