import java.util.Scanner;

public class Main {

    // 1. Count number of digits
    static void countDigits(int n) {
        int count=0;
        if(n==0){
           count=1;
        }
        while(n>0){
            count++;
            n/=10;    
        }
        System.out.println(count);    
    }

    // 2. Reverse a number
    static void reverseNumber(int n) {
         int newnumber=0;
         while(n>0){
            int digit=n%10;
            newnumber=newnumber*10+digit;
            n/=10;
         }
        System.out.println(newnumber); 
    }

    // 3. Check palindrome number
    static void checkPalindrome(int n) {
        int original=n;
        int newnumber=0;
        while(n>0){
            int digit=n%10;
            newnumber=newnumber*10+digit;
            n/=10;
        }
        if(original==newnumber){
            System.out.println("Yes it is pallindrome"); 
        }
        else{
            System.out.println("no it is  not pallindrome"); 
        }
    }

    // 4. Sum of digits
    static void sumOfDigits(int n) {
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            n/=10;
        }
        System.out.println(sum); 

    }

    // 5. Check Armstrong number
    static void checkArmstrong(int n) {
        int count=0;
        int sum=0;
        int temp=n;
        int originalnumber=n;
        while(temp>0){
            count++;
            temp/=10;
        }
        temp=n;
        while(temp>0){
            int digit=temp%10;
            int power=1;
            for(int i=1;i<=count;i++){
                power*=digit;
            }
            sum+=power;
            temp/=10;
        }
        if(originalnumber==sum){
            System.out.println("Yes, it is armstrong number"); 
        }
        else{
            System.out.println("No, it is  not armstrong"); 
        }
    }

    // 6. Check perfect number
    static void checkPerfect(int n) {
        int temp=n;
        int sum=0;
        int originalnumber=n;
        for(int i=1;i<temp;i++){
            if(temp%i==0){
                sum+=i;
            }
        }
        if(originalnumber==sum){
            System.out.println("Yes, it is perfect number"); 
        }
        else{
            System.out.println("No, it is not perfect number"); 
        }
    }

    // 7. Print prime numbers between 1 and 100
    static void printPrimeOneToHundred() {
        for(int n=2;n<=100;n++){
            boolean flag=true;
            for(int i=2;i<n;i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        if(flag==true){
            System.out.println("Prime Numbers : " + n); 
        }
        }
    }

    // 8. Check prime number
    static void checkPrime(int n) {
        boolean flag=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        if(flag==true){
            System.out.println(" Yes it is a Prime Numbers"); 
        }
        else{
            System.out.println(" No, it is not a Prime Numbers");
        }
    }

    // 9. Print Fibonacci series up to n terms
    static void printFibonacci(int n) {
        int a=0;
        int b=1;
        for(int i=1;i<n;i++){
            System.out.print(a + " ");
            int c=a+b;
            a=b;
            b=c;
        }
    }

    // 10. Sum of first n Fibonacci terms
    static void sumFibonacci(int n) {
        int sum=0;
        int a=0;
        int b=1;
        for(int i=1;i<n;i++){
            sum+=a;
            int c=a+b;
            a=b;
            b=c;
        }
        System.out.print("Sum of Fibonacci series:"  + sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1
         int n = sc.nextInt();
        countDigits(n);

        // 2
        n = sc.nextInt();
        reverseNumber(n);

        // 3
        n = sc.nextInt();
        checkPalindrome(n);

        // 4
        n = sc.nextInt();
        sumOfDigits(n);

        // 5
        n = sc.nextInt();
        checkArmstrong(n);

        // 6
        n = sc.nextInt();
        checkPerfect(n);

        // 7
        printPrimeOneToHundred();

        // 8
        n = sc.nextInt();
        checkPrime(n);

        // 9
        n = sc.nextInt();
        printFibonacci(n);

        // 10
        n = sc.nextInt();
        sumFibonacci(n);

        sc.close();
    }
}