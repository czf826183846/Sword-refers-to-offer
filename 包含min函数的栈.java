import java.util.Stack;
//第一个错误，直接记录最小值，作为min函数输出，但是这样会导致，当之前的最小值出栈后，新的最小值不会获得更新
//故另外设置一个栈用于存储最小值

public class Solution {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();
    public void push(int node) {
        stack.push(node);
        if(min.isEmpty()||min.peek() > node){
            min.push(node);
        }
    }
    
    public void pop() {
        int i = stack.pop();
        if(i == min.peek()) min.pop();
    }
    
    public int top() {
        return stack.pop();
    }
    
    public int min() {
        return min.peek();
    }
}
