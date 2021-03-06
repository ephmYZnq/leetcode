package array;

import java.util.Arrays;

/**
 * 1480. running_sum_of_1d_array
 * 
 * @author libochao hslibc77@gmail.com
 * @version 1.0
 * @date 6/18/21 9:32 AM
 **/
public class running_sum_of_1d_array {

    /*
     * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
     * 
     * 请返回 nums 的动态和。
     * 
     * 示例 1： 输入：nums = [1,2,3,4] 输出：[1,3,6,10] 解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4]。
     * 示例 2： 输入：nums = [1,1,1,1,1] 输出：[1,2,3,4,5] 解释：动态和计算过程为 [1, 1+1, 1+1+1, 1+1+1+1,1+1+1+1+1] 。
     * 示例 3： 输入：nums = [3,1,2,10,1] 输出：[3,4,6,16,17]
     * 
     */

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
           nums[i] += nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1, 0, 9})));
    }
}
