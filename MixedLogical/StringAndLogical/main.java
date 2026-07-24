import java.util.Scanner;

public class main {

    // 1. Check if two strings are anagrams (without using collections).
    static void anagram(String s1, String s2) {
        if(s1.length()!=s2.length()){
            System.out.println("Not anagram");
        }
        char arr[]=s2.toCharArray();
        for(int i=0;i<s1.length();i++){
            char c1=s1.charAt(i);
            boolean flag=false;
            for(int j=0;j<arr.length;j++){
                if(c1==arr[j]){
                    arr[j]='*';
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                System.out.println("anagram");
            }
            else{
                System.out.println("not anagram");
            }
        }
    }

    // 2. Count vowels in each word of a sentence.
    static void countVowelsEachWord(String str) {
        String arr[]=str.trim().split(" ");
        for(int i=0;i<arr.length;i++){
            int count=0;
            String word=arr[i].toLowerCase();
            for(int j=0;j<word.length();j++){
                char ch=word.charAt(j);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    count++;
                }
            }
            System.out.println(arr[i]+ " -> " + count);
        }
    }

    // 3. Reverse words in a string if their length is even.
    static void reverseEvenWords(String str) {
        String arr[]=str.trim().split(" ");
        String rev=" ";
        for(int i=0;i<arr.length;i++){
            String word=arr[i];
            if(word.length()%2==0){
                for(int j=word.length()-1;j>=0;j--){
                    System.out.print(word.charAt(j));
                }
            }
            else{
                System.out.println(word);
            }
            System.out.println(" ");
        }     
    }

    // 4. Replace every vowel in a string with its position (a=1, e=2 ... ).
    static void replaceVowelPosition(String str) {
        for(int i=0;i<str.length();i++){
            char ch=str.toLowerCase().charAt(i);
            if(ch=='a'){
                System.out.println("1");
            }
            else if(ch=='e'){
                System.out.println("2");
            }
            else if(ch=='i'){
                System.out.println("3");
            }
            else if(ch=='o'){
                System.out.println("4");
            }
            else if(ch=='u'){
                System.out.println("5");
            }
            else{
                System.out.println(str.charAt(i));
            }
        }
    }

    // 5. Print characters that appear more than once (without map).
    static void duplicateCharacters(String str) {
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int count=0;
            for(int j=0;j<str.length();j++){
                if(ch==str.charAt(j)){
                    count++;
                }
            }
            if(count>1 && str.indexOf(ch)==i){
                System.out.println(ch);
            }
        }
    }

    // 6. Count words that start and end with the same letter.
    static void countSameStartEnd(String str) {
        String arr[]=str.trim().split(" ");
        int count=0;
        for(int i=0;i<arr.length;i++){
            String word=arr[i].toLowerCase();
            if(word.charAt(0)==word.charAt(word.length()-1)){
                count++;
            }
        }
        System.out.println(count);
    }

    // 7. Toggle case for every alternate word in a sentence.
    static void toggleAlternateWords(String str) {
        String arr[]=str.trim().split(" ");
        for(int i=0;i<arr.length;i++){
            String word=arr[i];
            if(i%2==1){
                for(int j=0;j<word.length();j++){
                    char ch=word.charAt(j);
                    if(Character.isUpperCase(ch)){
                        System.out.print(Character.toLowerCase(ch));
                    }
                    else if(Character.isLowerCase(ch)){
                        System.out.print(Character.toUpperCase(ch));
                    }
                    else{
                        System.out.println(ch);
                    }
                }
                System.out.println(" ");
            }
            else{
                System.out.println(word);
            }
        }
    }

    // 8. Check if two strings are rotations of each other.
    static void checkRotation(String s1, String s2) {
        if(s1.length()!=s2.length()){
            System.out.println("Not rotational");
            return;
        }
        String temp=s1+s1;
        if(temp.contains(s2)){
            System.out.println("rotational");
        }
        else{
            System.out.println("Not rotational");
        }
    }

    // 9. Find the word with maximum vowels in a sentence.
    static void maxVowelWord(String str) {
        String arr[]=str.trim().split(" ");
        int max=0;
        String ans=" ";
        for(int i=0;i<arr.length;i++){
            String word=arr[i].toLowerCase();
            int count=0;
            for(int j=0;j<word.length();j++){
                char ch=word.charAt(j);
                if(ch=='a' || ch=='e' ||  ch=='i' || ch=='o' || ch=='u'){
                    count++;
                }
            }
            if(count>max){
                max=count;
                ans=word;
            }
        }
        System.out.println(ans);
    }

    // 10. Remove duplicate words from a sentence.
    static void removeDuplicateWords(String str) {
        String arr[]=str.trim().split(" ");
        String ans=" ";
        for(int i=0;i<arr.length;i++){
            String word=arr[i];
            if(!ans.contains(word)){
                ans+=word+" ";
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        anagram(s1, s2);

        countVowelsEachWord(str);

        reverseEvenWords(str);

        replaceVowelPosition(str);

        duplicateCharacters(str);

        countSameStartEnd(str);

        toggleAlternateWords(str);

        checkRotation(s1, s2);

        maxVowelWord(str);

        removeDuplicateWords(str);

        sc.close();
    }
}