import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Fibonacci {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("enter number of fibonacci elements:");
		int n = Integer.parseInt(br.readLine());
		//consider two numbers
		int num1=0, num2=1;
		System.out.println(num1+"\n"+num2);
		int sum = num1+num2;
		System.out.println(sum);
		//here we got first three number at position 0,1,2 we need to 
		//start from 4th position
		int count =3;
		while(count<n){
			num1=num2;
			num2=sum;
			sum=num1+num2;
			System.out.println(sum);
			count++;
		}
		
	}

}
