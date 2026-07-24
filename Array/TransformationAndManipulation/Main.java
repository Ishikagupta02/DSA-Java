import java.util.Scanner;

public class Main {

    // 1. Create a new array containing squares of all numbers.
    static int[] squareArray(int[] arr) {
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=arr[i] * arr[i];
        }
        return ans;
    }

    // 2. Create a new array containing only even elements.
    static int[] evenArray(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        int ans[]= new int[count];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                ans[j]=arr[i];
                j++;
            }
        }
        return ans;
    }

    // 3. Replace every negative number with 0.
    static void replaceNegativeWithZero(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                arr[i]=0;
            }
        }
    }

    // 4. Replace all even numbers with 1 and all odd with 0.
    static void replaceEvenOdd(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                arr[i]=1;
            }
            else{
                arr[i]=0;
            }
        }
    }

    // 5. Swap the first and last elements of the array.
    static void swapFirstLast(int[] arr) {
       int temp=arr[0];
       arr[0]=arr[arr.length-1];
       arr[arr.length-1]=temp;
    }

    // 6. Reverse an array (without using built-in reverse).
    static void reverseArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }

    // 7. Rotate an array by one position to the left.
    static void rotateLeft(int[] arr) {
        int first=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;
    }

    //8. Rotate an array by one position to the right.
    static void rotateRight(int[] arr) {
         int last=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;
    }

    // 9. Swap alternate elements (1st + 2nd, 3rd + 4th, etc.).
    static void swapAlternate(int[] arr) {
        for(int i=0;i<arr.length-1;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }

    // 10. Copy one array to another manually.
    static int[] copyArray(int[] arr) {
        int copy[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            copy[i]=arr[i];
        }
        return copy;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        printArray(squareArray(arr));

        printArray(evenArray(arr));

        replaceNegativeWithZero(arr);
        printArray(arr);

        replaceEvenOdd(arr);
        printArray(arr);

        swapFirstLast(arr);
        printArray(arr);

        reverseArray(arr);
        printArray(arr);

        rotateLeft(arr);
        printArray(arr);

        rotateRight(arr);
        printArray(arr);

        swapAlternate(arr);
        printArray(arr);

        printArray(copyArray(arr));

        sc.close();
    }
}