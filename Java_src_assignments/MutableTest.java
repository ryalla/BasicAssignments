
public class MutableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "data";
		String s2 = "base";
		System.out.println(s1.hashCode());
		System.out.println(s1.intern());
		s1=s1+s2;
		System.out.println("Sring s1:"+s1);
		System.out.println(s1.hashCode());
		System.out.println(s1.intern());
		StringBuffer sb = new StringBuffer("United states");
		System.out.println("content of sb:"+sb);
		System.out.println(sb.hashCode());
		sb.append("America");
		System.out.println("content of sb after adding:"+sb);
		System.out.println(sb.hashCode());

	}

}
