package object;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String javastr = new String("java");
		String android = new String("Android");
		System.out.println(System.identityHashCode(javastr));
		System.out.println(javastr.concat(android));
		javastr = javastr.concat(android);
		
		System.out.println(System.identityHashCode(javastr));
		
		StringBuilder buffer = new StringBuilder();
		System.out.println(System.identityHashCode(buffer));
		buffer.append("java");
		System.out.println(System.identityHashCode(buffer));
		buffer.append("android");
		System.out.println(System.identityHashCode(buffer));
		buffer.append("javascript");
		System.out.println(System.identityHashCode(buffer));
		String all = buffer.toString();
		System.out.println(all);
		System.out.println(System.identityHashCode(buffer));

	}

}
