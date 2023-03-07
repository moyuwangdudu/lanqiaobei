import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        long n = 2021041820210418L;
        long m = (long) Math.sqrt(n);
        List<Long> list = new LinkedList<>();
        for (long i = 1; i <= m; i++) {
            if (n % i == 0) {
                list.add(i);
                list.add(n / i);
            }
        }
        int ans = 0;
        long a = list.size();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                for (int k = 0; k < a; k++) {
                    if (list.get(i) * list.get(j) * list.get(k) == n) ans++;
                }
            }

        }
        System.out.println(ans);
    }


    //小蓝要为一条街的住户制作门牌号。
    //
    //这条街一共有 2020 位住户，门牌号从 1 到 2020 编号。
    //
    //小蓝制作门牌的方法是先制作 0 到 9 这几个数字字符，
    // 最后根据需要将字符粘贴到门牌上，例如门牌 1017
    // 需要依次粘贴字符 1、0、1、7，即需要 1 个字符 0，2 个字符 1，
    // 1 个字符 7。

//    public static void main1(String[] args) {
//        String s = "";
//        int count = 0;
//        for (int i = 1; i <= 2020; i++) {
//            s = i + "";
//            char[] ch = s.toCharArray();
//            for (int j = 0; j < ch.length; j++) {
//                if (ch[j] == '2') count++;
//            }
//        }
//        System.out.println(count);
//    }

}
