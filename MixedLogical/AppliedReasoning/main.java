import java.util.Scanner;

public class main {

    // 1. Given marks of students, find how many passed (>= 40).
    static void passedStudents(int marks[]) {
        int count=0;
        for(int i=0;i<marks.length;i++){
            if(marks[i]>=40){
                count++;
            }
        }
        System.out.println(count);
        
    }

    // 2. Take age inputs and count how many are adults, minors, seniors.
    static void ageCategory(int ages[]) {
        int adult=0;
        int minor=0;
        int seniors=0;
        for(int i=0;i<ages.length;i++){
            if(ages[i]<18){
                minor++;
            }
            else if(ages[i]>=18 && ages[i]<=30){
                adult++;
            }
            else{
                seniors++;
            }
        }
        System.out.println("Minor : " + minor);
        System.out.println("Adult : " + adult);
        System.out.println("Seniors : " + seniors);
    }

    // 3. Validate a password.
    static void validatePassword(String password) {
        boolean upper=false;
        boolean lower=false;
        boolean digit=false;
        boolean special=false;
        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if(Character.isUpperCase(ch)){
                upper=true;
            }
            else if(Character.isLowerCase(ch)){
                lower=true;
            }
            else if(Character.isDigit(ch)){
                digit=true;
            }
            else{
                special=true;
            }
        }
        if(upper && lower && digit && special){
            System.out.println("Valid Password");
        }
        else{
            System.out.println("Not valid password");
        }
    }

    // 4. Simulate a simple calculator using switch-case.
    static void calculator(int a, int b, char op) {
        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            
            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                System.out.println(a / b);
                break;

            case '%':
                System.out.println(a % b);
                break;
        
            default:
                System.out.println("Invalid Operator");;
        }
    }

    // 5. Count how many times a coin lands on heads/tails.
    static void coinCount(int n) {

    }

    // 6. Print frequency of each digit in a number.
    static void digitFrequency(int n) {
        int freq[]= new int[10];
        while(n>0){
            int digit=n%10;
            freq[digit]++;
            n/=10;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.println(i + " -> " + freq[i]);
            }
        }
    }

    // 7. Find common elements between two arrays.
    static void commonElements(int arr1[], int arr2[]) {
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]+ " ");
                    break;
                }
            }
        }
    }

    // 8. Print characters that are common in two strings.
    static void commonCharacters(String s1, String s2) {
        for(int i=0;i<s1.length();i++){
            char ch1=s1.charAt(i);
            for(int j=0;j<s2.length();j++){
                char ch2=s2.charAt(i);
                if(ch1 == ch2){
                    System.out.println(ch1);
                    break;
                }
            }
        }
    }

    // 9. Count how many prime numbers are there in an array.
    static void countPrime(int arr[]) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            if(num<=1){
                continue;
            }
            boolean prime=true;
            for(int j=2;j<num;j++){
                if(num%j==0){
                    prime=false;
                    break;
                }
            }
            if(prime){
                count++;
            }
        }
        System.out.println(count);
    }

    // 10. Print all palindromic words from a sentence.
    static void palindromeWords(String str) {
        String arr[]=str.trim().split(" ");
        for(int i=0;i<arr.length;i++){
            String word=arr[i];
            String rev="";
            for(int j=word.length()-1;j>=0;j--){
                rev+=word.charAt(j);
            }
            if(word.equals(rev)){
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int marks[] = {45, 20, 78, 39, 90};

        int ages[] = {12, 18, 25, 65, 70};

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {3, 4, 5, 6, 7};

        int nums[] = {2, 4, 5, 7, 8, 11};

        String password = "Abc@123";

        String s1 = "hello";
        String s2 = "world";

        String str = "madam level hello racecar";

        passedStudents(marks);

        ageCategory(ages);

        validatePassword(password);w

        calculator(10, 5, '+');

        coinCount(10);

        digitFrequency(122333);

        commonElements(arr1, arr2);

        commonCharacters(s1, s2);

        countPrime(nums);

        palindromeWords(str);

        sc.close();
    }
}