package algorithms.Insertion;

import java.util.ArrayList;

public class InsertionSort {
	static ArrayList<Integer> insertionSort (ArrayList<Integer> inputArrList){
		int key;
		int j;

		for(int i=1;i<inputArrList.size();i++){
			key = inputArrList.get(i);
			j = i-1;
			/*while(j>=0&&inputArrList.get(j)>key){
				inputArrList.set(j+1,inputArrList.get(j));
				j--;
			}
			inputArrList.set(j+1, key);*/
			for(j=i-1;j>=0&&inputArrList.get(j)>key;j--){
				inputArrList.set(j+1, inputArrList.get(j));
			}
			inputArrList.set(j+1,key);
		}
		return inputArrList;
	}
	public static void main(String[] args){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i =0;i<40;i++){
			arr.add((int) (Math.random()*100));		
		}
		System.out.println(arr);
		System.out.println(insertionSort(arr));
	}
}
