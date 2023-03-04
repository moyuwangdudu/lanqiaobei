package monigaojingdu;

import java.util.*;
import java.text.*;
import java.math.*;
import java.io.*;

@SuppressWarnings({"all"})
public class Main {

    static String str; // 有用的比赛信息
    static int a, b; // 两人的比分

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        do {
            sb.append(sc.next());
        } while (sb.indexOf("E") == -1);
        str = sb.substring(0, sb.indexOf("E") + 1);
        ps11();
        System.out.println();
        ps21();
    }

    public static void ps11() {
        a = b = 0;
        for (int i = 0; str.charAt(i) != 'E'; i++) {
            if (str.charAt(i) == 'W') a += 1;
            else b += 1;
            if ((a - b >= 2 || b - a >= 2) && (a >= 11 || b >= 11)) {
                System.out.println(a + ":" + b);
                a = b = 0;
            }
        }
        System.out.println(a + ":" + b);
    }

    public static void ps21() {
        a = b = 0;
        for (int i = 0; str.charAt(i) != 'E'; i++) {
            if (str.charAt(i) == 'W') a += 1;
            else b += 1;
            if ((a - b >= 2 || b - a >= 2) && (a >= 21 || b >= 21)) {
                System.out.println(a + ":" + b);
                a = b = 0;
            }
        }
        System.out.println(a + ":" + b);
    }
}
