package zifuchuan;

import java.util.*;
import java.text.*;
import java.math.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.next();
        int x = src.indexOf("."); //小数
        int y = src.indexOf("/"); //分数
        int z = src.indexOf("%"); //百分数
        if (x != -1) { // 是小数
            int num = 0;
            StringBuilder sb = new StringBuilder("");
            String arr[] = src.split("\\.");
            char charArr_1[] = arr[0].toCharArray(); //整数部分
            String a = roll(charArr_1).toString(); //整数部分反转结果
            //小数部分反转 不能调用roll 反转完成之后判断末位是否为0
            String b = new StringBuffer(arr[1]).reverse().toString(); //小数部分直接反转
            char charArr_2[] = b.toCharArray();
            for (int i = charArr_2.length - 1; i >= 0; i--) {
                if (charArr_2[i] != '0') {
                    num = i;
                    break;
                }
            }
            for (int i = 0; i <= num; i++) {
                sb.append(charArr_2[i]);
            }
            System.out.println(a + "." + sb);
        } else if (y != -1) {
            String fraction[] = src.split("/");
            char fraction_1[] = fraction[0].toCharArray(); //分子
            char fraction_2[] = fraction[1].toCharArray(); //分母
            String a = roll(fraction_1).toString();
            String b = roll(fraction_2).toString();
            System.out.println(a + "/" + b);
        } else if (z != -1) //百分数
        {
            String arr[] = src.split("%");
            char charArr_1[] = arr[0].toCharArray();
            String a = roll(charArr_1).toString();
            System.out.println(a + "%");
        } else {
            char arr[] = src.toCharArray();
            String a = roll(arr).toString();
            System.out.println(a);
        }
    }

    public static StringBuilder roll(char arr[]) {
        StringBuilder result = new StringBuilder("");
        int num = 0; //存储第一个不为0的字符的索引
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != '0') {
                num = i;
                break;
            }
        }
        for (int i = num; i >= 0; i--) {
            result.append(arr[i]);
        }
        return result;
    }


    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String character = "";
        for (int i = 0; i < num; i++) {
            String line = scanner.nextLine(), result = "";
            String[] array = line.split("\\s+");
            int a, b;
            if (line.startsWith("a")) {
                character = "a";
                a = Integer.parseInt(array[1]);
                b = Integer.parseInt(array[2]);
            } else if (line.startsWith("b")) {
                character = "b";
                a = Integer.parseInt(array[1]);
                b = Integer.parseInt(array[2]);
            } else if (line.startsWith("c")) {
                character = "c";
                a = Integer.parseInt(array[1]);
                b = Integer.parseInt(array[2]);
            } else {
                a = Integer.parseInt(array[0]);
                b = Integer.parseInt(array[1]);
            }
            switch (character) {
                case "a":
                    result = a + "+" + b + "=" + (a + b);
                    break;
                case "b":
                    result = a + "-" + b + "=" + (a - b);
                    break;
                case "c":
                    result = a + "*" + b + "=" + (a * b);
                    break;
            }
            System.out.println(result + "\n" + result.length());
        }
        scanner.close();

    }

    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] count = new int[26];
        for (char c : str.toCharArray()) {
            count[c - 'a']++;
        }
        Arrays.sort(count);
        int num = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                num = count[25] - count[i];
                break;
            }
        }
        if (num == 0 || num == 1) {
            System.out.println("No Answer\\n0");
            return;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("No Answer\\n0");
                return;
            }
        }
        System.out.println("Lucky Word");
        System.out.println(num);
    }

    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (n == 26) {
                ch[i] = str.charAt(i);
            }
            if (str.charAt(i) + n > 'z' && n != 26) {
                ch[i] = (char) ('a' - 1 + (n - ('z' - str.charAt(i))));
            }
            if (str.charAt(i) + n <= 'z' && n != 26) {
                ch[i] = (char) (str.charAt(i) + n);
            }

            System.out.print(ch[i]);
        }

        sc.close();
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.toUpperCase());
    }
}
