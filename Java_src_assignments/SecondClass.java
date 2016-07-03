
 class FirstClass {
	public static void main(String args[]){
		for(String s:args){
			System.out.println(s);
		}
			System.out.println("main method of first class");
	}
}
public class SecondClass{
	public static void main(String args[]){
		String countries[]= { "USA", "UK","France","India", "Russia"};
		FirstClass.main(countries);
	}
}