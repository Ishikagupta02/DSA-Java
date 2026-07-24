import java.util.Scanner;

public class main {

    // 1. Count frequency of every element
    static void countFrequency(int arr[]) {
       //finding size for frequency array 
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

       // create frequrncy array
       int freq[]=new int[max+1];
       
       // fill frequrncy array
       for(int i=0;i<arr.length;i++){
        freq[arr[i]]++;
       }

       // print frequency array
       for(int i=0;i<freq.length;i++){
        if(freq[i]>0){
            System.out.println(i + "->" + freq[i]);
        }
       }
    }

    // 2. Find frequency of given element
    static void frequencyOfElement(int arr[], int target) {
        int max= arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int freq[]=new int[max+1];

        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }

        System.out.println(freq[target]);
    }

    // 3. Count distinct elements
    static void countDistinct(int arr[]) {
        int max= arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int freq[]=new int[max+1];

        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        int count=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                count++;
            }
        }
        System.out.println(count);
    }

    // 4. Print duplicate elements
    static void duplicateElements(int arr[]) {
        int max= arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int freq[]=new int[max+1];

        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]>1){
                System.out.println(i  + " -> " + freq[i]);
            }
        }
    }

    // 5. Print unique elements
    static void uniqueElements(int arr[]) {
        int max= arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int freq[]=new int[max+1];

        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]==1){
                System.out.println(i  + " -> " + freq[i]);
            }
        }
    }

    // 6. Maximum frequency element
    static void maximumFrequency(int arr[]) {
        int max= arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int freq[]=new int[max+1];

        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }

        int maxfreq=0;
        int element=0;

        for(int i=0;i<freq.length;i++){
            if(freq[i]>maxfreq){
                maxfreq=freq[i];
                element=i;
            }
        }
        System.out.println(element + "-> " + maxfreq);
    }

    // 7. Minimum frequency element
    static void minimumFrequency(int arr[]) {
        int max= arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int freq[]=new int[max+1];

        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }

        int minfreq=Integer.MAX_VALUE;
        int element=0;

        for(int i=0;i<freq.length;i++){
            if(freq[i]<minfreq && freq[i]>0){
                minfreq=freq[i];
                element=i;
            }
        }
        System.out.println(element + "-> " + minfreq);
    }

    // 8. Check duplicate exists
    static void containsDuplicate(int arr[]) {
        int max= arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int freq[]=new int[max+1];

        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]>1){
                System.out.println(i  + " -> " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1
        // int arr1[] = {1,2,1,3,2,1};
        // countFrequency(arr1);

        // 2
        // int arr2[] = {2,4,2,5,2};
        // frequencyOfElement(arr2,4);

        // // 3
        // int arr3[] = {1,2,1,3,2,4,4,5};
        // countDistinct(arr3);

        // // 4
        // int arr4[] = {1,2,1,3,2,4,5,5};
        // duplicateElements(arr4);

        // // 5
        // int arr5[] = {1,2,1,3,4,4};
        // uniqueElements(arr5);

        // // 6
        // int arr6[] = {1,2,2,2,3,1};
        // maximumFrequency(arr6);

        // // 7
        // int arr7[] = {1,1,2,3,3};
        // minimumFrequency(arr7);

        // 8
        int arr8[] = {1,2,3,4,2,4,1,7};
        containsDuplicate(arr8);

        sc.close();
    }
}