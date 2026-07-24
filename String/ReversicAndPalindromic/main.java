import java.util.Scanner;

public class main {

    // 1. Reverse a string without using built-in reverse.
    static void reverseString(String str) {
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }

    // 2. Reverse each word in a sentence.
    static void reverseEachWord(String str) {
        String arr[] = str.split(" ");
        for(int i = 0; i < arr.length; i++) {
            for(int j = arr[i].length() - 1; j >= 0; j--) {
             System.out.print(arr[i].charAt(j));
        }
        System.out.print(" ");
        }
    }

    // 3. Reverse the order of words in a sentence.
    static void reverseWordOrder(String str) {

    }

    // 4. Check whether a string is a palindrome.
    static void palindromeString(String str) {
        String originalString=str;
        String newStr="";
        for(int i=str.length()-1; i>=0;i--){
            char ch=str.charAt(i);
            newStr+=ch;
        }
        if(originalString.equals(newStr)){
            System.out.println("Yes, It is pallindrome");
        }
        else{
            System.out.println("No, it is not palindrome");
        }
    }

    // 5. Check if two strings are the reverse of each other.
    static void reverseOfEachOther(String str1, String str2) {
        String rev="";
        for(int i=str1.length()-1;i>=0;i--){
            rev+=str1.charAt(i);
        }
        if(rev.equals(str2)){
            System.out.println("both are reverse of each other");
        }
        else{
            System.out.println("both are not reverse of each other");
        }
    }

    // 6. Print the middle character(s) of a string.
    static void middleCharacters(String str) {
        int n=str.length();
        if(n%2==0){
            // i want iin character form so i ADD empty string so it cconsider is as string not ascii value
            System.out.println(""+str.charAt(n/2-1) + str.charAt(n/2));
        }
        else{
            System.out.println(str.charAt(n/2));
        }
    }

    // 7. Print the second half of the string in reverse.
    static void secondHalfReverse(String str) {
        int n=str.length();
        int start=0;
        if(n%2==0){
            start=n/2;
        }
        else{
            start=n/2+1;
        }
        for(int i=n-1;i>=start;i--){
            System.out.print(str.charAt(i));
        }
    }

    // 8. Remove the first and last character and print the remaining string.
    static void removeFirstLast(String str) {
        if(str.length()<2){
            System.out.println("");
            return;
        }
        for(int i=1;i<str.length()-1;i++){
            System.out.print(str.charAt(i));
        }

    }

    // 9. Reverse only characters, keeping digits in place.
    static void reverseKeepDigits(String str) {
        char arr[]=str.toCharArray();
        int left=0;
        int right=arr.length-1;

        while(left<right){
            if(Character.isDigit(arr[left])){
                left++;
            }
            else if(Character.isDigit(arr[right])){
                right--;
            }
            else{
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;

                left++;
                right--;
            }
        }
        System.out.println(arr);
    }

    // 10. Reverse string but skip spaces.
    static void reverseSkipSpaces(String str) {
        char arr[]=str.toCharArray();
        int left=0;
        int right=str.length()-1;

        while(left<right){
            if(arr[left]== ' '){
                left++;
            }
            else if(arr[right]== ' '){
                right--;
            }
            else{
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;

                left++;
                right--;
            }
        }
        System.out.println(arr);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        reverseString(str);

        reverseEachWord(str);

        reverseWordOrder(str);

        palindromeString(str);

        reverseOfEachOther(str1, str2);

        middleCharacters(str);

        secondHalfReverse(str);

        removeFirstLast(str);

        reverseKeepDigits(str);

        reverseSkipSpaces(str);

        sc.close();
    }
}