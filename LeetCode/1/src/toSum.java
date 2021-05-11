/**
 * @author xiaojun
 * @Date 2021/5/8 22:57
 * @Version 1.0
 **/
public class toSum {


    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        Solution solution = new Solution();
        int[] result = new int[solution.twoSum(nums,target).length];
        result = solution.twoSum(nums, target);
        for (int i = 0; i < result.length; ++i){
            System.out.println(result[i]);
        }
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i]+ nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("找不到想要的下标值");
    }
}
