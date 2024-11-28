package org.example;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        System.out.println("---------*--------------*--------------*-----------*Basic Programs*-----------*-------------*---------------*-----------");
        //Swape two numbers
        System.out.println("=============Program to swap two numbers============");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int temp;
        System.out.println("Numbers before swapping: ");
        System.out.println(a+" "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("Numbers after swapping: ");
        System.out.println(a+" "+b);

        //Fibonacci series
        System.out.println("============Program to print Fibonacci series=============");
        System.out.println("Enter number: ");
        int Number = scanner.nextInt();
        int a1=0,a2=1,result;
        System.out.println(a1);
        System.out.println(a2);

        for(int i = 2; i < Number; i++) {
            System.out.println(a1 + a2);
            result = a1 + a2;
            a1 = a2;
            a2 = result;
        }

        //Program to reverse a given number
        System.out.println("===============Program to reverse a given number=================");
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        int sum=0, remainder, temp1;
        temp1 = num;
        while(num != 0){
            remainder = num%10;
            sum = sum * 10 + remainder;
            num = num/10;
        }
        System.out.println("The number before reversing : " + temp1);
        System.out.println("The number after reversing : " + sum);

        //Program to find whether a number is prime or not
        System.out.println("==============Program to check whether a given number is Prime number or not==============");
        System.out.println("Enter first number: ");
        int nump = scanner.nextInt();
        int flag = 0;
        // 0 and 1 are not prime numbers
        // change flag to 1 for non-prime number
        if (nump == 0 || nump == 1)
            flag = 1;
        for (int i = 2; i <= nump / 2; ++i) {
            if(nump % i == 0) {
                flag=1;
                break;
            }
        }
        if(flag == 1) {
            System.out.println("Not a Prime Number : ");
        }
        else {
            System.out.println("Congratulations! Prime number : ");
        }

        //Program to find the largest number
        System.out.println("==============Program to find the largest number among the three numbers================");
        int aa, bb, cc;
        aa = scanner.nextInt();
        bb = scanner.nextInt();
        cc = scanner.nextInt();
        if(aa > bb && aa > cc){
            System.out.println("aa is largest ");
        }
        else if(bb > aa && bb > cc){
            System.out.println("bb is largest ");
        }
        else {
            System.out.println("cc is largest ");
        }

        //Program to Swap the values of two variables without using any extra variable.
        System.out.println("==============Program to Swap the values of two variables without using any extra variable.==============");
        int aa1 = scanner.nextInt();
        int aa2 = scanner.nextInt();
        System.out.println("Numbers before swapping : ");
        System.out.println("aa1 " + aa1);
        System.out.println("aa2 " + aa2);
        aa1 = aa1 + aa2;
        aa2 = aa1 - aa2;
        aa1 = aa1 - aa2;
        System.out.println("Numbers after swapping : ");
        System.out.println("aa1 " + aa1);
        System.out.println("aa2 " + aa2);

        //Program to find Factorial of a Number.
        System.out.println("==============Program to find Factorial of a Number.==============");
        System.out.print("Enter the number: ");
        int aq = scanner.nextInt();
        // Initialize factorial to 1
        int factorial = 1;
        // Compute factorial using a loop
        for (int i = aq; i >= 1; i--) {
            factorial = factorial * i;
        }
        // Output the result
        System.out.println("Factorial of the number is: " + factorial);
        // Close the scanner

        //Program to Check if a number is an Armstrong number or not.
        System.out.println("================Program to Check if a number is an Armstrong number or not.==================");
        System.out.println("Enter a number: ");
        int num11 = scanner.nextInt();
        int count=0,temp19=num11,rem,sum1=0,temp2=num11;
        while(temp19 != 0){
            temp19 = temp19 / 10;
            count++;
        }
        while(num11 != 0){
            rem = num11 % 10;
            sum1 = (int)(sum1 + Math.pow(rem, count));
            num11 = num11 / 10;
        }
        if(sum1 == temp2){
            System.out.println("The number is an Armstrong number.");
        }
        else{
            System.out.println("The number is not an Armstrong number.");
        }
        System.out.println("Power Calculation : ");
        System.out.println("Enter a number: ");
        int num12 = scanner.nextInt(), power = 1;
        System.out.println("Enter Power : ");
        int num13 = scanner.nextInt();
        for(int j=1;j<=num13;j++){
            power = power * num12;
        }
        System.out.println("After power calculation : " + power);

        //Pattern printing program (Pyramid)
        System.out.println("=======================Pattern printing program (Pyramid)===========================");
        System.out.println("Enter a number : ");
        int t;
        int num10 = scanner.nextInt();
        t = num10 - 1;
        for(int i=1;i<=num10;i++){
            for(int j=t;j>0;j--){
                System.out.print(" ");
            }
            for(int k = 1;k <= i ;k++){
                System.out.print("* ");
            }
            t--;
            System.out.println();
        }

        //Pattern Printing (Number increasing pyramid)
        System.out.println("==================Pattern Printing (Number increasing pyramid)===================");
        System.out.println("Enter a number: ");
        int nn = scanner.nextInt();
        for(int i = 1; i <= nn; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //Pattern Printing (Number increasing reverse pyramid)
        System.out.println("======================Pattern Printing (Number increasing reverse pyramid)=========================");
        System.out.println("Enter a number: ");
        int nnn = scanner.nextInt(),te=1;
        for(int i = 1; i <= nnn; i++){
            for(int j = i; j <= nnn; j++){
                System.out.print(te + " ");
                te++;
            }
            te = 1;
            System.out.println();
        }

        //Print Square fill pattern
        System.out.println("=======================Print Square fill pattern=========================");
        System.out.println("Enter a number: ");
        int nn0 = scanner.nextInt();
        for(int i = 1; i <= nn0; i++){
            for(int j = 1; j <= nn0; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //Pattern Printing (Number Triangular)
        System.out.println("==================Pattern Printing (Number Triangular)===================");
        System.out.println("Enter a number: ");
        int n0n = scanner.nextInt(),t00;
        t00 = n0n-1;
        for(int i = 1; i <= n0n; i++){
            for(int j = 1; j <= t00; j++){
                System.out.print(" ");
            }
            for(int ji = 1; ji <= i; ji++){
                System.out.print(i + " ");
            }
            t00--;
            System.out.println();
        }
    }
}
