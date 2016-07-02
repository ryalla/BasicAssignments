
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;


	public class EmpData {
		public static void main(String a[]) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter the id: ");
			int x =Integer.parseInt(br.readLine());
			System.out.println("enter the sex: ");
			char sex =(char)br.read();
			br.skip(2);
			System.out.println("enter the name: ");
			String name= br.readLine();
			//System.out.println("enter the string: ");
			//String str= br.readLine();
			System.out.println("You entered id:"+x);
			System.out.println("You entered sex:"+sex);
			System.out.println("You entered name:"+name);
		}
	 
	}

