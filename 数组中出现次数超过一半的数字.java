//最直观的解法是，排序后，遍历，排序时间复杂度为O(nlogn)
//第二种解法是，相当于找n个数中第n/2大的数，用快排的思想，时间复杂度为O(n)
//第三种解法，出现次数最多的那个数，出现的次数比其他数出现次数加起来还要多
//在遍历数组时保存两个值：一是数组中一个数字，一是次数。遍历下一个数字时，若它与之前保存的数字相同，则次数加1，否则次数减1；
//若次数为0，则保存下一个数字，并将次数置为1。遍历结束后，所保存的数字即为所求。然后再判断它是否符合条件即可。

//第一种解法
import java.util.Arrays;
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        if(array.length == 1) return array[0];
        int max = 1;
        int curr = 1;
        int res = 0;
        for(int i =0; i < array.length - 1; i++){
            if(array[i + 1] == array[i]){
                curr++;
                if(curr > max){
                    max = curr;
                    res = array[i];
                }
            }
            else{
                curr = 1;
            }
        }
        return max>(array.length/2)?res:0;
    }
}

//第三种解法
class Solution {
public:
    int MoreThanHalfNum_Solution(vector<int> numbers)
    {
        if(numbers.empty()) return 0;
         
        // 遍历每个元素，并记录次数；若与前一个元素相同，则次数加1，否则次数减1
        int result = numbers[0];
        int times = 1; // 次数
         
        for(int i=1;i<numbers.size();++i)
        {
            if(times == 0)
            {
                // 更新result的值为当前元素，并置次数为1
                result = numbers[i];
                times = 1;
            }
            else if(numbers[i] == result)
            {
                ++times; // 相同则加1
            }
            else
            {
                --times; // 不同则减1               
            }
        }
         
        // 判断result是否符合条件，即出现次数大于数组长度的一半
        times = 0;
        for(int i=0;i<numbers.size();++i)
        {
            if(numbers[i] == result) ++times;
        }
         
        return (times > numbers.size()/2) ? result : 0;
    }
};
