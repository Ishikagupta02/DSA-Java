import java.util.Scanner;

public class main {

    // 1. Remove all vowels from a string.
    static void removeVowels(String str) {
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!='a' && ch!='e' && ch!='o' && ch!='i' && ch!='u'){
                System.out.print(ch);
            }
        }    
    }

    // 2. Remove all spaces from a string.
    static void removeSpaces(String str) {
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                System.out.print(ch);
            }
        }
    }

    // 3. Replace all vowels with '*'.
    static void replaceVowels(String str) {
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='o' || ch=='i' || ch=='u'){
                System.out.print("*");
            }
            else{
                System.out.print(ch);
            }
        }
    }

    // 4. Replace all spaces with '_'.
    static void replaceSpaces(String str) {
        str=str.replace(' ','_');
        System.out.println(str);

    }

    // 5. Print the string after removing all digits.
    static void removeDigits(String str) {
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!Character.isDigit(ch)){
                System.out.print(ch);
            }
        }
    }

    // 6. Remove duplicate characters from a string.
    static void removeDuplicate(String str) {
        String newStr="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(newStr.indexOf(ch)==-1){
                newStr+=ch;
            }
        }
        System.out.println(newStr);
    }

    // 7. Keep only the first occurrence of each character.
    static void firstOccurrenceOnly(String str) {
        String newStr="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(newStr.indexOf(ch)==-1){
                newStr+=ch;
            }
        }
        System.out.println(newStr);
    }

    // 8. Remove consecutive duplicate characters (e.g., "aaabb" -> "ab").
    static void removeConsecutiveDuplicate(String str) {
         if(str.length() == 0) {
            System.out.println("");
            return;
        }
        System.out.print(str.charAt(0));
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) != str.charAt(i - 1)) {
                System.out.print(str.charAt(i));
            }
        }

        System.out.println();
    }

    // 9. Swap case: uppercase to lowercase and lowercase to uppercase.
    static void swapCase(String str) {
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch)){
                System.out.print(Character.toLowerCase(ch));
            }
            else if(Character.isLowerCase(ch)){
                System.out.print(Character.toUpperCase(ch));
            }
            else{
                System.out.print(ch);
            }
        }
        System.out.println();
    }

    // 10. Shift each character by 1 (e.g., "abc" -> "bcd").
    static void shiftByOne(String str) {
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            ch++;

            System.out.print(ch);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        removeVowels(str);

        removeSpaces(str);

        replaceVowels(str);

        replaceSpaces(str);

        removeDigits(str);

        removeDuplicate(str);

        firstOccurrenceOnly(str);

        removeConsecutiveDuplicate(str);

        swapCase(str);

        shiftByOne(str);

        sc.close();
    }
}