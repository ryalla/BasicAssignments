import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Accept {
	public static void main(String a[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a character: ");
		int x =Integer.parseInt(br.readLine());
		//System.out.println("enter the string: ");
		//String str= br.readLine();
		System.out.println("You entered:"+x);
	}
 
}
