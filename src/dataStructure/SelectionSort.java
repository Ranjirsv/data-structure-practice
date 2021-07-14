package dataStructure;

public class SelectionSort {
	
	static void sort(int arr[]) {
		
		int len = arr.length;
		
		for(int i=0; i<len-1; i++) {
			//Consider first element as min element
			int minIndex = i;
			for(int j=i+1; j<len; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		
		//Print
		for(int item: arr) {
			System.out.print(item+" ");
		}
		
	}

	public static void main(String[] args) {
		int arr[] = { 23, 56, 94, -10, 34 };
		SelectionSort.sort(arr);
	}

}
