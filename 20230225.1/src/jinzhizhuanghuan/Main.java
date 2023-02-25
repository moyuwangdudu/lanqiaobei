package jinzhizhuanghuan;

import java.text.DecimalFormat;

@SuppressWarnings({"all"})
public class Main {


    public static void main(String[] args) {
        double a = 123.00;
        DecimalFormat dfa = new DecimalFormat("#.##");
        System.out.println(dfa.format(a));
        DecimalFormat dfb = new DecimalFormat("0.00");
        System.out.println(dfb.format(a));
    }

    public static void main4(String[] args) {
        double a = 123.456789;
        double b = 123.444444;
        DecimalFormat dfa = new DecimalFormat("0.00");
        System.out.println(dfa.format(a));
        DecimalFormat dfb = new DecimalFormat("0.00");
        System.out.println(dfa.format(b));
    }

    public static void main3(String[] args) {
        double a = 123.456789;
        double b = 123.444444;
        String sa = String.format("%.2f", a);
        System.out.println(sa);
        String sb = String.format("%.2f", b);
        System.out.println(sb);
    }

    public static void main2(String[] args) {
        System.out.println(Integer.parseInt("10001", 2));
        System.out.println(Integer.parseInt("21", 8));
        System.out.println(Integer.parseInt("11", 16));
    }

    public static void main1(String[] args) {
        int k = 17;
        System.out.println(Integer.toBinaryString(k)); // 转二进制
        System.out.println(Integer.toOctalString(k)); // 转八进制
        System.out.println(Integer.toHexString(k)); // 转十六进制

        int r = 2;
        System.out.println(Integer.toString(k, r)); // 转r进制
        r = 8;
        System.out.println(Integer.toString(k, r)); // 转r进制
        r = 16;
        System.out.println(Integer.toString(k, r)); // 转r进制
    }
}
