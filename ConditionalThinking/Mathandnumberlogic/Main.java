import java.util.Scanner;

public class Main {

    // 1. Take a 3-digit number and check if all digits are distinct
    static void checkDistinctDigits(int n) {
        int a=(n/100);
        int b=((n/10)%10);
        int c=(n%10);
        if(a!=b && b!=c && c!=a){
            System.out.println("All Digit are distinct");
        }
        else{
            System.out.println("All Digit are not distinct");

        }
    }

    // 2. Middle digit is largest / smallest / neither
    static void checkMiddleDigit(int n) {
        int a=n/100;
        int b=(n/10)%10;
        int c=n%10;

        if(b>a && b>c){
            System.out.println(b+" is largest");
        }
        else if(b<a && b<c){
            System.out.println(b+" is smallest");
        }
        else{
            System.out.println("Neither");
        }

    }

    // 3. First and last digits equal in 4-digit number
    static void checkFirstLastEqual(int n) {
        int a=n/1000;
        int b=(n/100)%10;
        int c=(n/10)%10;
        int d=n%10;

        if(a==d){
            System.out.println("First and last digit are same");
        }
        else{
            System.out.println("First and last digit are not same");

        }
    }

    // 4. Single-digit / Double-digit / Multi-digit
    static void checkDigitCount(int n) {
        n=Math.abs(n);
        if(n>=0 && n<=9){
            System.out.println("Single Digit");
        }
        else if(n>=10 && n<=99){
            System.out.println("double Digit");
        }
        else{
            System.out.println("multi-digit");
        }
    }

    // 5. Multiple of 7 or ends with 7
    static void checkSevenCondition(int n) {
        if(n%7==0 || n%10==7){
            System.out.println("multiple of 7 or ends with 7");
        }
        else{
            System.out.println("not multiple of 7 or ends with 7 ");
        }
    }

    // 6. Determine quadrant using coordinates
    static void checkQuadrant(int x, int y) {
        if(x>0 && y>0){
            System.out.println("First Quadrant");
        }
        else if(x<0 && y>0){
            System.out.println("Second Quadrant");
        }
        else if(x<0 && y<0){
            System.out.println("Third Quadrant");
        }
        else if(x>0 && y<0){
            System.out.println("Fourth Quadrant");
        }
        else if(x==0 && y==0){
            System.out.println("Origin");
        }
        else if(x==0){
            System.out.println("y-axis");
        }
        else{
            System.out.println("x-axis");
        }

    }

    // 7. Amount evenly divided into 2000, 500, 100 notes
    static void checkCurrencyDivision(int amount) {
        if(amount%100==0){
            System.out.println("Can be Divided");
        }
        else{
            System.out.println("Cannot be divided");
        }
    }

    // 8. Check if number lies in range [100,999]
    static void checkRange(int n) {
        if(n>=100 && n<=999){
            System.out.println("Between range 100 & 999");
        }
        else{
            System.out.println("Not in range 100 & 999");
        }
    }

    // 9. Compute third angle of triangle
    static void findThirdAngle(int a, int b) {
        int c=180-(a+b);
        if(c>0){
            System.out.println("Third angle : " + c);
        }
        else{
            System.out.println("Invalid");
        }
    }

    // 10. Check perfect square without sqrt
    static void checkPerfectSquare(int n) {
        if(n<0){
            System.out.println("Invalid Number");
         }
        else{
            boolean flag=false;
            for(int i=1;i<=n;i++){
            if(i*i==n){
                System.out.println("Perfect square of " + i);
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("Not a perfect square");
        }
    }
}
        

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        checkDistinctDigits(n);

        n = sc.nextInt();
        checkMiddleDigit(n);

        n = sc.nextInt();
        checkFirstLastEqual(n);

        n = sc.nextInt();
        checkDigitCount(n);

        n = sc.nextInt();
        checkSevenCondition(n);

        int x = sc.nextInt();
        int y = sc.nextInt();
        checkQuadrant(x, y);

        int amount = sc.nextInt();
        checkCurrencyDivision(amount);

        n = sc.nextInt();
        checkRange(n);

        int a = sc.nextInt();
        int b = sc.nextInt();
        findThirdAngle(a, b);

        // n = sc.nextInt();
        checkPerfectSquare(n);

        sc.close();
    }
}