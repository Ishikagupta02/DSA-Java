import java.util.Scanner;

public class Main {

    // 1. Count the number of digits in a number recursively.
    static int countDigits(int n) {
        if(n==0){
            return 0;
        }
        return 1+ countDigits(n/10);
    }

    // 2. Reverse a number recursively.
    static int reverseNumber(int n, int rev) {
        if(n==0){
            return rev;
        }
        return reverseNumber(n/10, rev*10+n%10);
    }

    // 3. Check if a number is a palindrome using recursion.
    // static boolean isPalindrome(int n) {

    // }

    // 4. Find product of digits of a number recursively.
    // static int productDigits(int n) {

    // }

    // 5. Find GCD (HCF) of two numbers using Euclid's algorithm recursively.
    // static int gcd(int a, int b) {

    // }

    // 6. Convert a number to binary recursively.
    // static void toBinary(int n) {

    // }

    // 7. Print digits of a number in words recursively.
    // static void digitsToWords(int n) {

    // }

    // 8. Calculate the sum of first n even numbers recursively.
    // static int sumEven(int n) {

    // }

    // 9. Calculate the sum of first n odd numbers recursively.
    // static int sumOdd(int n) {

    // }

    // 10. Find nCr recursively using Pascal's relation.
    // static int nCr(int n, int r) {

    // }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // System.out.println(countDigits(n));

        System.out.println(reverseNumber(n, 0));

        // System.out.println(isPalindrome(n));

        // System.out.println(productDigits(n));

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println(gcd(a, b));

        // toBinary(n);
        // System.out.println();

        // digitsToWords(n);
        // System.out.println();

        // System.out.println(sumEven(n));

        // System.out.println(sumOdd(n));

        // int r = sc.nextInt();
        // System.out.println(nCr(n, r));

        sc.close();
    }
}