package shujuleixing;


import java.util.Scanner;

@SuppressWarnings({"all"})
public class Main {

    public static void main(String[] args) {
        String s = "  fw few ewf we  q qwf ";
        System.out.println(s.length());
        System.out.println(s);
        s = s.trim();
        System.out.println(s.length());
        System.out.println(s);

    }

    public static void main13(String[] args) {
        String s = "abbcccdddd";
        System.out.println(s.substring(2)); //从下标2开始
        System.out.println(s.substring(1, 5)); //从下标1到下标5（不包括5），即[1,5)
    }

    public static void main12(String[] args) {
        String s = "abcdbcq";
        System.out.println(s.lastIndexOf("bc"));
        System.out.println(s.lastIndexOf("fgh"));
    }

    public static void main11(String[] args) {
        String s = "abcdefghijklmnopkrstuvwxyz";
        System.out.println(s.indexOf("bc"));
        System.out.println(s.indexOf("fgh"));
    }

    public static void main10(String[] args) {
        String s = "abcdefghijklmnopkrstuvwxyz";
        System.out.println(s.endsWith("wxy"));
        System.out.println(s.endsWith("xyz"));
    }

    public static void main9(String[] args) {
        String s = "abcdefghijklmnopkrstuvwxyz";
        System.out.println(s.startsWith("abc"));
        System.out.println(s.startsWith("bcd"));
    }

    public static void main8(String[] args) {
        String s = "abcdefghijklmnopkrstuvwxyz";
        System.out.println(s.contains("bc"));
        System.out.println(s.contains("bd"));

    }

    public static void main7(String[] args) {
        String s1 = "abcdefghijklmnopkrstuvwxyz";
        String s2 = "ABCDEFGHIJKLMNOPKRSTUVWXYZ";
        boolean flag = s1.equalsIgnoreCase(s2);
        System.out.println(flag);
    }

    public static void main6(String[] args) {
        int num = 10;
        String str = num + "";
        System.out.println(str);
    }

    public static void main5(String[] args) {
        Integer it = new Integer(12);
        int i = it.intValue();
        System.out.println(i + 1);
    }

    public static void main4(String[] args) {
        int i = 120;
        Integer ie = new Integer(i);
        System.out.println(ie.toString());
        Integer it = new Integer("12345");
        System.out.println(it.toString());
    }

    public static void main3(String[] args) {
        Scanner Scin = new Scanner(System.in);
        char[] ch = new char[50];
        String s = Scin.next();
        ch = s.toCharArray();
        System.out.println("s = " + s);
        System.out.println("ch = " + ch);
        System.out.println(ch);

//        public void println(String x) {
//            synchronized (this) {
//                print(x);
//                newLine();
//            }
//        }

//        public void println(char x[]) {
//            synchronized (this) {
//                print(x);
//                newLine();
//            }
//        }
        // 可以看见，两次调用的方法是不一样的。
        // 这是println方法的重载问题导致的。
        // 第一次调用的方法的参数是String类型，
        // 第二次调用的方法的参数是char[]数组类型的。
        // 这是因为第一次中的 “ch = ：”
        // 把数组转换成了字符串String类型了


    }

    public static void main2(String[] args) {
        Scanner Scin = new Scanner(System.in);
        char[] ch = new char[50];
        String s = Scin.next();//qwer
        ch = s.toCharArray();
        System.out.println(ch);//qwer
    }

    public static void main1(String[] args) {
        Scanner Scin = new Scanner(System.in);
        char ch1 = Scin.next().charAt(0); // qwer
        System.out.println(ch1);

        char ch2 = Scin.next().charAt(3);
        System.out.println(ch2);
    }

}
