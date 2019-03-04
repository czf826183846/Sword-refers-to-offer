//首先二叉搜索树，应该是左边的都比根节点小，右边的都比根节点大
//后序遍历结果应该是，前半部分比最后一个数小，后半部分比最后一个树大
//测试用例中，当序列为空时，结果应为false，与递归时遇到空序列应返回true不同，所以，在方法外定义全局变量，使得第一次遇到空序列返回结果为false
//此外，由于i不是在for循环内部定义，结束循环后，若不设置判断条件，i会比预期大。

import java.util.Arrays;
public class Solution {
    public boolean flag = true;
    public boolean VerifySquenceOfBST(int [] sequence) {
        if((flag == true) && (sequence.length == 0)) return false;
        if((flag == false) && (sequence.length == 0)) return true;
        flag = false;
        if((sequence.length == 1)||
           (sequence.length == 2)) return true;
        int val = sequence[sequence.length - 1];
        int i = 0;
        for(i = 0; i < sequence.length; i++){
            if(sequence[i] > val) break;
            if(i == sequence.length - 1) break;
        }
        for(int j = i; j < sequence.length; j++){
            if(sequence[j] < val) return false;
        }
        int[] nums_left = Arrays.copyOfRange(sequence,0,i);
        int[] nums_right = Arrays.copyOfRange(sequence,i,sequence.length - 1);
        return VerifySquenceOfBST(nums_left)&&VerifySquenceOfBST(nums_right);
    }
}
