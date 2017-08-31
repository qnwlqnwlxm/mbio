package week3;
/*	170804
 * 	ภฬป๓มุ
 */
public class BreakingTheRecords {
	
	static int[] getRecord(int[] s){
		int mostNum = s[0];
		int leastNum = s[0];
		int mostCount = 0;
		int leastCount = 0;
		for(int i =1; i<s.length;i++){
			if(s[i]>mostNum){
				mostNum = s[i];
				mostCount++;
			}else if(s[i]<leastNum){
				leastNum = s[i];
				leastCount++;
			}
		}
		int[] result = {0,0};
		result[0] = mostCount;
		result[1] = leastCount;
		return result;
	}
	
	public static void main(String[] args){
		int[] s = {3,4,21,36,10,28,35,5,24,42};
		int[] result = getRecord(s);
		String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
	}
}
