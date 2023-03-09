import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

@SuppressWarnings({"all"})
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; ; i++) {
            sum += i;
            if (sum >= n) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void main6(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String tmp = sc.next();
            int id = sc.nextInt();
            set.add(id);
        }
        for (Integer i : set) {
            System.out.println(i);
        }
    }

    public static void main5(String[] args) {
        long count = 1;
        for (int i = 0; i < 22; i++) {
            count *= 20;
            count %= 7;
        }
        System.out.println(count);
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main4(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int yx = 0;
        int jg = 0;
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(br.readLine());
            if (tmp >= 60 && tmp < 85) jg++;
            if (tmp >= 85) yx++;
            sum++;
        }
        //在printf中两个%%代表一个%，%.0f表示保留0位小数的浮点数，乘以100.0是为了把整型给自动转换为浮点数类型
        System.out.printf("%.0f%%\n%.0f%%", 100.0 * (jg + yx) / sum, 100.0 * yx / sum);
    }


    public static void main3(String[] args) {
        int age = 0;
        for (int i = 19000000; i <= 20120312; i++) {
            String month = String.valueOf(i).substring(4, 6);
            int day = Integer.parseInt((i + "").substring(6));
            if (i % 2012 == 0 && i % 3 == 0 && i % 12 == 0 && month.equals("06") && day <= 30) {
                System.out.println(i);
                break;
            }
        }
    }

    // 把 2019 分解成 3 个各不相同的正整数之和，并且要求每个正整数都不包含数字 2 和 4，一共有多少种不同的分解方法？
    //
    // 注意交换 33 个整数的顺序被视为同一种方法，例如 1000+1001+18 和 1001+1000+18 被视为同一种。


    // 这是暴力的方法
    public static void main1(String[] args) {
        int count = 0;
        for (int i = 1; i < 2019; i++) {
            for (int j = 1; j < 2019; j++) {
                for (int k = 1; k < 2019; k++) {
                    if ((i + j + k) == 2019 && (i != j && i != k && j != k) && (check(i) && check(j) && check(k))) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count / 6);
    }

    private static boolean check(int n) {
        while (n > 0) {
            if (n % 10 == 2 || n % 10 == 4) return false;
            n /= 10;
        }
        return true;
    }

    public static void main2(String[] args) {
        int count = 0;
        for (int i = 1; i <= 2019 / 3 - 1; i++) {
            for (int j = i + 1; j <= 2019 / 2 - 1; j++) {
                int k = 2019 - i - j;
                if (k <= j) continue;
                if (check(i) && check(j) && check(k)) count++;
            }
        }
        System.out.println(count);
    }
}
