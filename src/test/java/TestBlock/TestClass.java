package TestBlock;

public class TestClass {

	public static void main(String[] args) throws ArithmeticException {

		int a=100;
		int b=10;
		
		int arr[] = null;
		
		newMthod();
		
//		try {
			
			if(a>10) {
				throw new ArithmeticException();
			}
		
		System.out.println(b-a);
		
		
		
			System.out.println(b/a);
//		}catch(ArithmeticException err) {
//			err.printStackTrace();
			System.err.println("Arithmatic Issue found");
			
		
//		}finally {
//			System.out.println("Always execute!");
//		}
//		
		try {
			System.out.println(arr[1]);
		
		}catch(NullPointerException n ) {
			n.printStackTrace();
			System.out.println("Array not defined");
		}catch(Exception e) {
			
		}
		
		System.out.println(a+b);
		
		
				

	}
	
	public static void newMthod() throws ArithmeticException,NullPointerException{
		
	}

}
