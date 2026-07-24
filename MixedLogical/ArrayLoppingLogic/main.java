import java.util.Scanner;

public class main {

    // 1. Find the maximum and minimum element in an array.
    static void maxMin(int arr[]) {
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            else if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max element: " + max);
        System.out.println("Min element: " + min);
    }

    // 2. Count how many positive, negative, and zero elements are in an array.
    static void countPosNegZero(int arr[]) {
        int pos=0;
        int neg=0;
        int zero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                neg++;
            }
            else if(arr[i]>0){
                pos++;
            }
            else if(arr[i]==0){
                zero++;
            }
        }
        System.out.println("Positive Number : " + pos);
        System.out.println("Negative Number : " + neg);
        System.out.println("Zero Number : " + zero);
    }

    // 3. Print all unique elements from an array.
    static void uniqueElements(int arr[]) {
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                 System.out.print(arr[i]+ " ");
            }
        }
    }

    // 4. Reverse an array in-place.
    static void reverseArray(int arr[]) {
        int left=0;
        int right=arr.length-1;

        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    // 5. Shift all zeros to the end of the array.
    static void moveZeros(int arr[]) {
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        while(index<arr.length){
            arr[index]=0;
            index++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    // 6. Count how many elements are even at an even index.
    static void evenAtEvenIndex(int arr[]) {
        int count=0;
        for(int i=0;i<arr.length;i+=2){
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.println(count);
    }

    // 7. Merge two arrays into one.
    static void mergeArrays(int arr[], int arr2[]) {
        int res[]=new int[arr.length+arr2.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            res[index]=arr[i];
            index++;
        }
        for(int i=0;i<arr2.length;i++){
            res[index]=arr2[i];
            index++;
        }
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }

    }

    // 8. Find the second largest element in an array.
    static void secondLargest(int arr[]) {
        int max=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondLargest=max;
                max=arr[i];      
            }
            else if(arr[i]>secondLargest && arr[i]!=max){
                secondLargest=arr[i];
            }
        }
        System.out.println(secondLargest);
    }

    // 9. Rotate an array by one position to the right.
    static void rotateRight(int arr[]) {
        int last=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    // 10. Find the sum of all elements at odd indices.
    static void sumOddIndex(int arr[]) {
        int sum=0;
        for(int i=1;i<arr.length;i+=2){
            sum+=arr[i];
        }
        System.out.println("Sum of odd indices : " + sum);
    }

    public static void main(String[] args) {

        int arr[] = {1, -2, 0, 4, 0, -5, 6};
        int arr2[] = {7, 8, 9};

        // maxMin(arr);

        // countPosNegZero(arr);

        // uniqueElements(arr);

        // reverseArray(arr);

        // moveZeros(arr);

        // evenAtEvenIndex(arr);

        // mergeArrays(arr, arr2);

        // secondLargest(arr);

        rotateRight(arr);

        // sumOddIndex(arr);
    }
}