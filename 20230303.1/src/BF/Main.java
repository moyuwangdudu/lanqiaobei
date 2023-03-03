package BF;

import java.util.Scanner;

@SuppressWarnings({"all"})
public class Main {
    public static int BF(String S, String T) {
        if (S == null || T == null) {
            return -1;
        }
        int lenS = S.length();
        int lenT = T.length();
        if (lenS == 0 || lenT == 0) {
            return -1;
        }

        int i = 0;// 遍历主串
        int j = 0;// 遍历子串
        while (i < lenS && j < lenT) {
            if (S.charAt(i) == T.charAt(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j >= lenT) {
            return i - j;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入主串S(不超过100个字符):");
        String S = sc.next();
        System.out.println("请输入子串T(不超过100个字符):");
        String T = sc.next();
        if (BF(S, T) == -1) {
            System.out.println("模式匹配失败!");
        } else {
            System.out.println("模式匹配成功，子串" + T + "在主串" + S + "中首次匹配的位置是" + BF(S, T));
        }
    }
}
