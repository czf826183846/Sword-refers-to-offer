//该方法时间复杂度为O(n)，没有利用到旋转数组的特性
//有时间复杂度为(logn)的方法，设立一头一尾两个指针，并从这两个指针的中间取第一个数，比头指针指向的数大说明在第一部分，比尾指针指向的数小说明在第二部分
//循环结束的条件是，头指针与尾指针相邻
//特例，将0个元素搬到后面时，第1个数已经比最后一个数小，直接返回第一个数
//特例，01111搬成10111，第一个数和中间的数和尾数都一样，此时只能遍历整个序列
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0) return 0;
        for(int i = 0; i < array.length; i++){

            if(array[i] > array[i + 1]) return array[i + 1];
            else continue;
        }
        return 0;
    }
}
