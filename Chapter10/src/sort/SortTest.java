package sort;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("select Sort method");
		System.out.println("B : bubble sort");
		System.out.println("H: Heap sort");
		System.out.println("Q: Quick sort");
		
		int ch = System.in.read();
		Sort sort = null;
		
		if(ch=='B'|| ch == 'b') {
			sort = new BubbleSort();
		}
		
		else if(ch=='H'|| ch == 'h') {
			sort = new HeapSort();
		}
		
		else if(ch=='Q'|| ch == 'q') {
			sort = new QuickSort();
		}else {
			System.out.println("Error");
			return;
			
		}
		
		int[] arr = new int[10];
		
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();

	}

}
