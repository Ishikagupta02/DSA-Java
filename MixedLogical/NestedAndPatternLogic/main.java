import java.util.Scanner;

public class main {

    // 1. Print a multiplication table in a formatted grid (10x10).
    static void multiplicationGrid() {
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                System.out.print(i * j + "\t");
            }
            System.out.println(" ");
        }
    }

    // 2. Print all pairs in an array whose sum equals a given number.
    static void pairSum(int arr[], int target) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+ arr[j]==target){
                    System.out.println(arr[i] + " , " + arr[j]);
                }
            }
        }
    }

    // 3. Print all subarrays of a given array.
    static void subArrays(int arr[]) {

    }

    // 4. Check if an array is sorted (ascending or descending).
    static void checkSorted(int arr[]) {
        boolean asc=true;
        boolean des=true;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                des=false;
            }
            else if(arr[i]>arr[i+1]){
                asc=false;
            }
        }
        if(asc== true || des== true){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not sorted");
        }
    }

    // 5. Count how many times a number appears consecutively in an array.
    static void consecutiveCount(int arr[], int target) {
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] == target && arr[i+1]==target){
                count++;
            }
        }
        System.out.println(count);
    }

    // 6. Find all pairs of characters in a string that are the same.
    static void sameCharacterPairs(String str) {
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    System.out.println(str.charAt(i) + " , " + str.charAt(j));
                }
            }
        }
    }

    // 7. Print pattern of increasing characters (A, AB, ABC ... ).
    static void characterPattern(int n) {

    }

    // 8. Print Pascal's triangle up to N rows.
    static void pascalTriangle(int n) {

    }

    // 9. Generate Fibonacci series up to N using recursion.
    static int fibonacci(int n) {
        return 0;
    }

    // 10. Print numbers in a spiral-like pattern (conceptual dry run).
    static void spiralPattern(int n) {

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = {1, 2, 3, 4, 5, 2, 2};
        int target = 4;
        int n = 5;

        String str = "programming";

        multiplicationGrid();

        pairSum(arr, target);
 
        subArrays(arr);

        checkSorted(arr);

        consecutiveCount(arr, target);

        sameCharacterPairs(str);

        characterPattern(n);

        pascalTriangle(n);

        for(int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        spiralPattern(n);

        sc.close();
    }
}