import java.util.Scanner;

@SuppressWarnings({"all"})
public class Main {
    static int[] w = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        boolean flag = true;
        for (int i = day + 1; ; i++) {
            char[] s = (i + "").toCharArray();
            if (s[0] == s[7] && s[1] == s[6] && s[2] == s[5] && s[3] == s[4] && check2(i + "")) {
                if (flag) {
                    System.out.println(i);
                    flag = false;
                }
                if (s[0] == s[2] && s[1] == s[3]) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }

    private static boolean check2(String s) {
        int year = Integer.parseInt(s.substring(0, 4));
        int month = Integer.parseInt(s.substring(4, 6));
        int day = Integer.parseInt(s.substring(6));
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            w[2] = 29;
        } else {
            w[2] = 28;
        }
        if (month > 12) return false;
        if (day > w[month]) return false;
        return true;
    }

    public static void main3(String[] args) {
        int fz = 1;
        int fm = 1;
        for (int i = 0; i < 19; i++) {
            fm *= 2;
            fz += fm;
        }
        int t = gcd(fz, fm);
        System.out.printf("%d/%d", fz / t, fm / t);
    }

    private static int gcd(int fz, int fm) {
        return fz % fm == 0 ? fm : gcd(fm, fz % fm);
    }

    public static void main2(String[] args) {
        int count = 0;
        for (int i = 2333333; i <= 23333333; i++) {
            int tmp = i;
            int n = 0;
            for (int j = 2; j <= tmp / j; j++) {
                if (tmp % j == 0) {
                    while (tmp % j == 0) {
                        tmp /= j;
                        n++;
                    }
                }
            }
            if (tmp > 1) n++;
            if (n == 12) count++;
        }
        System.out.println(count);
    }

    public static void main1(String[] args) {
        for (int i = 6359; ; i++) {
            int tmp = (i + 1) * i / 2;
            if (check(tmp)) {
                System.out.println(tmp);
                break;
            }
        }
    }

    private static boolean check(int n) {
        char[] s = (n + "").toCharArray();
        int r = s.length - 1;
        int l = 0;
        while (l < r) {
            if (s[l] != s[r]) return false;
            l++;
            r--;
        }
        return true;
    }
}
