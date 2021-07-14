package dataStructure;

public class InsertionSort {
	
	static void sort(int[] arr) {
		int len = arr.length;
		for(int i=0; i<len; i++) {
			int key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1] = key;
			InsertionSort.print(arr);
			System.out.println();
		}
	}
	
	static void print(int[] arr) {
		
		//Print array
		for(int el: arr) {
			System.out.print(el+" ");
		}
		
	}

	public static void main(String[] args) {
		
		int[] arr = { 34, 16, 927, -54, 524 };
		
		InsertionSort.sort(arr);
	}

}
