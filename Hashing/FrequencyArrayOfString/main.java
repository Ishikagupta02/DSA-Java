import java.util.Scanner;

public class main {

    // 1. Count frequency of every character
    static void characterFrequency(String str) {

        // frequency array size of 26
        int freq[]=new int[26];

        //fille frequency array

        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }

        //print frequency
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                System.out.println((char)(i+ 'a') + "->" + freq[i]);
            }
        }
    }

    // 2. Find frequency of given character
    static void frequencyOfCharacter(String str, char ch) {
        int freq[]= new int[26];

        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        System.out.println(freq[ch-'a']);
    }

    // 3. Count distinct characters
    static void countDistinctCharacters(String str) {
        int freq[]= new int[26];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                count++;
            }
        }
        System.out.println(count);
    }

    // 4. Print duplicate characters
    static void duplicateCharacters(String str) {
        int freq[]= new int[26];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>1){
                System.out.println((char)(i+'a') + "->" + freq[i]);
            }
        }
    }

    // 5. Print unique characters
    static void uniqueCharacters(String str) {
        int freq[]= new int[26];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]==1){
                System.out.println((char)(i+'a') + "->" + freq[i]);
            }
        }
    }

    // 6. Character having maximum frequency
    static void maximumFrequencyCharacter(String str) {
        int freq[]= new int[26];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        int maxfreq=0;
        char ch=' ';
        for(int i=0;i<26;i++){
            if(freq[i]>maxfreq){
                maxfreq=freq[i];
                ch=(char)(i+'a');
            }
        }
        System.out.println(ch);
    }

    // 7. Character having minimum frequency
    static void minimumFrequencyCharacter(String str) {
        int freq[]= new int[26];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        int minfreq=Integer.MAX_VALUE;
        char ch=' ';
        for(int i=0;i<26;i++){
            if(freq[i]<minfreq && freq[i]>0){
                minfreq=freq[i];
                ch=(char)(i+'a');
            }
        }
        System.out.println(ch);
    }

    // 8. Check duplicate character exists
    static void containsDuplicateCharacter(String str) {
         int freq[]= new int[26];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>1){
                System.out.println((char)(i+'a') + "->" + freq[i]);
            }
        }
    }

    // 9. First non-repeating character
    static void firstNonRepeatingCharacter(String str) {
        int freq[]= new int[26];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)-'a']==1){
                System.out.println(str.charAt(i));
                return;
            }
        }
    }

    // 10. First repeating character
    static void firstRepeatingCharacter(String str) {
        int freq[]= new int[26];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)-'a']>1){
                System.out.println(str.charAt(i));
                return;
            }
        }
    }

    // 11. Check Anagram
    static void checkAnagram(String s1, String s2) {

        // if(s1.length()!=s2.length()){
        //     System.out.println(false);
        //     return;
        // }
        // int freq1[]= new int[26];
        // int freq2[]= new int[26];

        // for(int i=0;i<s1.length();i++){
        //     freq1[s1.charAt(i)-'a']++;
        // }
        // for(int i=0;i<s2.length();i++){
        //     freq2[s2.charAt(i)-'a']++;
        // }

        // for(int i=0;i<26;i++){
        //     if(freq1[i]!=freq2[i]){
        //         System.out.println(false);
        //         return;
        //     }
        // }
        // System.out.println(true);

    // another approach with least space complexity

        if(s1.length()!=s2.length()){
            System.out.println(false);
            return;
        }
        int freq[]= new int[26];
    // Increment of first string
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }

    // decrement of second string
        for(int i=0;i<s2.length();i++){
            freq[s2.charAt(i)-'a']--;
        }

        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1
        characterFrequency("aabbcabbcd");

        // 2
        frequencyOfCharacter("aabbcabb",'b');

        // 3
        countDistinctCharacters("aabbcabd");

        // 4
        duplicateCharacters("programming");

        // 5
        uniqueCharacters("programming");

        // 6
        maximumFrequencyCharacter("programmming");

        // 7
        minimumFrequencyCharacter("programming");

        // 8
        containsDuplicateCharacter("programming");

        // 9
        firstNonRepeatingCharacter("aabccdbe");

        // 10
        firstRepeatingCharacter("abca");

        // 11
        checkAnagram("listen","silent");

        sc.close();
    }
}