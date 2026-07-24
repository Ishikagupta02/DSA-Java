import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // 1. Compare two arrays - check if they are equal (same elements & order).
    static boolean areEqual(int[] arr1, int[] arr2) {
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    return true;
                }
            }
        }
        return false;
    }

    // 2. Compare two arrays - check if they contain the same elements (ignore order).
    static boolean sameElementsIgnoreOrder(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
        return false;
    }
    int[] a = Arrays.copyOf(arr1, arr1.length);
    int[] b = Arrays.copyOf(arr2, arr2.length);
    Arrays.sort(a);
    Arrays.sort(b);

    for (int i = 0; i < a.length; i++) {
        if (a[i] != b[i]) {
            return false;
        }
    }

    return true;
    }

    // 3. Merge two arrays into a third array.
    static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] ans= new int[arr1.length+arr2.length];
        int k=0;

        for(int i=0;i<arr1.length;i++){
            ans[k]=arr1[i];
            k++;
        }
        for(int j=0;j<arr2.length;j++){
            ans[k]=arr2[j];
            k++;
        }
        return ans;
    }

    // 4. Find the common elements between two arrays.
    static void commonElements(int[] arr1, int[] arr2) {
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }

    // 5. Find elements that are in one array but not in the other.
    static void differentElements(int[] arr1, int[] arr2) {
        for(int i=0;i<arr1.length;i++){
            boolean flag=true;
            for(int j=0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                System.out.print(arr1[i] + " ");
            }
        }
    }

    // 6. Count how many elements are common between two arrays.
    static int countCommon(int[] arr1, int[] arr2) {
        int count=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    count++;
                }
            }
        }
        return count;
    }

    // 7. Find element-wise sum of two arrays (A[i] + B[i]).
    static int[] elementWiseSum(int[] arr1, int[] arr2) {
        int n= Math.min(arr1.length, arr2.length);
        int[] ans= new int[n];

        for(int i=0;i<n;i++){
            ans[i]=arr1[i]+arr2[i];
        }
        return ans;
    }

    // 8. Find element-wise product of two arrays.
    static int[] elementWiseProduct(int[] arr1, int[] arr2) {
        int n= Math.min(arr1.length, arr2.length);
        int[] ans= new int[n];

        for(int i=0;i<n;i++){
            ans[i]=arr1[i]*arr2[i];
        }
        return ans;
    }

    // 9. Create a frequency array of numbers (count occurrence of each number).
    static void frequencyArray(int[] arr) {
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            for(int k=0;k<i;k++){
                if(arr[i]==arr[k]){
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                continue;
            }
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i] + " -> " + count);
        }
    }

    // 10. Print all elements that appear more than once.
    static void printDuplicates(int[] arr) {
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            for(int k=0;k<i;k++){
                if(arr[i]==arr[k]){
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                continue;
            }

            int count=0;

            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>1){
                System.out.print(arr[i] + " ");
            }
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println(areEqual(arr1, arr2));

        System.out.println(sameElementsIgnoreOrder(arr1, arr2));

        printArray(mergeArrays(arr1, arr2));

        commonElements(arr1, arr2);

        differentElements(arr1, arr2);

        System.out.println(countCommon(arr1, arr2));

        printArray(elementWiseSum(arr1, arr2));

        printArray(elementWiseProduct(arr1, arr2));

        frequencyArray(arr1);

        printDuplicates(arr1);

        sc.close();
    }
}