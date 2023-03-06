import java.util.Scanner;

public class Main3 {
    //    在A上有按大小排序好的n个金碟，
    //    借助B的帮助，将A上的碟子移动到C上，
    //    在移动的过程中要严格按照大小顺序，
    //    不能将碟子放在比它小的上面，输出结果，
    //    输出时要求有文字说明
    //    。请任选一种语言编写程序实现上述算法，并分析其算法复杂度。


    public static void hanoi(int num, char a, char b, char c) {
        if (num == 1) {
            System.out.println("第" + num + "个圆盘从" + a + " -> " + c);
        } else {
            hanoi(num - 1, a, c, b);//借助c把第 num 个以外的圆盘从a移动到b
            System.out.println("第" + num + "个圆盘从" + a + " -> " + c);//把第num个从a移动到c
            hanoi(num - 1, b, a, c);//借助a把第 num 个以外的圆盘从b移动到c
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入圆盘的数量");
        int num = in.nextInt();
        hanoi(num, 'A', 'B', 'C');//起始柱、辅助柱、目标柱默认为A、B、C
    }
}
