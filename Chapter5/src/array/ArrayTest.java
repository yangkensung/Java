package array;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = new int [] {1,2,3,4,5,6,7,8,9,10};
		int total =0;
		for(int i=0; i<numbers.length; i++){
			total += numbers[i];
			System.out.println(total);
		}
		int [] test = new int [10];
//		int tt=0;
		for(int i =0; i<test.length; i++) {
			test[i] = i;
			System.out.println(test[i]);
		}
		
//		TwoDimensionArray		
		int[][] arrtest = {{1,2,3},{4,5,6,7,8,9}};
		for(int i=0; i < arrtest.length; i++) {
			for(int j=0; j< arrtest[i].length; j++) {
				System.out.print(arrtest[i][j] + " ");
			}
			System.out.println();
		}
	}

}
