package d15_task5;

import java.util.Scanner;

public class Smark {
    public static void Marks(int mark) {

        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Invalid mark. Mark must be between 0 and 100.");
        }

        System.out.println("Valid Mark: " + mark);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mark: ");
        int mark = sc.nextInt();

        try {
            Marks(mark);
        } 
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
