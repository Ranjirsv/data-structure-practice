package dataStructure;

public class BubbleSort {
	
	static void sort(int[] arr) {
		int length = arr.length;
		for(int i=0; i<length-1; i++) {
			for(int j=0; j<length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int temp: arr) {
			System.out.print(temp+" ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 2, 1 };
		BubbleSort.sort(arr);
	}
	

}
