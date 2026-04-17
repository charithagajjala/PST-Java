import java.util.Scanner;

public class DigitSumOption {

    static int digitSum(int n, int option) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;

            if (option == 1 && digit % 2 == 0) {
                sum += digit; // sum of even digits
            }
            else if (option == 2 && digit % 2 != 0) {
                sum += digit; // sum of odd digits
            }

            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Choose option:");
        System.out.println("1. Sum of even digits");
        System.out.println("2. Sum of odd digits");
        int option = sc.nextInt();

        if (option != 1 && option != 2) {
            System.out.println("Invalid option");
        } else {
            int result = digitSum(num, option);
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}
