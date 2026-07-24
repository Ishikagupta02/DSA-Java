import java.util.Scanner;

public class Main {

    // 1. Input n and take n integers into an array; print them.
    static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }

    // 2. Find the sum of all elements in an array.
    static int sumArray(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

    // 3. Find the average of array elements.
    static double averageArray(int[] arr) {
        int average=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            average=sum/arr.length;
        }
        return average;
    }

    // 4. Find the maximum element in an array.
    static int maxElement(int[] arr) {
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    // 5. Find the minimum element in an array.
    static int minElement(int[] arr) {
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    // 6. Count how many elements are positive, negative, or zero.
    static void countPositiveNegativeZero(int[] arr) {
        int positive=0;
        int negative=0;
        int zero=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }
            else if(arr[i]>0){
                positive++;
            }
            else{
                negative++;
            }
        }
        System.out.println("Positive Number : " + positive);
        System.out.println("Negative Number : " + negative);
        System.out.println("Zero : " + zero);
    }

    // 7. Count how many elements are even and odd.
    static void countEvenOdd(int[] arr) {
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even Number: "+ even);
        System.out.println("Odd Number: "+ odd);
    }

    // 8. Find the index of the maximum element.
    static int indexOfMax(int[] arr) {
        int index=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[index]){
                index=i;
            }
        }
        return index;
    }

    // 9. Find the index of the minimum element.
    static int indexOfMin(int[] arr) {
        int index=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[index]){
                index=i;
            }
        }
        return index;
    }

    // 10. Take n elements and print only those greater than a given value k.
    static void printGreaterThanK(int[] arr, int K) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]>K){
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int K = sc.nextInt();

        printArray(arr);

        System.out.println(sumArray(arr));

        System.out.println(averageArray(arr));

        System.out.println(maxElement(arr));

        System.out.println(minElement(arr));

        countPositiveNegativeZero(arr);

        countEvenOdd(arr);

        System.out.println(indexOfMax(arr));

        System.out.println(indexOfMin(arr));

        printGreaterThanK(arr, K);

        sc.close();
    }
}