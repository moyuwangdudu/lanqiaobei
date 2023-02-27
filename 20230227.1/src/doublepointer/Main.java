package doublepointer;

import java.util.Arrays;

@SuppressWarnings({"all"})
public class Main {
    //    给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。

    public void rotate(int[] nums, int k) {
//        int[] newNums = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            newNums[(i + k) % nums.length] = nums[i];
//        }
//        System.arraycopy(newNums, 0, nums, 0, nums.length);
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }

    //    给你一个按 非递减顺序 排序的整数数组 nums，
    //    返回 每个数字的平方 组成的新数组，
    //    要求也按 非递减顺序 排序。

    public int[] sortedSquares(int[] nums) {
//        int[] newNums = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            newNums[i] = nums[i] * nums[i];
//        }
//        Arrays.sort(newNums);
//        return newNums;
//        int n = nums.length;
//        int negative = -1;
//        for (int i = 0; i < n; i++) {
//            if (nums[i] < 0) {
//                negative = i;
//            } else {
//                break;
//            }
//        }
//
//        int[] newNums = new int[n];
//        int index = 0, i = negative, j = negative + 1;
//        while (i >= 0 || j < n) {
//            if (i < 0) {
//                newNums[index] = nums[j] * nums[j];
//                ++j;
//            } else if (j == n && nums[i] * nums[i] < nums[j] * nums[j]) {
//                newNums[index] = nums[i] * nums[i];
//                --i;
//            } else {
//                newNums[index] = nums[j] * nums[j];
//                ++j;
//            }
//            ++index;
//        }
//        return newNums;
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0, j = n - 1, pos = n - 1; i <= j; ) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                ans[pos] = nums[i] * nums[i];
                ++i;
            } else {
                ans[pos] = nums[j] * nums[j];
                --j;
            }
            --pos;
        }
        return ans;
    }


    public static void main(String[] args) {

    }
}
