import java.util.Scanner;

public class NthFibonacci {

    static long fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        long a = 0, b = 1, c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input N
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid input");
        } else {
            System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));
        }

        sc.close();
    }
}
