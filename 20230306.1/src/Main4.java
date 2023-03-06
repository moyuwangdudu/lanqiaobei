import java.util.Arrays;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, key = 0, n = 0;

        System.out.println("请输入数组的长度:");
        int len = sc.nextInt();
        System.out.println("请输入数组元素：");
        int[] arr = new int[len];
        for (int j = 0; j < len; j++) {
            arr[j] = sc.nextInt();
        }
        System.out.println("请输入你想查找的元素：");
        key = sc.nextInt();
        System.out.println("查询值所对应的索引为：" + BinSearch(arr, key));
    }

    public static int BinSearch(int srcArray[], int key) {

        int mid = srcArray.length / 2;
        if (key == srcArray[mid]) {
            return mid;
        }

        int start = 0;
        int end = srcArray.length - 1;
        while (start <= end) {
            mid = (end - start) / 2 + start;
            if (key < srcArray[mid]) {
                end = mid - 1;
            } else if (key > srcArray[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
