package fenzhijiegou;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings({"all"})
//import java.util.*;
//import java.text.*;
//import java.math.*;
//public class Main {
//    public static void main(String[] args) {
//
//    }
//}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //首先输入一个字符串，例:0-670-82162-4
        String a = scanner.next();
        //看题意：sum代表从首位数乘起*1*2*3*4...一直乘到9之和;count就是计数器从1-9
        int sum = 0,count = 1;
        //这里定义mod的意义是:不用再写判断，当余数等于10的时候，识别码为大写字母X，直接获取mod[sum%11]，如果sum%11 = 10，那么mod[10]='X'
        char mod[] = new char[]{'0','1','2','3','4','5','6','7','8','9','X'};
        for (int i = 0; i < a.length()-1; i++) {
            if(a.charAt(i) == '-') {
                //continue不懂的上百度搜索，这里简单说一下，如果说遍历到分隔符'-'的话，就结束本次循环，下面的语句都不执行，而执行下一次循环
                continue;
            }
            //这里就是计算sum值
            //a.charAt(i) - '0',这段代码在下面详细解释
            sum  += (a.charAt(i) - '0')*count++;
        }
        if(mod[sum%11]==a.charAt(a.length()-1)) {
            System.out.println("Right");
        }else {
            for (int i = 0; i < a.length(); i++) {
                if(i==a.length()-1) {
                    System.out.print(mod[sum%11]);
                }else {
                    System.out.print(a.charAt(i));
                }
            }
        }
        scanner.close();
    }


    public static void main7(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = new int[3];
        for (int i = 0; i < 3; i++)
            number[i] = sc.nextInt();
        String str = sc.next();
        char ch[] = new char[3];
        for (int j = 0; j < 3; j++)
            ch[j] = str.charAt(j);
        Arrays.sort(number);
        for (int j = 0; j < 3; j++)
            System.out.printf("%d ", number[ch[j] - 'A']);

    }

    public static void main6(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
        }
        int a = sc.nextInt() + 30;
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] <= a) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[3];
        int x = 0, y = 0;
        for (int i = 0; i < 3; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        for (int i = 1; i < array[1]; i++) {
            if (array[0] % i == 0 && array[1] % i == 0) {
                x = array[0] / i;
                y = array[2] / i;
            }
        }
        System.out.println(x + "/" + y);
    }

    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (x == 8) {
                x = 1;
            }
            if (x < 6) {
                sum += 250;
            }
            x++;
        }
        System.out.println(sum);

    }

    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double price = 0;
        if (n <= 150) {
            price = 0.4463 * n;
        } else if (n > 150 || n <= 400) {
            price = 66.945 + (n - 150) * 0.4663;
        } else if (n > 400) {
            price = 150 * 0.4463 + 250 * 0.4663 + (n - 400) * 0.5663;
        }
        System.out.printf("%.1f", price);
    }

    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (!((a + b > c) && ((c - a) < b) && ((b - a) < c) && ((c - b) < a))) {
            System.out.println("Not triangle");
            System.exit(0);
        }
        int[] array = {a, b, c};
        Arrays.sort(array);
        a = array[0];
        b = array[1];
        c = array[2];
        if ((a * a + b * b) > (c * c)) {
            System.out.println("Acute triangle");
        }
        if ((a * a + b * b) == (c * c)) {
            System.out.println("Right triangle");
        }
        if ((a * a + b * b) < (c * c)) {
            System.out.println("Obtuse triangle");
        }
        if (((a == b) || (b == c) || (a == c))) {
            System.out.println("Isosceles triangle");
        }
        if ((a == b) && (b == c) || (a == c)) {
            System.out.println("Equilateral triangle");
        }
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[][] a = new int[3][2];
        int[] sum = new int[3];//sum表示P老师需要购买多少件当前包装类型的铅笔
        int[] c = new int[3];//c表示P老师购买之后的总价格
        for (int i = 0; i < 3; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();

            if (number % a[i][0] != 0) {
                sum[i] = (number / a[i][0]) + 1;
            } else {
                sum[i] = number / a[i][0];
            }
            c[i] = sum[i] * a[i][1];
        }
        Arrays.sort(c);
        System.out.println(c[0]);
        sc.close();
    }
}
