import java.util.Scanner;

public class Main {

    // 1. Positive / Negative / Zero
    static void checkNumberType(int n) {
        if(n<0){
            System.out.println("Negative");
        }
        else if(n>0){
            System.out.println("Positive");
        }
        else{
           System.out.println("Zero");
        }
    }

    // 2. Even / Odd
    static void checkEvenOdd(int n) {
        if(n%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }

    // 3. Divisible by 5
    static void checkDivisibleBy5(int n) {
        if(n%5==0){
            System.out.println("Divisible by 5");
        }
        else{
            System.out.println("Not divisible by 5");
        }
    }

    // 4. Divisible by both 3 and 5
    static void checkDivisibleBy3And5(int n) {
        if(n%5==0 && n%2==1){
            System.out.println("Divisible by 3 & 5");
        }
        else{
             System.out.println("Not divisible by 3 & 5");
        }
    }


    // 5. Leap Year
    static void checkLeapYear(int year) {
        if((year % 400==0) || (year % 4==0 && year % 100 !=0)){
            System.out.println( year + " is a leap year");
        }
        else{
            System.out.println( year + " is not a leap year");
        }
    }

    // 6. Larger of two numbers
    static void checkLarger(int a, int b) {
        if(a>b){
            System.out.println(a+ " is a larger number");
        }
        else if (b>a){
            System.out.println(b+ " is a larger number");
        }
        else{
            System.out.println("Both are equal");
        }
    }

    // 7. Largest of three numbers
    static void checkLargest(int a, int b, int c) {
        if(a>=b && a>=c){
            System.out.println(a+ " is a larger number");
        }
        else if (b>=a && b>=c){
            System.out.println(b+ " is a larger number");
        }
        else{
            System.out.println(c+ " is a larger number");
        }
    }

    // 8. Temperature check
    static void checkTemperature(int temp) {
        if(temp<=10){
            System.out.println("Cold");
        }
        else if(temp>=11 && temp<=20){
            System.out.println("Warm");
        }
        else{
            System.out.println("Hot");
        }
    }

    // 9. Vowel / Consonant
    static void checkVowelConsonant(char Ch) {
        Ch=Character.toLowerCase(Ch);
        if(Ch=='a' || Ch=='e' || Ch=='i' || Ch=='o' || Ch=='u'){
            System.err.println(Ch + " is a vowel");
        }
        else{
            System.out.println(Ch + " is a consonant");
        }

    }

    // 10. Uppercase / Lowercase / Digit / Special Character
    static void checkCharacterType(char Ch) {
        if(Ch<='Z' && Ch>='A'){
            System.out.println(Ch + " is a upperCase Letter");
        }
        else if(Ch<='z' && Ch>='a'){
            System.out.println(Ch + " is a lowerCase Letter");
        }
        else if(Ch<='9' && Ch>='0'){
            System.out.println(Ch + " is a digit");
        }
        else{
            System.out.println(Ch + " is a special character");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // baar baar input yahin logi

        int n = sc.nextInt();
        checkNumberType(n);

        checkEvenOdd(n);

        checkDivisibleBy5(n);

        checkDivisibleBy3And5(n);

        int year = sc.nextInt();
        checkLeapYear(year);

        int a = sc.nextInt();
        int b = sc.nextInt();
        checkLarger(a, b);

        a = sc.nextInt();
        b = sc.nextInt();
        int c = sc.nextInt();
        checkLargest(a, b, c);

        int temp = sc.nextInt();
        checkTemperature(temp);

        char Ch = sc.next().charAt(0);
        checkVowelConsonant(Ch);

        Ch = sc.next().charAt(0);
        checkCharacterType(Ch);

        sc.close();
    }
}