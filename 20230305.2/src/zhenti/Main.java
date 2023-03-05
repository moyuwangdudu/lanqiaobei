package zhenti;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        long result = 0;
        long[] arr = new long[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLong();
            sum += arr[i];//先对输入的数进行求和
        }
        for (int i = 0; i < arr.length; i++) {
            result += arr[i] * (sum - arr[i]);
           /*不难发现如果输入1 3 6 9
           第一次两两相乘为1*3+1*6+1*9=1*(3+6+9)
           第二次两两相乘为3*6+3*9=3*(+6+9)
           第三次两两相乘为6*9=6*(9)
           最后相加，即每一次该数乘以sum内不包含本身的值
           */
            sum -= arr[i];
        }
        System.out.println(result);
        sc.close();
    }

    //  给定一个正整数 t，总是可以找到含有 t 个约数的整数。
    //  小明对于含有 t 个约数的最小数非常感兴趣，并把它定义为 S

    //纯暴力模拟，因为数比较小，加上是一道填空题，考场遇到用的方法越简单越好

    public static void main2(String[] args) {
        for (int i = 1; ; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) count++;
                if (count == 100) {
                    System.out.println(i);
                    return;
                }
            }
        }
    }

    //    请你找到最小的整数 X 同时满足：
    //
    //    X 是 2019 的整倍数；
    //    X 的每一位数字都是奇数。

    public static void main1(String[] args) {
        for (int i = 2; ; i++) {
            if (func(i * 2019)) {
                System.out.println(i * 2019);
                break;
            }
        }
    }

    private static boolean func(int n) {
        int tmp = 0;
        while (n != 0) {
            tmp = n % 10;
            if (tmp % 2 == 0) return false;
            n /= 10;
        }
        return true;
    }
}
