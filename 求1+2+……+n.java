//要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）
//从后往前累加递归

public class Solution {
    public int Sum_Solution(int n) {
        int sum = n;
        boolean ans = (n>0)&&((sum+=Sum_Solution(n-1))>0);//利用短路与，实现递归的终止，n=0时，只执行左边。
        return sum;
    }
}
