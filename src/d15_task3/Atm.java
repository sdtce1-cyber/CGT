package d15_task3;

public class Atm {

	public static void main(String[] args) {
		int balance = 10000;
		int withdraw = 11000;
		
		if (balance >= withdraw ) {
			System.out.println("Windraw successful");
		} else {
			throw new ArithmeticException("Insufficient balance");
		}
		

	}

}
