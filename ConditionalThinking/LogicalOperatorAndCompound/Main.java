import java.util.Scanner;

public class Main {

    // 1. Letter / Digit / Neither
    static void checkCharacterType(char ch) {
        if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
            System.out.println("Letter");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println("Digit");
        }
        else{
            System.out.println("Neither");
        }
    }

    // 2. Fizz / Buzz / FizzBuzz
    static void checkFizzBuzz(int n) {
        if(n%3==0 && n%5==0){
            System.out.println("FizzBuzz");
        }
        else if(n%5==0){
            System.out.println("Buzz");
        }
        else if(n%3==0){
            System.out.println("Fizz");
        }
        else{
            System.out.println("Invalid");
        }
    }

    // 3. Median of three numbers
    static void checkMedian(int a, int b, int c) {
        if((a<b && a>c) || (a>b && a<c)){
            System.out.println(a + " is a median");
        }
        else if((b<a && b>c) || (b>a && b<c)){
            System.out.println(b + " is a median");
        }
        else{
            System.out.println(c + " is a median");
        }
    }

    // 4. AM or PM using 24-hour time
    static void checkAMPM(int hour, int minute) {
        if((hour<0 && hour>23) || (minute<0 && minute>59)){
            System.out.println("Invalid time");
        }
        else if(hour<12){
            System.out.println("AM");
        }
        else{
            System.out.println("PM");
        }
    }

    // 5. Tax eligibility
    static void checkTaxEligibility(int age, double income) {
        if(age>18 && income>500000){
            System.out.println("Eligible for Tax");
        }
        else{
            System.out.println("Not Eligible for Tax");
        }
    }

    // 6. Both positive and sum less than 100
    static void checkPositiveAndSum(int a, int b) {
        if(a>0 && b>0 && (a+b)<100){
            System.out.println("Valid");
        }
        else{
            System.out.println("InValid");

        }
    }

    // 7. Digit to word (0-9)
    static void checkDigitWord(int n) {
        if(n==0){
            System.out.println("Zero");
        }
        else if(n==1){
            System.out.println("One");
        }
        else if(n==2){
            System.out.println("Two");
        }
        else if(n==3){
            System.out.println("Three");
        }
        else if(n==4){
            System.out.println("Four");
        }
        else if(n==5){
            System.out.println("Five");
        }
        else if(n==6){
            System.out.println("Six");
        }
        else if(n==7){
            System.out.println("Seven");
        }
        else if(n==8){
            System.out.println("Eight");
        }
        else if(n==9){
            System.out.println("Nine");
        }
    }

    // 8. Weekday or Weekend
    static void checkWeekType(int day) {
        if(day>=1 && day<=5){
            System.out.println("WeekDay");
        }
        else if(day==6 || day==7){
            System.out.println("WeekEnd");
        }
        else{
            System.out.println("Invalid day");
        }
    }

    // 9. Electricity bill by slabs
    static void calculateBill(int units) {
        double bill=0.0;
        if(units<=100){
            bill=units*1.5;
        }
        else if( units<=200){
           bill=((100 * 1.5) + ((units - 100) * 2.5));
        }
        else{
             bill = (100 * 1.5) + (100 * 2.5) + ((units - 200) * 4);
        }
        System.out.println("Bills: " + bill);
    }

    // 10. Password rules
    static void checkPassword(String password) {
        boolean flag=false;
        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if(ch>='0' && ch<='9'){
                flag=true;
                break;
            }
        }
        if(password.length()>=8 && flag==true){
            System.out.println("Valid Pasword");
        }
        else{
            System.out.println("Invalid Password");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1
        char ch = sc.next().charAt(0);
        checkCharacterType(ch);

        // 2
        int n = sc.nextInt();
        checkFizzBuzz(n);

        // 3
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        checkMedian(a, b, c);

        // 4
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        checkAMPM(hour, minute);

        // 5
        int age = sc.nextInt();
        double income = sc.nextDouble();
        checkTaxEligibility(age, income);

        // 6
        a = sc.nextInt();
        b = sc.nextInt();
        checkPositiveAndSum(a, b);

        // 7
        n = sc.nextInt();
        checkDigitWord(n);

        // 8
        int day = sc.nextInt();
        checkWeekType(day);

        // 9
        int units = sc.nextInt();
        calculateBill(units);

        // 10
        String password = sc.next();
        checkPassword(password);

        sc.close();
    }
}