import java.io.*;

@SuppressWarnings({"all"})
public class Main {

    static int N = 100010;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    //a存储每个同学刷题的数量，b存储的是每个刷量的个数对应学生有多少人
    static int[] a = new int[N];
    static int[] b = new int[N];


    public static void main(String[] args) throws IOException {
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        s = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
            //存储下标为刷题数的学生是多少，对应++
            b[a[i]]++;
        }
        //对刷题数进行前缀和，可以知道刷题数的时候，等于，小于，大于该刷题数的学生是多少人
        //一共N最大就是1e5，我们不知道具体每个学生刷多少道题，只有个范围，只能用最大值求前缀和了
        for (int i = 1; i <= 100000; i++) {
            b[i] += b[i-1];
        }
        //求每个学生至少还要刷多少道题可以满足  比自己刷题多的学生数 小于等于 刷题比他少的学生数
        for (int i = 0; i < n; i++) {
            //前面表示刷题量比自己多的学生  后面表示刷题量比自己少的学生，因为学生可以刷0道题，如果刷题数比自己小的学生都是刷0道题就会导致a[i-]-1为负数
            //b[-1]就会越界导致报错，所以要最后和0取个最大值
            //这个if条件就是刷题数比他少的学生数量大于等于刷题量比他多的学生，此时已经满足条件，直接输出就行了，该学生不用再刷题了
            if (b[100000] - b[a[i]] <= b[Math.max(0, a[i]-1)]) {
                out.print(0 + " ");
                continue;
            }
            //二分b数组找一个点，该点满足左边刷题数少的学生 刚好大于等于 右边刷题比他少的学生
            int l = a[i] + 1, r = 100000;
            while (l < r) {
                int mid = (l+r)>>1;
                //左边表示刷题数小于a[mid]的人用b[mid-1]表示，因为第一个if没进去，才到了这个循环里面，那么每次用mid查找的时候，自己就是属于刷题数小于a[mid]的人
                //因为要求的是数量大小的比较，自己这个时候已经被抽出去了，看要刷多少题才能插入到满足条件的地方，所以要算（左边刷题数少的学生 刚好大于等于 右边刷题比他少的学生）
                //的人数的时候，要把自己减掉才可以，所以左边刷题数少的学生表示为b[mid]-1
                if (b[mid - 1] - 1 >= b[100000] - b[mid]) r = mid;
                else l = mid + 1;
            }
            //还要刷多少道题
            out.print((r - a[i]) + " ");
        }
        out.flush();
    }

    public static void main1(String[] args) {
        int count = 0;
        for (int i = 2022; i <= 2022222022; i++) {
            char[] s = (i + "").toCharArray();
            int l = 0, r = s.length - 1;
            boolean flag = true;
            while (l < r) {
                if (s[l + 1] < s[l] || s[r - 1] < s[r] || s[l] != s[r]) {
                    flag = false;
                    break;
                }
                l++;
                r--;
            }
            if (flag) count++;
        }
        System.out.println(count);
    }
}
