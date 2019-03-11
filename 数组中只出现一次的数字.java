//题目为，数组中，有两个数字只出现1次，其他数字均出现2次
//两个相同的数字异或^，结果为0，故将数组元素依次异或，得到的结果为那个两个只出现一次的数字的异或结果
//两个数字不同，故异或结果必不为0，找到异或结果2进制表示下为1的第一位，基于此将原数组分为两组
//则一个数组的异或结果为一个数字。
//此外可以通过哈希表存储数字及出现次数，但这种方法创造了额外空间，虽然时间复杂度都是O(n)
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int tmp = 0;
    	for(int i : array) tmp = tmp ^ i;
    	int index = 0;
    	while((tmp & 1) == 0) {
    		tmp = tmp >> 1;
        	index++;
    	}
    	for(int i : array) {
    		int j = i;
    		j = j >> index;//此处要另外创建变量用于进行移位判断而不能直接用i判断，否则异或的数也是移位后的数
        	if((j & 1) == 1) num1[0] = num1[0] ^ i;
        	else num2[0] = num2[0] ^ i;
    	}
    }
}
