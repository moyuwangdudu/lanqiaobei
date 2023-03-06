import java.util.Scanner;

class Full {
    public static Main main = new Main();//实例化了一个main类，用于调用main类中的公共数组，就不需要每次递归重新创建数组，而且递归依次创建一个数组，他们改变的都不会再一个数组里呈现

    static void full(int number, int begin, int size) {
        int i, j, k;
        if (size == 0) return;//递归的边界值，若size=0，无需填写

        if (size == 1) {// 递归的边界值，若size=1，只需填写number
            main.data[begin][begin] = number;
        }
        i = begin;
        j = begin;//初始化第一个元素的下标
        for (k = 0; k < size - 1; k++) { // 填写区域A，共填写size-1个数
            main.data[i][j] = number;
            number++;
            i++; //行加1
        }
        for (k = 0; k < size - 1; k++) { // 填写区域B，共填写size-1个数
            main.data[i][j] = number;
            number++;
            j++; //列加1
        }
        for (k = 0; k < size - 1; k++) { // 填写区域C，共填写size-1个数
            main.data[i][j] = number;
            number++;
            i--; //行减1
        }
        for (k = 0; k < size - 1; k++) { // 填写区域D，共填写size-1个数
            main.data[i][j] = number;
            number++;
            j--; //列减1
        }
        full(number, begin + 1, size - 2);
    }
}

public class Main {
    //    给出一个初始数据，
    //    在此数据的基础上由外层向里层填写数据，
    //    完成一个数字旋转方阵，输出结果，
    //    输出时要求有文字说明。
    //    请任选一种语言编写程序实现上述算法，
    //    并分析其算法复杂度。

    static Scanner sc = new Scanner(System.in);
    //System.out.println("请输入想要的方阵大小：");
    static int size = sc.nextInt();
    public static int data[][] = new int[size][size];//定义方阵是一个size*size的二维数组

    public static void main(String[] args) {
        Full f = new Full();
        f.full(1, 0, size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%-5d", data[i][j]);
            }
            System.out.println();
        }
    }
}
