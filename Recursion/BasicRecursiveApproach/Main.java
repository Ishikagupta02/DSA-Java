import java.util.Scanner;

public class Main {

    // 1. Print numbers from 1 to n
    static void printOneToN(int n) {
        if(n == 0){
            return;
        }
        printOneToN(n-1);
        System.out.print(n+ " ");
    }

    // 2. Print numbers from n down to 1
    static void printNToOne(int n) {
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printNToOne(n-1);
        
    }

    // 3. Print even numbers from 1 to n
    static void printEven(int n) {
        if(n==0){
            return;
        }
        printEven(n-1);
        if(n%2==0){
            System.out.print(n+ " ");
        }
    }

    // 4. Print odd numbers from 1 to n
    static void printOdd(int n) {
        if(n==0){
            return;
        }
        printOdd(n-1);
        if(n%2==1){
            System.out.print(n+" ");
        }
    }

    // 5. Sum of first n natural numbers
    static int sumNatural(int n) {
        if(n==0){
            return 0; 
        }
         return n + sumNatural(n-1); 
    }

    // 6. Factorial of number
    static int factorial(int n) {
        if(n==0 || n==1){
            return 1;
        }
        return n * factorial(n-1);  
    }

    // 7. Power x^n
    static int power(int x, int n) {
        if(n==0){
            return 1;
        }
        return x* power(x,n-1);
    }

    // 8. nth Fibonacci number
    static int fibonacci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        return fibonacci(n-1) +fibonacci(n-2);
    }

    // 9. Print Fibonacci series up to n terms
    static void printFibonacciSeries(int n, int a, int b) {
        if(n==0){
            return;
        }
        System.out.print(a+" ");
        printFibonacciSeries(n-1, b, a+b);
    }

    // 10. Sum of digits recursively
    static int sumDigits(int n) {
        if(n==0){
            return 0;
        }
        return (n%10) + sumDigits(n/10);  
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printOneToN(n);
        printNToOne(n);
        printEven(n);
        printOdd(n);

        System.out.println(sumNatural(n));
        System.out.println(factorial(n));

        int x = sc.nextInt();
        System.out.println(power(x, n));

        System.out.println(fibonacci(n));

        printFibonacciSeries(n, 0, 1);

        System.out.println(sumDigits(n));

        sc.close();
    }
}