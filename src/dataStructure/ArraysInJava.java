package dataStructure;

public class ArraysInJava {
	
	public static void main(String args[]) {
		/*
		 * One Dimensional Array
		 */
		int[] myArray = new int[5];
		//Read Array Values
		for(int i=0; i<myArray.length; i++) {
			System.out.println("Array Value "+i+" is "+ myArray[i]);
		}
		
		//Write Data
		myArray[0] = 100;
		myArray[1] = 200;
		myArray[2] = 300;
		myArray[3] = 400;
		myArray[4] = 500;
		System.out.println("========================");
		//Read Array Values
		for(int i=0; i<myArray.length; i++) {
			System.out.println("Array Value "+i+" is "+ myArray[i]);
		}
		
		//int[] newArray = { 21, 22, 23, 24, 25 };
		int[] newArray = new int[] { 31, 32, 34, 45, 67 };
		System.out.println("========================");
		//Read Array Values
		for(int i=0; i<newArray.length; i++) {
			System.out.println("Array Value "+i+" is "+ newArray[i]);
		}
		
		//Enhanced for loop
		System.out.println("=====================");
		for(int item: myArray) {
			System.out.println(item);
		}
		
		
				
	}

}
