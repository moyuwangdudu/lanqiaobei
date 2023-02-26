package dashu;

import java.math.BigInteger;
import java.util.Scanner;

@SuppressWarnings({"all"})
public class Main {
    public static void main(String[] args) {
//        BigInteger abs()  返回大整数的绝对值
//        BigInteger add(BigInteger val) 返回两个大整数的和
//        BigInteger and(BigInteger val)  返回两个大整数的按位与的结果
//        BigInteger andNot(BigInteger val) 返回两个大整数与非的结果
//        BigInteger divide(BigInteger val)  返回两个大整数的商
//        double doubleValue()   返回大整数的double类型的值
//        float floatValue()   返回大整数的float类型的值
//        BigInteger gcd(BigInteger val)  返回大整数的最大公约数
//        int intValue() 返回大整数的整型值
//        long longValue() 返回大整数的long型值
//        BigInteger max(BigInteger val) 返回两个大整数的最大者
//        BigInteger min(BigInteger val) 返回两个大整数的最小者
//        BigInteger mod(BigInteger val) 用当前大整数对val求模
//        BigInteger multiply(BigInteger val) 返回两个大整数的积
//        BigInteger negate() 返回当前大整数的相反数
//        BigInteger not() 返回当前大整数的非
//        BigInteger or(BigInteger val) 返回两个大整数的按位或
//        BigInteger pow(int exponent) 返回当前大整数的exponent次方
//        BigInteger remainder(BigInteger val) 返回当前大整数除以val的余数
//        BigInteger shiftLeft(int n) 将当前大整数左移n位后返回
//        BigInteger shiftRight(int n) 将当前大整数右移n位后返回
//        BigInteger subtract(BigInteger val)返回两个大整数相减的结果
//        byte[] toByteArray(BigInteger val)将大整数转换成二进制反码保存在byte数组中
//        String toString() 将当前大整数转换成十进制的字符串形式
//        BigInteger xor(BigInteger val) 返回两个大整数的异或

    }
    public static void main1(String[] args) {
        Scanner Scin = new Scanner(System.in);
        String s1 = Scin.next();
        BigInteger bs1 = new BigInteger(s1);
        System.out.println(bs1);

        String s2 = Scin.next();
        BigInteger bs2 = new BigInteger(s2, 2);
        System.out.println(bs2);

    }
}
