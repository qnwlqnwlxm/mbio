package algorithms.selection;

import java.util.ArrayList;

public class SelectionSort {
	
	static ArrayList<Integer> selectionSort(ArrayList<Integer> inputArrList){
		int temp,min;
		for(int i = 0; i<inputArrList.size()-1;i++){
			min = i;
			for(int j=i+1;j<inputArrList.size();j++){
				if(inputArrList.get(j)<inputArrList.get(min)){
					min = j;
				}
			}
			//temp변수 없이 숫자 바꾸기?? 방법 4개 있따 했음.
			temp = inputArrList.get(min);
			inputArrList.set(min, inputArrList.get(i));
			inputArrList.set(i, temp);
		}
		return inputArrList;
	}
	
	public static void main(String[] args){
		/*SelectionSort : 선택하여 정렬하는 알고리즘
		 *Min-Selection sort : 최소값 선택해서 비교, 오름차순 정렬
		 *Max-Selection sort : 최대값 선택해서 비교, 내림차순 정렬
		 * 
		 *알고리즘 설명
		 *1. 정렬되지 않은 숫자 중에 가장 작은 숫자 선택
		 *2. 선택한 숫자를 정렬되지 않은 숫자들 중
		 *   첫번째 숫자와 자리를 바꾸면 선택된 숫자는 정렬됨.
		 *3. 모든 숫자에 대해 반복
		 *i번째에서 i 원소를 기준으로 n-i번 비교 n(n-1)/2 -> 세타(n^2)
		 *언제나 같은 횟수를 비교하므로 최선과, 최악이 없음
		 * */
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i =0;i<40;i++){
			arr.add((int) (Math.random()*100));		
		}
		System.out.println(arr);
		System.out.println(selectionSort(arr));

	}
}
