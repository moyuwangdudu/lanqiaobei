package moniandgaojingdu;

import java.util.*;
import java.text.*;
import java.math.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("2");
        BigInteger bi2 = new BigInteger("3");
        BigInteger one = new BigInteger("1");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int arr[] = new int[n];
        int p = 0;
        for (int i = 2; sum < n; i++, p++) {
            sum += i;
            arr[p] = i;
        }
        int S = sum - n;
        if (S == 1) {
            arr[p - 1] = arr[p - 1] + 1;
            bi1 = bi1.add(one);
            bi2 = bi2.add(one);
            for (int i = 1; i < p - 1; i++) {
                if (bi2.intValue() == p + 1)
                    bi2 = bi2.add(one);
                bi1 = bi1.multiply(bi2);
                bi2 = bi2.add(one);
            }
            for (int i = 1; i < p; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
            System.out.print(bi1);
        } else {
            if (S != 2) {
                for (int i = 0; i < p - 1; i++) {
                    if (bi2.intValue() == S) {
                        bi2 = bi2.add(one);
                        continue;
                    }
                    bi1 = bi1.multiply(bi2);
                    bi2 = bi2.add(one);
                }
            } else {
                bi1 = bi1.add(one);
                bi2 = bi2.add(one);
                for (int i = 1; i < p - 1; i++) {
                    bi1 = bi1.multiply(bi2);
                    bi2 = bi2.add(one);
                }
            }
            for (int i = 0; i < p; i++) {
                if (arr[i] == S) continue;
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.print(bi1);
        }
    }


    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger sum = BigInteger.ZERO;
        while (true) {
            sum = sum.add(factorial(n));
            if (n.equals(BigInteger.ONE)) break;
            n = n.subtract(BigInteger.ONE);
        }
        System.out.println(sum);
    }

    private static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ONE)) return BigInteger.ONE;
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }


    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger sum = BigInteger.valueOf(0);
        while (sc.hasNext()) {
            BigInteger a = sc.nextBigInteger();
            if (a.equals(BigInteger.ZERO)) {
                break;
            }
            sum = sum.multiply(a);
        }
        System.out.println(sum);
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n + 2][m + 2];
        sc.nextLine();
        for (int i = 1; i < arr.length - 1; i++) {
            char[] chars = sc.nextLine().toCharArray();
            for (int j = 1; j < arr[i].length - 1; j++) {
                arr[i][j] = chars[j - 1];
            }
        }
        mum(arr);
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr[i].length - 1; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }

    private static void mum(char[][] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr[i].length - 1; j++) {
                int num = 0;
                if (arr[i][j] == '*') continue;
                else {
                    for (int k = i - 1; k <= i + 1; k++) {
                        for (int l = j - 1; l <= j + 1; l++) {
                            if (arr[k][l] == '*') {
                                num++;
                            }
                        }
                    }
                }
                arr[i][j] = (char) (num + '0');
            }
        }
    }
}
