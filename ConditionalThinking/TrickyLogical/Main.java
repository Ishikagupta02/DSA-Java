import java.util.Scanner;

public class Main {

    // 1. X-axis / Y-axis / Origin
    static void checkPointPosition(int x, int y) {
        if(x==0 && y==0){
            System.out.println("Origin");
        }
        else if(x==0){
            System.out.println("Y-axis");
        }
        else if(y==9){
            System.out.println("X-axis");
        }
        else{
            System.out.println("Neither exis");
        }
    }

    // 2. Check Pythagorean triplet
    static void checkPythagoreanTriplet(int a, int b, int c) {
        if((a*a+b*b==c*c) || (a*a+c*c==b*b) || (b*b+c*c==a*a)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    // 3. Valid calendar date (ignore leap year)
    static void checkValidDate(int day, int month) {
        if((month<1 && month>12) || (day<1)){
            System.out.println("Invalid date");
        }
        else if(month==2){
            if(day==28 || day==29){
                System.err.println("Valid date");
            }
            else{
                System.out.println("Invaid date");
            }
        }
        else if(month==4 || month==6 || month==9|| month==11){
            if(day<=30){
                System.out.println("Valid date");
            }
            else{
                System.out.println("Invalid date");
            }
        }
        else{
            if(day<=31){
                System.out.println("Valid date");
            }else{
                System.out.println("Invalid date");
            }
        }
    }

    // 4. Smaller angle between clock hands
    static void checkClockAngle(int hour, int minute) {

    }

    // 5. Arithmetic progression
    static void checkAP(int a, int b, int c) {
        if((b-a) ==(c-b)){
            System.out.println("Yes It is AP");
        }
        else{
            System.out.println("No, It is not a  AP");
        }
    }

    // 6. Geometric progression
    static void checkGP(int a, int b, int c) {
        if(a!=0 && b!=0 &&(b/a) ==(c/b) &&  b%a==0 && c%b==0){
            System.out.println("Yes It is GP");
        }else{
            System.out.println("No, It is not a  GP");
        }
    }

    // 7. Sum of first and last digit equals middle digit
    static void checkDigitCondition(int n) {
        int firstdigit=n%10;
        int middledigit=(n/10)%10;
        int lastDigit=n/100;
        if((firstdigit+lastDigit)==middledigit){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }

    // 8. Sum of digits > Product of digits
    static void checkSumGreaterThanProduct(int n) {
        int sum=0;
        int product=1;

        while(n>0){
            int digit=n%10;
            sum+=digit;
            product*=digit;
            n=n/10;
        }
        if(sum>product){
            System.out.println("Yes");
        }else System.out.println("No");
    }

    // 9. Which date comes first
    static void compareDates(int day1, int month1, int day2, int month2) {
        if(month1<month2){
            System.out.println("Month 1 come first");
        }
        else if(month1>month2){
            System.out.println("Month 2 come first");
        }
        else{
            if(day1<day2){
                System.out.println("day 1 come first");
            }else if(day1>day2){
                System.out.println("day 2 come first");
            }else{
                System.out.println("Both date comes equal");
            }
        }
    }

    // 10. Find century
    static void checkCentury(int year) {
        int century = (year - 1) / 100 + 1;
        System.out.println(century + "th Century");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1
        int x = sc.nextInt();
        int y = sc.nextInt();
        checkPointPosition(x, y);

        // 2
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        checkPythagoreanTriplet(a, b, c);

        // 3
        int day = sc.nextInt();
        int month = sc.nextInt();
        checkValidDate(day, month);

        // 4
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        checkClockAngle(hour, minute);

        // 5
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        checkAP(a, b, c);

        // 6
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        checkGP(a, b, c);

        // 7
        int n = sc.nextInt();
        checkDigitCondition(n);

        // 8
        n = sc.nextInt();
        checkSumGreaterThanProduct(n);

        // 9
        int day1 = sc.nextInt();
        int month1 = sc.nextInt();
        int day2 = sc.nextInt();
        int month2 = sc.nextInt();
        compareDates(day1, month1, day2, month2);

        // 10
        int year = sc.nextInt();
        checkCentury(year);

        sc.close();
    }
}