package array;

import java.util.*;

/**
 * 605. can_place_flowers
 * 
 * @author libochao hslibc77@gmail.com
 * @version 1.0
 * @date 6/22/21 10:34 AM
 **/
public class can_place_flowers {

    /*
     * 假设有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
     * 
     * 给你一个整数数组  flowerbed 表示花坛，由若干 0 和 1 组成，其中 0 表示没种植花，1 表示种植了花。
     * 另有一个数 n，能否在不打破种植规则的情况下种入 n 朵花？能则返回 true ，不能则返回 false。
     * 
     * 
     * 示例 1：
     * 输入：flowerbed = [1,0,0,0,1], n = 1 输出：true 
     * 
     * 示例 2：
     * 输入：flowerbed = [1,0,0,0,1], n = 2 输出：false
     */

    public static boolean solution(int[] flowerbed, int n) {

        int[] big = new int[flowerbed.length + 2];
        big[0] = 0;
        big[big.length - 1] = 0;
        System.arraycopy(flowerbed, 0, big, 1, flowerbed.length);

        for (int i = 1; i < big.length - 1; i++) {
            if (big[i - 1] == 0 && big[i] == 0 && big[i + 1] == 0) {
                big[i] = 1;
                n -= 1;
            }
        }
        System.out.println(Arrays.toString(flowerbed));
        return 0 >= n;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] { 0, 0, 1, 0, 1 }, 1));
    }
}
