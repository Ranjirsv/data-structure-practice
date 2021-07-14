package dataStructure;

public class TwoDimensionalArray {
	
	public static void main(String[] args) {
		int myArray[][] = {
				{ 23, 45, 67, 67, 65, 89 },
				{ 65, 78, 72, 73, 26, 36 },
				{ 37, 84, 87, 72, 27, 25 }
		};
		
		//Print location
		System.out.println(myArray);
		System.out.println("==Print all the elements of an Array==");
		
		//Read
		
		for(int i=0; i< myArray.length; i++) {
			for(int j=0; j< myArray[i].length; j++) {
				System.out.print(myArray[i][j]+" ");
			}
			System.out.println();
		}
		
		/*
		 * String
		 */
		String strArr[][] = new String[][] { {"a", "b"}, {"c", "d"}};
		
		for(String[] item: strArr) {
			for(String el: item) {
				System.out.print(el+" ");
			}
			System.out.println();
		}
	}

}
