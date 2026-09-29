package d15_task1;

public class Nest {

	public static void main(String[] args) {
		try {
			
			try {
				String s = null;
				System.out.println(s.length());
			} catch (NullPointerException e) {
				System.out.println(e.getMessage());
				System.out.println(e.toString());
				System.out.println(e.getStackTrace());
			}
			int a = 10;
			int b = a/0;
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println(e.getStackTrace());
			
		}

	}

}
