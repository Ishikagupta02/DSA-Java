import java.util.Scanner;

public class Main {

    // 1. Print squares from 1 to n
    static void printSquares(int n) {
        for(int i=1;i<=n;i++){
            System.out.println((i*i) +" ");
        }
    }

    // 2. Print cubes from 1 to n
    static void printCubes(int n) {
        for(int i=1;i<=n;i++){
            System.out.println((i*i*i)+" ");
        }
    }

    // 3. Print all numbers between a and b divisible by 7
    static void printDivisibleBySeven(int a, int b) {
        for(int i=a;i<=b;i++){
            if(i%7==0){
                System.out.println(i);
            }
        }
    }

    // 4. Find HCF / GCD using loops
    static void findHCF(int a, int b) {

    }

    // 5. Find LCM using loops
    static void findLCM(int a, int b) {

    }

    // 6. Print all factors of a number
    static void printFactors(int n) {
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }

    // 7. Sum of all factors of a number
    static void sumFactors(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }

    // 8. Check Strong Number
    static void checkStrongNumber(int n) {
        int originalNumber=n;
        int sum=0;
        
        while(n>0){
            int digit=n%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact*=i;
            }
            sum+=fact;
            n/=10;
        }
        if(originalNumber==sum){
            System.out.println("Yes, It is strong number");
        }
        else{
            System.out.println("No, It is not a strong number");
        }
    }

    // 9. Print first n terms of AP (a, d)
    static void printAP(int a, int d, int n) {

    }

    // 10. Print first n terms of GP (a, r)
    static void printGP(int a, int r, int n) {

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1
        int n = sc.nextInt();
        printSquares(n);

        // 2
        n = sc.nextInt();
        printCubes(n);

        // 3
        int a = sc.nextInt();
        int b = sc.nextInt();
        printDivisibleBySeven(a, b);

        // 4
        a = sc.nextInt();
        b = sc.nextInt();
        findHCF(a, b);

        // 5
        a = sc.nextInt();
        b = sc.nextInt();
        findLCM(a, b);

        // 6
        n = sc.nextInt();
        printFactors(n);

        // 7
        n = sc.nextInt();
        sumFactors(n);

        // 8
        n = sc.nextInt();
        checkStrongNumber(n);

        // 9
        a = sc.nextInt();
        int d = sc.nextInt();
        n = sc.nextInt();
        printAP(a, d, n);

        // 10
        a = sc.nextInt();
        int r = sc.nextInt();
        n = sc.nextInt();
        printGP(a, r, n);

        sc.close();
    }
}