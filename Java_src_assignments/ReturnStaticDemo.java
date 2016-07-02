
public class ReturnStaticDemo {
	static int myMethod(int x){
		return x*x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ReturnStaticDemo obj= new ReturnStaticDemo();
		int y=1;
		System.out.println("before return statement");
		//System.exit(0);
		int result=ReturnStaticDemo.myMethod(10);
		System.out.println("square of x:"+result);
		if(y==1)
			return;
		System.out.println("after return statement");
	}

}
