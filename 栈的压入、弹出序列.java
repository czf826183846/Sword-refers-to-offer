import java.util.ArrayList;
import java.util.Stack;
//先遍历入栈序列，将已经出栈的元素排除，同时更新出栈索引
//再对留在栈里的那部分序列，依次遍历判断是否相等
public class Solution {
    public boolean IsPopOrder(int [] push,int [] pop) {
        Stack<Integer> stack = new Stack<Integer>();
        int index = 0;
        for(int i : push){
            if(i == pop[index]){
                index++;
                continue;
            }
            else {
                stack.push(i);
            }
        }
        while(!stack.isEmpty()){
            int num = stack.pop();
            if(num != pop[index]) return false;
            else{
                index++;
                continue;
            }
        }
        return true;
    }
}
