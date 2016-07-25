import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableDemo {
	public static void main(String a[]) throws IOException {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "a");
		ht.put(2, "b");
		ht.put(3, "c");
		ht.put(4, "d");
		ht.put(5, "e");
		ht.put(6, "f");
		ht.put(7, "g");
		ht.put(8, "h");
		ht.put(9, "i");
		ht.put(10, "j");
		ht.put(11, "k");
		ht.put(12, "l");
		ht.put(13, "m");
		ht.put(14, "n");
		ht.put(15, "0");
		ht.put(16, "p");
		ht.put(17, "q");
		ht.put(18, "r");
		ht.put(19, "s");
		ht.put(20, "t");
		ht.put(21, "u");
		ht.put(22, "v");
		ht.put(23, "w");
		ht.put(24, "x");
		ht.put(25, "y");
		ht.put(26, "z");
		/*HashSet<String> hs = new HashSet<String>();
		hs = ht.values();
		Iterator it = hs.iterator();
		while(it.hasNext()){
			String s = (String)it.next();
			System.out.println(s);
		}*/
		Enumeration e = ht.keys();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the key from 1 to 26 to get the corresponding value:");
		int num = Integer.parseInt(br.readLine());
		String value = ht.get(num);
		if(value!= null){
			System.out.println("value is:"+value);
		}
		else System.out.println("value not found");
		
	}

}
