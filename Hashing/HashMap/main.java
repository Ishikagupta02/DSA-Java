import java.util.HashMap;
import java.util.Map;

public class main {

    // 1. Print frequency of every character
    static void printCharacterFrequency(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }

        for( Map.Entry<Character, Integer> m  : map.entrySet()){
            System.out.println(m.getKey() + " --> " + m.getValue());
        }
    }

    // 2. Print frequency of a given character
    static void printGivenCharacterFrequency(String str, char target) {
        HashMap<Character, Integer> map= new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }
        System.out.println(map.getOrDefault(target, 0));
    }

    // 3. Count distinct characters
    static void countDistinctCharacters(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }
        System.out.println(map.size());
    }

    // 4. Print duplicate characters
    static void printDuplicateCharacters(String str) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }
        for(Map.Entry<Character,Integer> m : map.entrySet()){
            if(m.getValue()>1){
                System.out.println(m.getKey() + " --> " + m.getValue()) ;
            }
        }
    }

    // 5. Print unique characters
    static void printUniqueCharacters(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }

        for(Map.Entry<Character,Integer> m :  map.entrySet()){
            if(m.getValue()==1){
                System.out.println(m.getKey() + "-->" + m.getValue());
            }
        }

    }

    // 6. Character having maximum frequency
    static void maximumFrequencyCharacter(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }
        int max=0;
        char ch=' ';
        
        for(Map.Entry<Character,Integer> m : map.entrySet()){
            if(m.getValue()>max){
                max=m.getValue();
                ch=m.getKey();
            }
        }
        System.out.println(ch + "-->" + max);
    }

    // 7. Character having minimum frequency
    static void minimumFrequencyCharacter(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }
        int min= Integer.MAX_VALUE;
        char ch= ' ';
        for(Map.Entry<Character,Integer> m : map.entrySet()){
            if(m.getValue()<min){
                min=m.getValue();
                ch=m.getKey();
            }
        }
        System.out.println(ch + "-->" + min);
    }

    // 8. First non-repeating character
    static void firstNonRepeatingCharacter(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(map.get(ch) ==1){
                System.out.println(ch);
                return;
            }
        }
    }

    // 9. First repeating character
    static void firstRepeatingCharacter(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(map.get(ch)>1){
                System.out.println(ch);
                return;
            }
        }
    }

    // 10. Check whether two strings are anagrams
    static void checkAnagram(String str1, String str2) {
        if(str1.length() != str2.length()){
            System.out.println(false);
            return;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str1.length();i++){
            char ch1= str1.charAt(i);
            map.put(ch1, map.getOrDefault(ch1,0)+ 1);
        }
        for(int i=0;i<str2.length();i++){
            char ch2= str2.charAt(i);
            map.put(ch2, map.getOrDefault(ch2,0)-1);
        }

       for(Map.Entry<Character,Integer> m : map.entrySet()){ 
        if(m.getValue()!=0){
            System.out.println(false);
            return;
        }
        }
        System.out.println(true);
    }

    // 11. Check if ransom note can be constructed
    static void ransomNote(String ransomNote, String magazine) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            map.put(ch,map.getOrDefault(ch,0) - 1);
        }
        for(Map.Entry<Character,Integer> m : map.entrySet()){
            if(m.getValue()<0){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }

    // 12. Find the extra character
    static void findTheDifference(String s, String t) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0) - 1);
        }
        for(Map.Entry<Character,Integer> m : map.entrySet()){
            if(m.getValue()>0){
                System.out.println(m.getKey());
            }
        }
    }

    // 13. Jewels and Stones
    static void jewelsAndStones(String jewels, String stones) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<stones.length();i++){
            char ch=stones.charAt(i);
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }
        int count=0;
            for(int i=0;i<jewels.length();i++){
                char ch=jewels.charAt(i);
                count+=map.getOrDefault(ch,0);
            }
        System.out.println(count);
    }

    // 14. Check Pangram
    static void checkPangram(String sentence) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }
        if(map.size()==26){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        } 
    }

    // 15. Word Frequency
    static void printWordFrequency(String sentence) {
        HashMap<String,Integer> map= new HashMap<>();
         String words[]=sentence.split(" ");
        for(int i=0;i<words.length;i++){
            String w=words[i];
            map.put(w,map.getOrDefault(w, 0)+1);
        }
        for(Map.Entry<String,Integer> m : map.entrySet()){
            System.out.println(m.getKey() + "-->" + m.getValue());
        }
    }

    public static void main(String[] args) {

        // 1
        printCharacterFrequency("banana");

        // 2
        printGivenCharacterFrequency("banana", 'a');

        // 3
        countDistinctCharacters("bananas");

        // 4
        printDuplicateCharacters("programming");

        // 5
        printUniqueCharacters("programming");

        // 6
        maximumFrequencyCharacter("bananaaa");

        // 7
        minimumFrequencyCharacter("banana");

        // 8
        firstNonRepeatingCharacter("programming");

        // 9
        firstRepeatingCharacter("programming");

        // 10
        checkAnagram("listen", "silent");

        // 11
        ransomNote("aa", "aab");

        // 12
        findTheDifference("abcd", "abcde");

        // 13
        //leetcode ka 771 hai yeh
        jewelsAndStones("aA", "aaAAbbbb");

        // 14
        checkPangram("thequickbrownfoxjumpsoverthelazydog");

        // 15
        printWordFrequency("java is easy java is powerful");
    }
}