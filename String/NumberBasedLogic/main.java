import java.util.Scanner;

public class main {

    // Count how many spaces are there in a sentence.
    static void countSpaces(String str) {
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)== ' '){
                count++;
            }
        }
        System.out.println("Count of spaces: " + count);
    }

    // 1. Count how many vowels and consonants are in a string.
    static void vowelsConsonants(String str) {
        String s= str.toLowerCase();
        int vowels=0;
        int consonants=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch == 'a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u'){
            vowels++;
        }
        else{
            consonants++;
        }
        }
        System.out.println("Vowels are: " + vowels);
        System.out.println("Consonants are: " + consonants);
    }

    // 2. Count the number of digits, letters, and special characters in a string.
    static void countTypes(String str) {
        int digitcount=0;
        int letterscount=0;
        int specialcharactercount=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                digitcount++;
            }
            else if(Character.isLetter(ch)){
                letterscount++;
            }
            else if(ch != ' '){
                specialcharactercount++;
            } 
        }
        System.out.println("Digits are : " + digitcount + " , " + "Letters are : " + letterscount + " , " + "Special Characters are : " + specialcharactercount);
    }

    // 3. Count how many uppercase and lowercase letters a string has.
    static void upperLowerCount(String str) {
        int UpperCaseCount=0;
        int LowerCaseCount=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLowerCase(ch)){
                LowerCaseCount++;
            }
            else if (Character.isUpperCase(ch)){
                UpperCaseCount++;
            }
        }
        System.out.println("Uppercase letters count: " + UpperCaseCount + " " + "Lowercase letters count: " + LowerCaseCount);
    }

    // 4. Find the frequency of each character in a string (without using a map).
    static void frequencyCharacters(String str) {
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int count=0;
            for(int j=0;j<str.length();j++){
                if(ch==str.charAt(j)){
                    count++;
                }
            }
            System.out.println(ch + " : " + count);
        }
    }

    // 5. Count how many times a given character appears in a string.
    static void countGivenCharacter(String str, char ch) {
        int count=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c==ch){
                count++;
            }
        }
        System.out.println("Count of that character: " + count);
    }

    // 6. Count how many alphabets are before 'm' and after 'm' in a given string.
    static void beforeAfterM(String str) {
        int before=0;
        int after=0;
        String s=str.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch<'m'){
                    before++;
                }
                else if(ch>'m'){
                    after++;
                }
            }
        }
        System.out.println("char before m: " + before + " , " + "char after m: " + after);
    }

    // 7. Count how many substrings start and end with the same character.
    static void sameStartEndSubstring(String str) {
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    // 8. Print how many words start with a vowel in a sentence.
    static void wordsStartVowel(String str) {
        int count=0;
        String arr[]=str.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>0){
                char ch= Character.toLowerCase(arr[i].charAt(0));
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    count++;
                }
            } 
        }
        System.out.println("Word start with a vowel: " + count);
    }

    // 9. Count how many words end with 's'.
    static void wordsEndS(String str) {
        int count=0;
        String arr[]=str.split(" ");
        str=str.toLowerCase();
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>0){
                char ch=arr[i].charAt(arr[i].length()-1);
                if(ch=='s'){
                    count++;
                }
            }
        }
        System.out.println("Words end with s : " + count);
    }

    // 10. Count total number of words in a sentence.
    static void totalWords(String str) {
        int count=0;
        str=str.trim();
        if(str.length()==0){
            System.out.println("0");
            return;
        }
        String arr[]=str.split(" ");
        System.out.println("count of total words in a sentence: " + arr.length);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char ch = sc.next().charAt(0);

        countSpaces(str);

        vowelsConsonants(str);

        countTypes(str);

        upperLowerCount(str);

        frequencyCharacters(str);

        countGivenCharacter(str, ch);

        beforeAfterM(str);

        sameStartEndSubstring(str);

        wordsStartVowel(str);

        wordsEndS(str);

        totalWords(str);

        sc.close();
    }
}