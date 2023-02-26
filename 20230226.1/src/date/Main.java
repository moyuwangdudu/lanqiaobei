package date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@SuppressWarnings({"all"})
public class Main {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        long t = end - start;
    }
    public static void main2(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒SSS毫秒");
        System.out.println(sdf.format(date));
        SimpleDateFormat sdf2 = new SimpleDateFormat("E 一年中第w周的第D天 一个月中的第W周的周F 一天中的24制的第k小时（点）12制的第K小时（点）");
        System.out.println(sdf2.format(date));
    }
    public static void main1(String[] args) {
        Date date1 = new Date();
        System.out.println(date1);
        System.out.println(date1.toString());

        Date date2 = new Date(100000000);
        System.out.println(date2);
        System.out.println(date2.toString());
    }
}
