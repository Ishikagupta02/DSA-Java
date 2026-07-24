import java.util.Scanner;

public class Main {

    // 1. Print numbers from 1 to 10
    static void printOneToTen() {
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }

    // 2. Print all even numbers between 1 and 100
    static void printEvenOneToHundred() {
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }

    // 3. Print all odd numbers between 1 and 100
    static void printOddOneToHundred() {
        for(int i=1;i<=100;i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
    }

    // 4. Print numbers from 10 down to 1
    static void printTenToOne() {
        for(int i=10;i>=1;i--){
            System.out.println(i+" ");
        }
    }

    // 5. Print table of given number
    static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
        System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    // 6. Print sum of first n natural numbers
    static void printSumNatural(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum "  + sum);
    }

    // 7. Print sum of all even numbers up to n
    static void printSumEven(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("Sum "  + sum);
    }

    // 8. Print sum of all odd numbers up to n
    static void printSumOdd(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==1){
                sum+=i;
            }
        }
        System.out.println("Sum "  + sum);
    }

    // 9. Print factorial of a given number
    static void printFactorial(int n) {
        int fact=1;
        for(int i=1;i<+n;i++){
            fact*=i;
        }
        System.out.println("Factorial: "  + fact);
    }

    // 10. Print product of digits of a given number
    static void printProductDigits(int n) {
        int product=1;
        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            n /= 10;
        }
        System.out.println("Product : "+ product);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1
        printOneToTen();

        // 2
        printEvenOneToHundred();

        // 3
        printOddOneToHundred();

        // 4
        printTenToOne();

        // 5
        int n = sc.nextInt();
        printTable(n);

        // 6
        n = sc.nextInt();
        printSumNatural(n);

        // 7
        n = sc.nextInt();
        printSumEven(n);

        // 8
        n = sc.nextInt();
        printSumOdd(n);

        // 9
        n = sc.nextInt();
        printFactorial(n);

        // 10
        n = sc.nextInt();
        printProductDigits(n);

        sc.close();
    }
}