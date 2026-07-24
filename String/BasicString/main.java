import java.util.Scanner;

public class main {

    // 1. Take a string input and print its length.
    static void stringLength(String str) {
        System.out.println("Length of String: " + str.length());
    }

    // 2. Print the first and last character of a string.
    static void firstLastChar(String str) {
        if(str.length()==0){
            return;
        }
        System.out.println("First character : " + str.charAt(0));
        System.out.println("Last character : " + str.charAt(str.length()-1));
    }

    // 3. Convert all characters of a string to uppercase.
    static void toUpperCase(String str) {
        String uppercase=str.toUpperCase();
        System.out.println("In a UpperCase: " + uppercase);
    }

    // 4. Convert all characters of a string to lowercase.
    static void toLowerCase(String str) {
        String lowercase=str.toLowerCase();
        System.out.println("In a LowerCase: " + lowercase);
    }

    // 5. Count how many characters (excluding spaces) are in the string.
    static void countCharacters(String str) {
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println("Count of characters in a letter : " + count);
    }

    // 6. Count how many words are in a sentence.
    static void countWords(String str) {
        str=str.trim();
        if(str.length()==0){
            System.out.println("0");
            return;
        }
        String arr[]=str.split("\\s+");
        System.out.println(arr.length);
    }

    // 7. Take two strings and print them concatenated.
    static void concatenate(String str1, String str2) {
        System.out.println(str1+ " " +str2);
    }

    // 8. Compare two strings lexicographically (like dictionary order).
    static void compareStrings(String str1, String str2) {
        System.out.println(str1.compareTo(str2));
    }

    // 9. Print the ASCII value of each character in a string.
    static void asciiValues(String str) {
        for(int i=0;i<str.length();i++){
            System.out.println((int) str.charAt(i));
        }
    }

    // 10. Check whether the string is empty or not.
    static void isEmptyString(String str) {
        System.out.println(str.isEmpty());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        stringLength(str);

        firstLastChar(str);

        toUpperCase(str);

        toLowerCase(str);

        countCharacters(str);

        countWords(str);

        concatenate(str1, str2);

        compareStrings(str1, str2);

        asciiValues(str);

        isEmptyString(str);

        sc.close();
    }
}