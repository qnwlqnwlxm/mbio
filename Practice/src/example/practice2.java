package example;

public class practice2 {
	public static void main(String args[]){
		int[] arr = {37,38,57,58,59,61,62,63,60};
		int quotient = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=38){
				if(arr[i]%5==0){
					quotient = (arr[i]/5)*5;
					if(quotient-arr[i]<3){
						arr[i] = quotient;
					}
				}else{
					quotient = (arr[i]/5+1)*5;
					if(quotient-arr[i]<3){
						arr[i] = quotient;
					}
				}
			}
			System.out.println(arr[i]);
		}
		
		
	}
}
