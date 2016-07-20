class One{
	int i=10;
	One(){
		System.out.println("from super constructor");
	}
	One(int i){
		System.out.println("from parameterized constructor,i value:"+i);
	}
	void show(){
		System.out.println("super class i:"+i);
	}
}
class Two extends One {
	int i=20;
	Two(){
		super(100);
		System.out.println("from sub class contructor");
		
	}
	void show(){
		super.show();
		System.out.println("sub class i:"+i);
	}
}
public class MainDemo {

	public static void main(String[] args) {
		Two obj = new Two();
		//One obj1 = new One();
		obj.show();
		//obj1.show();

	}

}
