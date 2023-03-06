import java.util.Arrays;
import java.util.Scanner;

public class Main2 {


    public static void main(String[] args) {
        int[] arr = new int[200];
        System.out.println("请输入数组的长度：");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        System.out.println("请输入数组的元素(各元素按空格隔开)");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        partitionHoare(arr, 0, len);
        System.out.println("快速排序之后的数组为：");
        for (int i = 0; i < len; i++) {
            System.out.printf("%d", arr[i]);
        }
    }


    private static void MergeSort(int[] arr, int len) {
        int[] r = new int[len];
        Merge(arr, r, 0, len - 1);
    }

    private static void Merge(int[] arr, int[] r, int start, int end) {
        if (start >= end) return;
        int len = end - start, mid = (len >> 1) + start;
        int start1 = start, end1 = mid;
        int start2 = mid + 1, end2 = end;
        Merge(arr, r, start1, end1);
        Merge(arr, r, start2, end2);
        int k = start;
        while (start1 <= end1 && start2 <= end2) {
            r[k++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
        }
        while (start1 <= end1) {
            r[k++] = arr[start1++];
        }

        while (start2 <= end2) {
            r[k++] = arr[start2++];
        }

        for (k = start; k <= end; k++) {
            arr[k] = r[k];
        }

    }

    private static int partitionHoare(int[] array, int left, int right) {
        int i = left;
        int pivot = array[left];
        while (left < right) {
            //left < right &&  这个条件不能少 预防后面都比基准大
            while (left < right && array[right] >= pivot) {
                right--;
            }
            //代码走到这里表示right下标的值 小于pivot
            while (left < right && array[left] <= pivot) {
                left++;
            }
            //left下标的值 大于pivot
            swap(array, left, right);
        }
        //交换 和 原来的left
        swap(array, left, i);
        return left;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


}
