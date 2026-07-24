import java.util.Scanner;

public class Main {

    // 1. Check if the array is sorted in ascending order.
    static boolean isAscending(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    // 2. Check if the array is sorted in descending order.
    static boolean isDescending(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                return false;
            }
        }
        return true;
    }

    // 3. Find the second largest element in an array.
    static int secondLargest(int[] arr) {
        int max=Integer.MIN_VALUE;
        int SecondMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                SecondMax=max;
                max=arr[i];
            }
            else if(arr[i]>SecondMax && arr[i]!=max){
                SecondMax=arr[i];
            }
        }
        return SecondMax;
    }

    // 4. Find the second smallest element in an array.
    static int secondSmallest(int[] arr) {
        int min=Integer.MAX_VALUE;
        int secondMin= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                secondMin=min;
                min=arr[i];
            }
            else if(arr[i]<secondMin && arr[i] != min){
                secondMin=arr[i];
            }
        }
        return secondMin;
    }

    // 5. Find the difference between the largest and smallest element.
    static int maxMinDifference(int[] arr) {
        int difference=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            else if(arr[i]>max){
                max=arr[i];
            }
            difference=max-min;
        }
        return difference;
    }

    // 6. Find the sum of all elements except the largest and smallest.
    static int sumExcetMaxMin(int[] arr) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(arr[i]<min){
                min=arr[i];
            }
            else if(arr[i]>max){
                max=arr[i];
            }
        }
        return sum-max-min;
    }

    // 7. Count how many pairs of elements have a sum equal to a given number k.
    static int countPairs(int[] arr, int k) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    count++;
                }
            }
        }
        return count;
    }

    // 8. Count how many elements are greater than the average of the array.
    static int countGreaterThanAverage(int[] arr) {
        int count=0;
        int sum=0;
        int average=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        average= sum/(arr.length);
        
        for(int j=0;j<arr.length;j++){
            if(arr[j]>average){
                count++;
            }
        }
        return count;

    }

    // 9. Print the frequency of each distinct element.
    static void frequencyDistinct(int[] arr) {
       for(int i=0;i<arr.length;i++){
        boolean flag=false;
        for(int j=0;j<i;j++){
            if(arr[i]==arr[j]){
                flag=true;
                break;
            }
        }
        if(flag==true){
            continue;
        }
        int count=0;
        for(int k=0;k<arr.length;k++){
            if(arr[i]==arr[k]){
                count++;
            }
        }
        System.out.println(arr[i] + " -> " + count);
       }
    }

    // 10. Print all unique elements (those that occur exactly once).
    static void printUnique(int[] arr) {
        for(int i=0;i<arr.length;i++){
        int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.print(arr[i]+" ");
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

        int k = sc.nextInt();

        System.out.println(isAscending(arr));

        System.out.println(isDescending(arr));

        System.out.println(secondLargest(arr));

        System.out.println(secondSmallest(arr));

        System.out.println(maxMinDifference(arr));

        System.out.println(sumExcetMaxMin(arr));

        System.out.println(countPairs(arr, k));

        System.out.println(countGreaterThanAverage(arr));

        frequencyDistinct(arr);

        printUnique(arr);

        sc.close();
    }
}

