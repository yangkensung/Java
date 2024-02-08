package generic;

import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("test");
		
		Object obj = list.get(0);
		String str = (String)list.get(0);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("test");
		

	}

}
