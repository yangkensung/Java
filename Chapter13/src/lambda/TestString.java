package lambda;

public class TestString {
	
	public static void main(String[] args) {
		
		StringConCatImpl impl = new StringConCatImpl();
		impl.stringConcat("hello", "java");
		
		
		
		StringConcat lambdaImpl = (s1, s2) -> System.out.println(s1+s2);
		lambdaImpl.stringConcat("check", "test");
		
		
		
		
		StringConcat innerImpl = new StringConcat() {
			@Override
			public void stringConcat(String s1, String s2) {
				// TODO Auto-generated method stub
				System.out.println(s1+s2);
			}
		};
		innerImpl.stringConcat("checkCheck", "java");
		
	}

}
