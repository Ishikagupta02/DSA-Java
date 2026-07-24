import java.util.Scanner;

public class main {

    // 1. Print all numbers between 1 and N that are divisible by both 3 and 5.
    static void divisibleBy3And5(int n) {
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                System.out.println(i);
            }
        }
    }

    // 2. Find the sum of digits of a number (use loop).
    static void sumOfDigits(int n) {
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            n/=10;
        }
        System.out.println(sum);
    }

    // 3. Check if a number is an Armstrong number.
    static void armstrongNumber(int n) {
        int temp=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit*digit;
            n/=10;
        }
        if(sum==temp){
            System.out.println(temp + " is a armstrongNumber");
        }
        else{
            System.out.println(temp + " is not a armstrongNumber");
        }
    }

    // 4. Print all Armstrong numbers between 1 and 1000.
    static void armstrong1To1000() {
        for(int i=1;i<=100;i++){
            int temp=i;
            int sum=0;
            while(temp>0){
                int digit=temp%10;
                sum+=digit*digit*digit;
                temp/=10;
            }
            if(sum==i){
                System.out.println(i + " is a armstrongNumber");
            }
            else{
                System.out.println(i + " is not a armstrongNumber");
            }
        }
    }

    // 5. Find the factorial of a number using recursion.
    static int factorial(int n) {
        if(n==0 || n==1){
            return 1;
        }
        return n* factorial(n-1);
    }

    // 6. Count how many even digits a number contains.
    static void countEvenDigits(int n) {
        int count=0;
        while(n>0){
            int digit=n%10;
            if(digit%2==0){
                count++;
            }
            n/=10;
        }
        System.out.println("Count of even digit: " + count);
    }

    // 7. Print all prime numbers between 1 and N.
    static void prime1ToN(int n) {
        for(int i=2;i<n;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i+ " ");
            }
        }
    }

    // 8. Print the reverse of a number (123 -> 321).
    static void reverseNumber(int n) {
        int temp=n;
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        if(temp==rev){
            System.out.println("Yes, it is reversed Number");
        }
        else{
            System.out.println("no, not a reversed number");
        }
    }

    // 9. Check if a number is palindrome (121 -> true).
    static void palindromeNumber(int n) {
        int temp=n;
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        if(temp==rev){
            System.out.println("Yes, it is pallindrome Number");
        }
        else{
            System.out.println("no, not a pallindrome number");
        }
    }

    // 10. Check if a number is perfect (sum of factors equals number).
    static void perfectNumber(int n) {
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println(n + " is a perfect number");
        }
        else{
            System.out.println(n + " is not a perfect number");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        divisibleBy3And5(n);

        sumOfDigits(n);

        armstrongNumber(n);

        armstrong1To1000();

        System.out.println(factorial(n));

        countEvenDigits(n);

        prime1ToN(n);

        reverseNumber(n);

        palindromeNumber(n);

        perfectNumber(n);

        sc.close();
    }
}