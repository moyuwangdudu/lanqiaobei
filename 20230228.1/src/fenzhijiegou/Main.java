package fenzhijiegou;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;
import java.util.Scanner;

//import java.util.*;
//import java.math.*;
//import java.text.*;
//public class Main {
//    public static void main(String[] args) {
//
//    }
//}
@SuppressWarnings({"all"})
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[2][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 2; j++) {
                a[j][i] = sc.nextInt();
            }
        }
        int[] b = new int[7];
        int[] c = new int[7];
        for (int i = 0; i < 7; i++) {
            b[i] = a[0][i] + a[1][i];
            c[i] = a[0][i] + a[1][i];
        }

        boolean flag = false;
        int day = 0;
        for (int i = 0; i < 7; i++) {
            if (b[i] > 8) {
                flag = true;
            }
        }
        if (flag == true) {
            Arrays.sort(b);
            for (int i = 0; i < 7; i++) {
                if (b[6] == c[i]) {
                    day = i + 1;
                    break;
                }
            }
            System.out.println(day);
        } else {
            System.out.println(0);
        }
    }

    public static void main9(String[] args) {
        int a, c, b;
        Scanner x = new Scanner(System.in);
        a = x.nextInt();
        c = x.nextInt();
        if (a % 100 == 0) {
            if (a % 400 == 0) {
                b = 1;
            } else {
                b = 0;
            }
        } else {
            if (a % 4 == 0) {
                b = 1;
            } else {
                b = 0;
            }
        }

        if (b == 1) {
            if (c == 1 || c == 3 || c == 5 || c == 7 || c == 8 || c == 10 || c == 12) {
                System.out.print("31");
            } else if (c == 2) {
                System.out.print("29");
            } else if (c == 4 || c == 6 || c == 9 || c == 11) {
                System.out.print("30");
            }
        } else if (b == 0) {
            if (c == 1 || c == 3 || c == 5 || c == 7 || c == 8 || c == 10 || c == 12) {
                System.out.print("31");
            } else if (c == 2) {
                System.out.print("28");
            } else if (c == 4 || c == 6 || c == 9 || c == 11) {
                System.out.print("30");
            }
        }
    }

    public static void main8(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        if (b > c) {
            int tmp = b;
            b = c;
            c = tmp;
        }
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        System.out.println(a + " " + b + " " + c);
    }


    public static void main7(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = a / (b * b);
        if (c < 18.5) {
            System.out.print("Underweight");
        } else if (c >= 18.5 && c < 24) {
            System.out.print("Normal");
        } else if (c >= 24) {
            BigDecimal m = new BigDecimal(String.valueOf(c));
            BigDecimal n = BigDecimal.ONE;
            MathContext mc = new MathContext(6);
            System.out.println(m.divide(n, mc));
            System.out.print("Overweight");
        }
    }

    public static void main6(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n * 5 <= n * 3 + 11) {
            System.out.println("Local");
        } else {
            System.out.println("Luogu");
        }
    }

    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i == 0) {
            System.out.println("Today, I ate 0 apple.");
        } else if (i == 1) {
            System.out.println("Today, I ate 1 apple.");
        } else {
            System.out.println("Today, I ate " + i + " apples.");
        }
    }

    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        if (num % 2 == 0) sum += 1;
        if (num > 4 && num <= 12) sum += 1;
        if (sum == 2) {
            System.out.println("1 1 0 0");
        } else if (sum == 1) {
            System.out.println("0 1 1 0");
        } else {
            System.out.println("0 0 0 1");
        }
    }

    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), t = sc.nextInt(), s = sc.nextInt();
        if (t == 0) {
            System.out.println(0);
        } else if (s / t <= m) {
            int v = s / t;
            if (s % t > 0) {
                v += 1;
            }
            System.out.println(m - v);
        } else {
            System.out.println(0);
        }

    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        if (T == 1) {
            System.out.println("I love Luogu!");
        } else if (T == 2) {
            // 粘贴问题 2 的主函数代码，除了 return 0
            System.out.println((2 + 4) + " " + (10 - 2 - 4));
        } else if (T == 3) {
            // 请自行完成问题 3 的代码
            System.out.println(14 / 4);
            System.out.println(14 / 4 * 4);
            System.out.println(14 % 4);
        } else if (T == 4) {
            // 请自行完成问题 4 的代码
            System.out.printf("%.6f", (500 / 3));
        } else if (T == 5) {
            // 请自行完成问题 5 的代码
            System.out.println((200 + 260) / (20 + 12));
        } else if (T == 6) {
            // 请自行完成问题 6 的代码
            System.out.println(Math.sqrt(6 * 6 + 9 * 9));
        } else if (T == 7) {
            // 请自行完成问题 7 的代码
            System.out.println(100 + 10);
            System.out.println(110 - 20);
            System.out.println(0);
        } else if (T == 8) {
            // 请自行完成问题 8 的代码
            double pi = 3.141593f;
            System.out.println(2 * 5 * pi);
            System.out.println(pi * 5 * 5);
            System.out.println(5 * 5 * 5 * pi * (4 / 3));
        } else if (T == 9) {
            // 请自行完成问题 9 的代码
            System.out.println(((((1 + 1) * 2) + 1 * 2) + 1) * 2);
        } else if (T == 10) {
            // 请自行完成问题 10 的代码
            System.out.println(9);
        } else if (T == 11) {
            // 请自行完成问题 11 的代码
            System.out.println(1.0 * 100 / 3);
        } else if (T == 12) {
            // 请自行完成问题 12 的代码
            System.out.println((int) ('M' - 'A') + 1);
            System.out.println((char) (18 + 'A' - 1));
        } else if (T == 13) {
            // 请自行完成问题 13 的代码
            System.out.println((int) (Math.pow(4 / 3 * Math.PI * (4 * 4 * 4 + 10 * 10 * 10), 1.0 * 1 / 3)));
        } else if (T == 14) {
            // 请自行完成问题 14 的代码
            System.out.println(50);
        }
    }
}
