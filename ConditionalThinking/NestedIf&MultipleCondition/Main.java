import java.util.Scanner;

public class Main {

    // 1. Check valid triangle
    static void checkValidTriangle(int a, int b, int c) {
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("Valid Triangle");
        }
        else{
            System.out.println("Invalid Triangle");
        }
    }

    // 2. Triangle type
    static void checkTriangleType(int a, int b, int c) {
        if(a+b>c && a+c>b && b+c>a){
            if(a==b && b==c){
                System.out.println("Equilateral Triangle");
            }
            else if(a==b || b==c || c==a){
                System.out.println("Isosceles Triangle");
            }
            else{
                System.out.println("Scalene Triangle");
            }   
        }
        else{
            System.out.println("Not a Valid Triangle");
        }  
    }

    // 3. Grade based on marks
    static void checkGrade(int marks) {
        if(marks>90){
            System.out.println("A");
        }
        else if(marks<90 && marks>75){
            System.out.println("B");
        }
        else if(marks<75 && marks>60){
            System.out.println("C");
        }
        else if(marks<60 && marks>35){
            System.out.println("D");
        }
        else{
            System.out.println("E");
        }
    }

    // 4. One number multiple of other
    static void checkMultiple(int a, int b) {
        if(a%b==0 || b%a==0){
            System.out.println("Ione number is multiple of other number");
        }
        else{
            System.out.println("not diviible by other");
        }
    }

    // 5. Greeting by hour
    static void checkGreeting(int hour) {
        if(hour>=7 && hour<=12){
            System.out.println("Good Morning");
        }
        else if(hour>=12 && hour<=3){
            System.out.println("Good Afternoon");
        }
        else if(hour>3 && hour<=6){
            System.out.println("Good Evening");
        }
        else{
            System.out.println("Good night");
        }
    }

    // 6. Voting eligibility
    static void checkVotingEligibility(int age) {
        if(age>+18){
            System.out.println("Elegible for voting");
        }
        else{
            System.out.println(" Not Elegible for voting");

        }
    }

    // 7. Even / Odd relation between two numbers
    static void checkEvenOddPair(int a, int b) {
        if(a%2==0 && b%2==0){
            System.out.println("Both are even number");
        }
        else if(a%2==1 && b%2==1){
            System.out.println("Both are odd number");
        }
        else{
            System.out.println("One even or one odd");
        }
    }

    // 8. Character between a-m or n-z
    static void checkAlphabetRange(char ch) {
        ch=Character.toLowerCase(ch);
        if(ch>='a' && ch<='m'){
            System.out.println("Between a and m");
        }
        else if(ch>='n' && ch<='z'){
            System.out.println("Between n and z");
        }
    }

    // 9. Day name
    static void checkDay(int day) {
        if(day==1){
            System.out.println("Monday");
        }
        else if(day==2){
            System.out.println("Tuesday");
        }
        else if(day==2){
            System.out.println("Tuesday");
        }
        else if(day==3){
            System.out.println("Wednesday");
        }
        else if(day==4){
            System.out.println("Thursday");
        }
        else if(day==5){
            System.out.println("Friday");
        }
        else if(day==6){
            System.out.println("Saturday");
        }
        else{
            System.out.println("Sunday");
        }
    }

    // 10. Days in month
    static void checkMonthDays(int month) {
        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
            System.out.println("31 Days");
        }
        else if(month==4 || month==6 || month==9 || month==11){
            System.out.println("30 Days");
        }
        else{
            System.out.println("28 days");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        checkValidTriangle(a, b, c);

        // 2
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        checkTriangleType(a, b, c);

        // 3
        int marks = sc.nextInt();
        checkGrade(marks);

        // 4
        a = sc.nextInt();
        b = sc.nextInt();
        checkMultiple(a, b);

        // 5
        int hour = sc.nextInt();
        checkGreeting(hour);

        // 6
        int age = sc.nextInt();
        checkVotingEligibility(age);

        // 7
        a = sc.nextInt();
        b = sc.nextInt();
        checkEvenOddPair(a, b);

        // 8
        char ch = sc.next().charAt(0);
        checkAlphabetRange(ch);

        // 9
        int day = sc.nextInt();
        checkDay(day);

        // 10
        int month = sc.nextInt();
        checkMonthDays(month);

        sc.close();
    }
}