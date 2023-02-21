package shuzu;

import java.util.Arrays;

@SuppressWarnings({"all"})
public class Main {
    public static void main(String[] args) {
        //实用一
        int[] arr = new int[5];//新建一个大小为5的数组
        Arrays.fill(arr,4);//给所有值赋值4
        String str = Arrays.toString(arr); // Arrays类的toString()方法能将数组中的内容全部打印出来
        System.out.print(str);
        //输出：[4, 4, 4, 4, 4]

        //实用二
        int[] arr1 = new int[5];//新建一个大小为5的数组
        Arrays.fill(arr1,2,4,6);//[2,4) 下标从0开始。下标为2（包括）到下标为4（不包括）全部赋值为6
        String str1 = Arrays.toString(arr1); // Arrays类的toString()方法能将数组中的内容全部打印出来
        System.out.print(str1);
        //输出：[0, 0, 6, 6, 0]
    }


    public static void main1(String[] args) {
        int[] a = {24, 5, 9, 8, 9, 3, 6, 9};
        int[] b = new int[50];
        b = a.clone();
        System.out.println(Arrays.toString(b));
    }
}
