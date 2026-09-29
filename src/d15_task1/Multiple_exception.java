package d15_task1;

public class Multiple_exception {

	public static void main(String[] args) {
		
		try {
			int num = 10;
			int num1 = 0;
			int num2 = num/num1;
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println(e.getStackTrace());
		}
		System.out.println("================================");
		try {
			String S = null;
			System.out.println(S.length());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println(e.getStackTrace());
		}
		System.out.println("================================");
		
		try {
		int[] no = {10,15,20,25};
		System.out.println(no[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println(e.getStackTrace());
			
		}
		
		
		
	}
	

}
