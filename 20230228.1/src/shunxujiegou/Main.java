package shunxujiegou;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

@SuppressWarnings({"all"})
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.printf("%d", (int)(a * 0.2 + b * 0.3 + c * 0.5));
    }

    public static void main11(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        c = a * 10 + b;
        System.out.printf("%d", c / 19);
    }

    public static void main10(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int minute = 0;
        if (d >= b) {
            minute = d - b;
        } else {
            minute = d - b + 60;
            c = c - 1;
        }
        int hour = c - a;
        System.out.println(hour + " " + minute);
    }

    public static void main9(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int r = sc.nextInt();
        double pi = 3.14f;
        double v = (pi * h * r * r) / 1000;
        int number = (int) (20 / v) + 1;
        System.out.println(number);
    }

    public static void main8(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int v = sc.nextInt();
        int time = 0;
        if ((s % v) == 0) {
            time = (int) s / v;
        } else {
            time = (int) (s / v + 1);
        }
        Calendar c = Calendar.getInstance();
        c.set(2022, Calendar.NOVEMBER, 5, 8, 0, 0);
        c.add(Calendar.MINUTE, -10);
        c.add(Calendar.MINUTE, -time);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        System.out.println(sdf.format(c.getTime()));
    }

    public static void main7(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double p = (a + b + c) / 2;
        double result = (Double) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.print(String.format("%.1f", result));
    }

    public static void main6(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double t = sc.nextDouble();
        int n = sc.nextInt();
        Double avg = t / n;
        System.out.print(String.format("%.3f", avg));
        System.out.println();
        System.out.println(n * 2);

    }

    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder(sc.nextLine());
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }

    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.toUpperCase());
    }


    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(" " + " " + str);
        System.out.println(" " + str + str + str);
        System.out.println(str + str + str + str + str);
    }

    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("  *");
        System.out.println(" ***");
        System.out.println("*****");
        System.out.println(" ***");
        System.out.println("  *");
    }

    public static void main1(String[] args) {
        System.out.println("Hello,World!");
    }
}
