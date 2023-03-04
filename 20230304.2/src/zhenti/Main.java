package zhenti;

import java.util.Scanner;

@SuppressWarnings({"all"})
public class Main {

    //乐羊羊饮料厂正在举办一次促销优惠活动。
    // 乐羊羊 C 型饮料，凭 3 个瓶盖可以再换一瓶 C 型饮料，
    // 并且可以一直循环下去(但不允许暂借或赊账)。
    //
    //请你计算一下，如果小明不浪费瓶盖，尽量地参加活动，
    // 那么，对于他初始买入的 n 瓶饮料，最后他一共能喝到多少瓶饮料。


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int pg = 0;
        while (n > 0) {
            // 只要还剩一瓶就能喝，喝完剩下瓶盖哪怕还不了新瓶子照样喝，
            // 喝到一瓶不剩才行，不然100的数据如果出现148答案，
            // 就是你还剩一瓶没喝，就是while循环的条件不对
            ans += n;// 喝完所有的饮料
            pg += n;// 得到的瓶盖数
            n = pg / 3;// 瓶盖拿去换成新的饮料
            pg %= 3;// 还剩多少旧瓶盖
        }
        System.out.println(ans);
    }

    //    我们知道第一个质数是 2、第二个质数是 3、第三个质数是 5……
    //
    //    请你计算第 2019 个质数是多少？

    // 思路一：暴力
    public static void main2(String[] args) {
        boolean flag = true;
        int count = 0;
        int ans = 0;
        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            for (int j = 2; j <= i / j; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) count++;
            if (count == 2019) {
                ans = i;
                break;
            }
            flag = true;
        }
        System.out.println(ans);
    }
    // 思路二：用欧式筛法来提前打好质数数组表，
    // 最后直接输入要找第多少个，得到质数数组表里存的答案

    public static void main3(String[] args) {
        int n = (int) 1e6;//求第2019个质数，打1e6的表够用，不放心可以打更大的
        int count = 0;
        int[] prime = new int[n + 1];//存放第i个素数的值
        boolean[] isPrime = new boolean[n + 1];//判断当前这个数是否为素数，默认为false，这里true表示合数，false表示素数
        for (int i = 2; i <= n; i++) {
            if (isPrime[i] == false) prime[count++] = i;//如果为素数那么存放到prime数组
            for (int j = 0; j < count && prime[j] * i <= n; j++) {
                isPrime[prime[j] * i] = true;//素数的倍数一定不是素数
                if(i % prime[j] == 0) break;//核心！避免多次对一个数进行true赋值，提高了效率
            }
        }
        System.out.println(prime[2018]);//最后答案是17569，数组从0开始，所以这里填写2019
    }


    //    给定数列 1, 1, 1, 3, 5, 9, 17,
    //    1,1,1,3,5,9,17,⋯，从第 44 项开始，每项都是前 33 项的和。
    //
    //    求第 20190324 项的最后 44 位数字。

    //    思路：模拟题，用一个窗口来表示三项之和，
    //    每次挪动一格，a b c也要跟随着移动，
    //    用一个额外变量记录tmp = a+b+c，
    //    窗口每次移动 a = b，b = c， c = tmp，
    //    最后挪动到答案的时候输出最后一个值c即可。
    //    为了防止爆long从第四个数开始每次得到的值都要%10000取后四位的值，
    //    取模不会影响最后答案的计算，这是取模的性质决定的。

    public static void main1(String[] args) {
        long a = 1, b = 1, c = 1;
        for (int i = 4; i <= 20190324; i++) {
            long tmp = (a + b + c) % 10000;
            a = b;
            b = c;
            c = tmp;
        }
        System.out.println(c);//答案最后是4659
    }


}
