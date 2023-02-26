package calendar;

import java.util.Calendar;

@SuppressWarnings({"all"})
public class Main {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        c1.set(2021,7,13,13,14,23);
        c1.set(Calendar.DAY_OF_WEEK,1); //1表示星期天，2表示星期1，....

        int year = c1.get(Calendar.YEAR);
        int month = c1.get(Calendar.MONTH) + 1;
        int date = c1.get(Calendar.DATE);
        int hour = c1.get(Calendar.HOUR_OF_DAY);
        int minute = c1.get(Calendar.MINUTE);
        int second = c1.get(Calendar.SECOND);
        int day = c1.get(Calendar.DAY_OF_WEEK);
        System.out.println(year+"年"+month+"月"+date+"日 "+"星期"+day+" "+hour+"点"+minute+"分"+second+"秒");
    }
}
