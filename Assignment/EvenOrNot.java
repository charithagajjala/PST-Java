import java.util.Scanner;

public class EvenOrNot {

    static int checkEven(int n) {
        if (n % 2 == 0) {
            return 2;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = checkEven(num);
        System.out.println("Result: " + result);

        sc.close();
    }
}
