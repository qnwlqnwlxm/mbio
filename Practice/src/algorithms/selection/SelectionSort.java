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
			//temp���� ���� ���� �ٲٱ�?? ��� 4�� �ֵ� ����.
			temp = inputArrList.get(min);
			inputArrList.set(min, inputArrList.get(i));
			inputArrList.set(i, temp);
		}
		return inputArrList;
	}
	
	public static void main(String[] args){
		/*SelectionSort : �����Ͽ� �����ϴ� �˰���
		 *Min-Selection sort : �ּҰ� �����ؼ� ��, �������� ����
		 *Max-Selection sort : �ִ밪 �����ؼ� ��, �������� ����
		 * 
		 *�˰��� ����
		 *1. ���ĵ��� ���� ���� �߿� ���� ���� ���� ����
		 *2. ������ ���ڸ� ���ĵ��� ���� ���ڵ� ��
		 *   ù��° ���ڿ� �ڸ��� �ٲٸ� ���õ� ���ڴ� ���ĵ�.
		 *3. ��� ���ڿ� ���� �ݺ�
		 *i��°���� i ���Ҹ� �������� n-i�� �� n(n-1)/2 -> ��Ÿ(n^2)
		 *������ ���� Ƚ���� ���ϹǷ� �ּ���, �־��� ����
		 * */
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i =0;i<40;i++){
			arr.add((int) (Math.random()*100));		
		}
		System.out.println(arr);
		System.out.println(selectionSort(arr));

	}
}
