package shuzu;

import java.util.*;

@SuppressWarnings({"all"})
public class Main {


    //    给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请
    //
    //你返回所有和为 0 且不重复的三元组。

    public List<List<Integer>> threeSum(int[] nums) {
//        int n = nums.length;
//        List<List<Integer>> newNums = new LinkedList<>();
//        Arrays.sort(nums);
//        for (int i = 0; i < n - 2; i++) {
//            int x = nums[i];
//            if (i > 0 && nums[i - 1] == nums[i]) continue;
//            for (int j = i + 1; j < n - 1; j++) {
//                int y = nums[j];
//                if (j > i + 1 && nums[j - 1] == nums[j]) continue;
//                for (int k = j + 1; k < n; k++) {
//                    int z = nums[k];
//                    if (k > j + 1 && nums[k - 1] == nums[k]) continue;
//                    if (x + y + z == 0) {
//                        List<Integer> list = new LinkedList<>();
//                        list.add(x);
//                        list.add(y);
//                        list.add(z);
//                        newNums.add(list);
//                    }
//                }
//            }
//        }
//        return newNums;
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        // 枚举 a
        for (int first = 0; first < n; ++first) {
            // 需要和上一次枚举的数不相同
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            // c 对应的指针初始指向数组的最右端
            int third = n - 1;
            int target = -nums[first];
            // 枚举 b
            for (int second = first + 1; second < n; ++second) {
                // 需要和上一次枚举的数不相同
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }
                // 需要保证 b 的指针在 c 的指针的左侧
                while (second < third && nums[second] + nums[third] > target) {
                    --third;
                }
                // 如果指针重合，随着 b 后续的增加
                // 就不会有满足 a+b+c=0 并且 b<c 的 c 了，可以退出循环
                if (second == third) {
                    break;
                }
                if (nums[second] + nums[third] == target) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    ans.add(list);
                }
            }
        }
        return ans;
    }


    //    给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
    //
    //    你可以假设数组是非空的，并且给定的数组总是存在多数元素。

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    //给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，
    // 其余每个元素均出现两次。找出那个只出现了一次的元素。
    //
    //你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。

    public int singleNumber(int[] nums) {
//        int n = nums.length;
//        int num = 0;
//        for (int i : nums) {
//            num ^= i;
//        }
//        return num;
//        for (int i = 0; i < nums.length; i++) {
//            int count = 0;
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    count++;
//                }
//            }
//            if (count == 1) {
//                return nums[i];
//            }
//        }
//        return -1;
//        if (nums.length == 1) {
//            return nums[0];
//        }
//        Arrays.sort(nums);
//        if (nums[0] != nums[1]) {
//            return nums[0];
//        }
//        if (nums[nums.length - 1] != nums[nums.length - 2]) {
//            return nums[nums.length - 1];
//        }
//        for (int i = 1; i < nums.length - 1; i++) {
//            if (nums[i] != nums[i + 1] && nums[i] != nums[i - 1]) {
//                return nums[i];
//            }
//        }
//        return -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums) {
            Integer count = map.get(i);
            count = count == null ? 1 : ++count;
            map.put(i, count);
        }
        for (Integer i : map.keySet()) {
            Integer count = map.get(i);
            if (count == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
