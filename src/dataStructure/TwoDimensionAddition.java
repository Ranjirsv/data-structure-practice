package dataStructure;

public class TwoDimensionAddition {

	public static void main(String[] args) {
		int[][] a = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		int b[][] = {
				{1, 2, 1},
				{5, 4, 3},
				{1, 7, 2}
		};
		
		int sum[][] = new int[3][3];
		
		for(int i=0; i<sum.length; i++) {
			for(int j=0; j<sum[i].length; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		
		for(int i=0; i<sum.length; i++) {
			for(int j=0; j<sum[i].length; j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}

	}

}
