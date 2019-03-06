public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        int curr = 0;
        int max = Integer.MIN_VALUE;//应对输入数组全部为负数的情况
        for(int i = 0; i < array.length; i++){
            curr += array[i];
            if(curr <= 0) {
                max = Math.max(curr,max);
                curr = 0;
            }
            else{
                max = Math.max(curr,max);
            }
        }
        return max;
    }
}
