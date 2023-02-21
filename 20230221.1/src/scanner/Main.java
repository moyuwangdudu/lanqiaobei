package scanner;

import java.io.*;
import java.util.Scanner;

@SuppressWarnings({"all"})
public class Main {

    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        int n = nextInt();
        long m = nextLong();
        double d = nextDouble();
        cout.println(n);
        cout.flush();
        cout.println(m);
        cout.flush();
        cout.println(d);
        cout.flush();

        closeAll();
    }
    public static int nextInt() throws Exception{
        cin.nextToken();
        return (int) cin.nval;
    }
    public static long nextLong() throws Exception{
        cin.nextToken();
        return (long) cin.nval;
    }
    public static double nextDouble() throws Exception{
        cin.nextToken();
        return cin.nval;
    }
    public static String nextString() throws Exception{
        cin.nextToken();
        return cin.sval;
    }
    public static void closeAll() throws Exception {
        cout.close();
        in.close();
        out.close();
    }

    public static void main3(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a1 = 66;
        char a2 = '6';
        String a3 = "66";
        bw.write(a1);
        bw.write("\n");
        bw.write(a2);
        bw.write("\n");
        bw.write(a3);
        bw.write("\n");
        bw.flush();
        sc.close();
    }

    // 多组输入
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b;
        int c;
        while (sc.hasNext()) {
            a = sc.nextFloat();
            b = sc.nextFloat();
            c = sc.nextInt();
            System.out.println(a + " " + b + " " + c);
        }
        sc.close();
    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt(); // int 类型
        System.out.println(nu);
        float fl = sc.nextFloat(); // float 类型
        System.out.println(fl);
        double dou = sc.nextDouble(); // double 类型
        System.out.println(dou);
        String str = sc.next(); // String 类型，遇到空格结束
        System.out.println(str);
        String st = sc.nextLine(); // String 类型,读取一行数据，遇到换行结束。类似gets
        sc.close();
    }
}
