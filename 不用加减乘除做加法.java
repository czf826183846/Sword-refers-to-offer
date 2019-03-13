//用异或实现2个数字之间的相加，用与后左移1位实现两个数字之间相加后的进位

public class Solution {
    public int Add(int num1,int num2) {
        while(num2 != 0){//进位结果为0时循环终止
            int temp = num1 ^ num2;
            num2 = (num1 & num2) << 1;
            num1 = temp;
        }
        return num1;
    }
}
