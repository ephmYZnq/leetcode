package array;

import java.util.List;
import java.util.Arrays;

/**
 * 119. yanghui_triangle_ii
 * 
 * @author libochao hslibc77@gmail.com
 * @version 1.0
 * @date 6/17/21 3:50 PM
 **/
public class pascals_triangle_ii {

    /*
     * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
     *
     * 示例  输入: 5 输出: [1, 5, 10, 10, 5, 1]
     */

    public static List<Integer> getRow(int rowIndex) {
        Integer[] dp = new Integer[rowIndex + 1];
        Arrays.fill(dp, 1);
        for (int i = 2; i < dp.length; i++) {
            for (int j = i - 1; j > 0; j--)
                dp[j] = dp[j] + dp[j - 1];
        }
        List<Integer> res = Arrays.asList(dp);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getRow(5));
    }
}
