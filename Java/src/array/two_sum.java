package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1. two_sum
 * @author libochao hslibc77@gmail.com
 * @version 1.0
 * @date 5/10/21 4:46 PM
 **/
public class two_sum {

    /*
     * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
     * <p>
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     * <p>
     * 你可以按任意顺序返回答案。
     * <p>
     * 示例 1：
     * 输入：nums = [2,7,11,15], target = 9
     * 输出：[0,1]
     * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
     * <p>
     * 示例 2：
     * 输入：nums = [3,2,4], target = 6
     * 输出：[1,2]
     * <p>
     * 示例 3：
     * 输入：nums = [3,3], target = 6
     * 输出：[0,1]
     *  
     * 提示：
     * <p>
     * 2 <= nums.length <= 103
     * -109 <= nums[i] <= 109
     * -109 <= target <= 109
     * 只会存在一个有效答案
     */

    /**
     * 时间复杂度：O(N)，其中 N 是数组中的元素数量。对于每一个元素 x，我们可以 O(1)O(1) 地寻找 target - x。
     * 空间复杂度：O(N)，其中 N 是数组中的元素数量。主要为哈希表的开销。
     */
    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while (i < nums.length) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
            i++;
        }
        return new int[2];
    }

    /**
     * 时间复杂度：O(N^2)，其中 N 是数组中的元素数量。最坏情况下数组中任意两个数都要被匹配一次。
     * 空间复杂度：O(1)
     */
    public static int[] twoSum2(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = twoSum(nums, target);
        System.out.println(Arrays.toString(res));
        System.out.println("----------------------------------------");

        int[] nums1 = {3,2,4};
        int target1 = 6;
        int[] res1 = twoSum2(nums1, target1);
        System.out.println(Arrays.toString(res1));
        System.out.println("---------------------------------------");

        int[] nums2 = {3,3};
        int target2 = 6;
        int[] res2 = twoSum(nums2, target2);
        System.out.println(Arrays.toString(res2));
        System.out.println("-----------------------------------------");
    }
}
