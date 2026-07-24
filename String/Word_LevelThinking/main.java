import java.util.Scanner;

public class main {

    // 1. Print each word of a sentence on a new line.
    static void printWordsNewLine(String str) {
        String arr[]= str.trim().split(" ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    // 2. Count how many words have even length.
    static void evenLengthWords(String str) {
        String arr[]= str.trim().split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()%2==0){
                System.out.println(arr[i]);
            }
        }
    }

    // 3. Find the longest word in a sentence.
    static void longestWord(String str) {
        String arr[]= str.trim().split(" ");
        String newStr=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>newStr.length()){
                newStr=arr[i];
            }
        }
        System.out.println(newStr);
    }

    // 4. Find the shortest word in a sentence.
    static void shortestWord(String str) {
        String arr[]=str.trim().split(" ");
        String newStr=arr[0];

        for(int i=0;i<arr.length;i++){
            if(newStr.length()<arr[i].length()){
                newStr=arr[i];
            }
        }
        System.out.println(newStr);
    }

    // 5. Swap first and last words in a sentence.
    static void swapFirstLastWord(String str) {
        String arr[]=str.trim().split(" ");
        String temp=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

    // 6. Print all words that start and end with the same letter.
    static void sameStartEndWord(String str) {
        String arr[]=str.trim().split(" ");
        for(int i=0;i<arr.length;i++){
            String word=arr[i].toLowerCase();

            if(word.charAt(0)==word.charAt(word.length()-1)){
                System.out.println(arr[i]);
            }
        }
    }

    // 7. Count how many words contain the letter 'a'.
    static void containLetterA(String str) {
        int count=0;
        String arr[]=str.trim().split(" ");
        for(int i=0;i<arr.length;i++){
            String word=arr[i].toLowerCase();

            if(word.contains("a")){
                count++;
            }
        }
        System.out.println(count);
    }

    // 8. Capitalize the first letter of each word.
    static void capitalizeFirstLetter(String str) {
        String arr[]=str.trim().split(" ");
        for(int i=0;i<arr.length;i++){
            String word=arr[i];
            char ch=Character.toUpperCase(word.charAt(0));
            String rest=word.substring(1);

            System.out.println(ch+rest+" ");
        }
            
    }

    // 9. Print the sentence in title case (first letter capital, rest lowercase).
    static void titleCase(String str) {
        String arr[]=str.trim().split(" ");
        for(int i=0;i<arr.length;i++){
            String word=arr[i].toLowerCase();

            char first=Character.toUpperCase(word.charAt(0));
            String rest=word.substring(1);

            System.out.println(first+rest+ " ");
        }    
    }

    // 10. Remove extra spaces between words (normalize spacing).
    static void normalizeSpaces(String str) {

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        printWordsNewLine(str);

        evenLengthWords(str);

        longestWord(str);

        shortestWord(str);

        swapFirstLastWord(str);

        sameStartEndWord(str);

        containLetterA(str);

        capitalizeFirstLetter(str);

        titleCase(str);

        normalizeSpaces(str);

        sc.close();
    }
}