import java.util.HashSet;

public class main {

    // 1. Remove duplicates from an array
    static void removeDuplicates(int[] arr) {
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int num: set){
            System.out.println(num);
        }
    }

    // 2. Count distinct elements
    static void countDistinctElements(int[] arr) {
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set.size());
    }

    // 3. Print duplicate elements
    static void printDuplicateElements(int[] arr) {
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                System.out.println(arr[i]);
            }
            else{
                set.add(arr[i]);
            }
        }
    }

    // 4. Check if array contains duplicate
    static void containsDuplicate(int[] arr) {
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                System.out.println(true);
                return;
            }
            else{
               set.add(arr[i]);
            }
        }
         System.out.println(false);
    }

    // 5. Find common elements of two arrays
    static void findCommonElements(int[] arr1, int[] arr2) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                System.out.println(arr2[i]);
                set.remove(arr2[i]);
            }
        }
    }

    // 6. Find union of two arrays
    static void findUnion(int[] arr1, int[] arr2) {
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
                set.add(arr2[i]);
        }
        for(int num: set){
            System.out.println(num);
        }
    }

    // 7. Find elements present in first array but not second
    static void findDifference(int[] arr1, int[] arr2) {
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        for(int i=0;i<arr1.length;i++){
            if(!set.contains(arr1[i])){
                System.out.println(arr1[i]);
            }
        }
    }

    // 8. First repeating element
    static void firstRepeatingElement(int[] arr) {
        HashSet<Integer> set= new HashSet<>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                System.out.println(arr[i]);
                return;
            }
            else{
                set.add(arr[i]);
            }
        }
    }

    // 9. Check if two arrays have any common element
    static void checkCommonElement(int[] arr1, int[] arr2) {
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }

    // 10. Find missing element from an array
    static void findMissingElement(int[] arr) {
        // your code
    }

    public static void main(String[] args) {

        // 1
        removeDuplicates(new int[]{10, 20, 10, 30, 20, 40, 30});

        // 2
        countDistinctElements(new int[]{10, 20, 10, 30, 20, 40, 30});

        // 3
        printDuplicateElements(new int[]{10, 20, 10, 30, 20, 40, 30});

        // 4
        containsDuplicate(new int[]{10, 20, 30, 40,20});

        // 5
        findCommonElements(
            new int[]{10, 20, 30, 40},
            new int[]{30, 40, 50, 60}
        );

        // 6
        findUnion(
            new int[]{10, 20, 30},
            new int[]{30, 40, 50}
        );

        // 7
        findDifference(
            new int[]{10, 20, 30, 40},
            new int[]{30, 40, 50}
        );

        // 8
        firstRepeatingElement(new int[]{10, 20, 30, 20, 40, 10});

        // 9
        checkCommonElement(
            new int[]{10, 20, 30},
            new int[]{40, 50, 60}
        );

        // 10
        findMissingElement(new int[]{1, 2, 3, 5, 6});
    }
}