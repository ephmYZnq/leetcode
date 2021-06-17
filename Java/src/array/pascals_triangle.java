package array;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. yanghui_triangle
 * 
 * @author libochao hslibc77@gmail.com
 * @version 1.0
 * @date 6/17/21 2:44 PM
 **/
public class pascals_triangle {

    /*
     * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。 在杨辉三角中，每个数是它左上方和右上方的数的和。
     *
     * 示例  输入: 5 输出: [ [1], [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1] ]
     */

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            if (i == 0) {
                temp.add(1);
            } else {
                List<Integer> list = ans.get(i - 1);
                int size = list.size() + 1;
                for (int j = 0; j < size; j++) {
                    if (j == 0 || j == size - 1) {
                        temp.add(1);
                    } else {
                        temp.add(list.get(j - 1) + list.get(j));
                    }
                }
            }
            ans.add(temp);
        }
        return ans;
    }

    public static void main(String[] args) {
        generate(11).forEach(System.out::println);
    }
}
