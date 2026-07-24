import java.util.Scanner;

public class Main {

    // 1. Input an element x - check if it exists in the array.
    static boolean exists(int[] arr, int x) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return true;
            }
        }
        return false;
    }

    // 2. Count how many times a given element appears.
    static int countOccurrences(int[] arr, int x) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }

    // 3. Find the first occurrence of a given number.
    static int firstOccurrence(int[] arr, int x) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }

    // 4. Find the last occurrence of a given number.
    static int lastOccurrence(int[] arr, int x) {
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }

    // 5. Check if all elements in an array are unique.
    static boolean allUnique(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return false;
                }
            }
        }
        return true;
    }

    // 6. Find the sum of even elements only.
    static int sumEven(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sum+=arr[i];
            }
        }
        return sum;
    }

    // 7. Find the sum of odd elements only.
    static int sumOdd(int[] arr) {
         int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                sum+=arr[i];
            }
        }
        return sum;
    }

    // 8. Find the count of prime numbers in the array.
    static int countPrimes(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            int num=arr[i];

            if(num<2){
                continue;
            }

            boolean prime=true;
            for(int j=2;j<num;j++){
                if(num% j==0){
                    prime=false;
                    break;
                }
            }
            if(prime==true){
                count++;
            }
        }
        return count;
    }

    // 9. Count how many numbers are divisible by 3 and 5 both.
    static int countDivisibleBy3And5(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 3==0 && arr[i] % 5==0){
                count++;
            }
        }
        return count;
    }

    // 10. Count how many elements are perfect squares.
    static int countPerfectSquares(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            int num=arr[i];

            if(num<0){
                continue;
            }
            int root=(int) Math.sqrt(num);
            if(root*root==num){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        System.out.println(exists(arr, x));

        System.out.println(countOccurrences(arr, x));

        System.out.println(firstOccurrence(arr, x));

        System.out.println(lastOccurrence(arr, x));

        System.out.println(allUnique(arr));

        System.out.println(sumEven(arr));

        System.out.println(sumOdd(arr));

        System.out.println(countPrimes(arr));

        System.out.println(countDivisibleBy3And5(arr));

        System.out.println(countPerfectSquares(arr));

        sc.close();
    }
}