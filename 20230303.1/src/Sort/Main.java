package Sort;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings({"all"})
public class Main {
    public static void selectSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            int j = i + 1;
            for (; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }
    public static void swap(int[] array,int i,int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] =tmp;
    }

    public static void bubbleSort(int[] array) {
        //最外层控制的是趟数
        for (int i = 0; i < array.length-1; i++) {
            boolean flg = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    swap(array,j,j+1);
                    flg = true;
                }
            }
            if(flg == false) {
                break;
            }
        }
    }

    public static void heapSort(int[] array) {//堆排序
        createBigHeap(array);//O(n)
        int end = array.length-1;
        while (end > 0) {
            swap(array,0,end);
            shiftDown(array,0,end);
            end--;
        }
    }

    private static void createBigHeap(int[] array) {//创建大根堆
        for (int parent = (array.length-1-1)/2; parent >= 0 ; parent--) {
            shiftDown(array,parent,array.length);
        }
    }

    private static void shiftDown(int[] array,int parent,int len) {//向下调整
        int child = (2 * parent) + 1;
        while (child < len) {
            if (child + 1 < len && array[child] < array[child + 1]) {
                child++;
            }
            if (array[child] > array[parent]) {
                swap(array, child, parent);
                parent = child;
                child = 2 * parent + 1;
            } else {
                break;
            }
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("排序之前的记录:");
        System.out.println(Arrays.toString(array));
        System.out.println("排序之后的记录:");
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}
