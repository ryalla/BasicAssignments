
public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x = true;
		b1:{
			bl2:{
				bl3:{
					System.out.println("Block3");
					if(x)break bl2;
		           }
				System.out.println("block2");
				}
			System.out.println("from Block1"); 
		}
		System.out.println("All blocks are executed");
	}

}
