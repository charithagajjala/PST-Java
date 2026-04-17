import java.util.Scanner;

public class SumOfLastDigits {

    static int sumOfLastDigits(int a, int b) {
        int lastDigit1 = Math.abs(a % 10);
        int lastDigit2 = Math.abs(b % 10);
        return lastDigit1 + lastDigit2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int result = sumOfLastDigits(num1, num2);

        System.out.println("Sum of last digits: " + result);

        sc.close();
    }
}
