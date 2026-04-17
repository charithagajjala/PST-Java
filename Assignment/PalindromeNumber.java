import java.util.Scanner;

public class PalindromeNumber {

    static boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Negative numbers are not palindrome");
        } else {
            if (isPalindrome(num)) {
                System.out.println(num + " is a Palindrome number");
            } else {
                System.out.println(num + " is NOT a Palindrome number");
            }
        }

        sc.close();
    }
}
