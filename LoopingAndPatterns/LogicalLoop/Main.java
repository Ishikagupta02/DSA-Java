import java.util.Scanner;

public class Main {

    // 1. Print all numbers whose sum of digits is even (1-100)
    static void printEvenDigitSumNumbers() {
        for(int n=1;n<=100;n++){
            int temp=n;
            int sum=0;
            while(temp>0){
                int digit=temp%10;
                sum+=digit;
                temp/=10;
            }
            if(sum%2==0){
                System.out.println(n);
            }
        }
    }

    // 2. Count numbers between 1-500 divisible by 7 but not by 5
    static void countDivisibleBy7Not5() {
        for(int n=1;n<=500;n++){
            if(n%7==0 && n%5!=0){
                System.out.println(n);
            }
        }
    }

    // 3. Print palindrome numbers between 1-500
    static void printPalindromeNumbers() {
        for(int n=1;n<=500;n++){
            int originalNumber=n;
            int temp=n;
            int reversednumber=0;
            while(temp>0){
                int digit=temp%10;
                reversednumber=reversednumber*10+digit;
                temp/=10;
            }
            if(originalNumber==reversednumber){
                System.out.println(originalNumber);
            }
        }
    }

    // 4. Print numbers whose digit sum is multiple of 3
    static void printDigitSumMultipleOfThree() {
        for(int n=1;n<=100;n++){
            int temp=n;
            int sum=0;
            while(temp>0){
                int digit=temp%10;
                sum+=digit;
                temp/=10;
            }
            if(sum%3==0){
                System.out.println(n);
            }
        }
    }

    // 5. Find smallest and largest digit
    static void smallestLargestDigit(int n) {
        int min=9;
        int max=0;

        while(n>0){
            int digit=n%10;
            if(digit<min){
                min=digit;
            }
            if(digit>max){
                max=digit;
            }
            n/=10;
        }
        System.out.println("Min :" + min);
        System.out.println("Max :" + max);
    }

    // 6. Binary representation has even number of 1s
    static void printEvenOnesBinary(int n) {
        for(int num=1;num<=n;num++){
            int temp=num;
            int count=0;
            while(temp>0){
                if(temp%2==1){
                    count++;
                }
                temp/=2;
            }
            if(count%2==0){
                System.out.println(num);
            }
        }
    }

    // 7. Row i prints i*i
    static void printSquarePattern(int n) {
        for(int i=1;i<=n;i++){
            System.out.println(i*i);
        }
    }

    // 8. Print factorial of each number 1 to n
    static void printFactorialSeries(int n) {
        for (int i=1;i<=n;i++){
            int fact=1;;
            for(int j=2;j<=i;j++){
                fact*=j;
            }
            System.out.println(i + "! = " + fact);
        }
    }

    // 9. Sum of odd digits and even digits separately
    static void sumOddEvenDigits(int n) {
        int oddsum=0;
        int evensum=0;

        while(n>0){
            int digit=n%10;
            if(digit%2==0){
                evensum+=digit;
            }
            else{
                oddsum+=digit;
            }
            n/=10;
        }
        System.out.println("Odd Sum: "  + oddsum );
        System.out.println("Even Sum: "  + evensum );
    }

    // 10. Take 5 numbers, skip 0, print sum
    static void sumFiveNumbersSkipZero() {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        for(int i=0;i<5;i++){
            int n=sc.nextInt();
            if(n==0){
                continue;
            }
            sum+=n;
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // printEvenDigitSumNumbers();
        // countDivisibleBy7Not5();
        // printPalindromeNumbers();
        // printDigitSumMultipleOfThree();

        int n = sc.nextInt();
        // smallestLargestDigit(n);

        // n = sc.nextInt();
        // printEvenOnesBinary(n);

        // n = sc.nextInt();
        // printSquarePattern(n);

        // n = sc.nextInt();
        // printFactorialSeries(n);

        // n = sc.nextInt();
        // sumOddEvenDigits(n);

        sumFiveNumbersSkipZero();

        sc.close();
    }
}