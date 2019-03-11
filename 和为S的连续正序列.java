//连续正序列的和为S，只有两种情况
//序列长度为偶数时，S/序列长度，结果为1个小数，且小数点后一位是5，即xx.5
//序列长度为奇数时，S能够整除序列长度即可。


import java.util.ArrayList;
import java.util.Collections;
public class Solution {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> res3 = new ArrayList<Integer>();
        res3.add(1);
        res3.add(2);
        if(sum == 3){
            res.add(res3);
            return res;
        }
        for(int i = 2; (sum/i-i/2)>0; i++){
            if(i % 2 == 0){
                double num = (double)sum / i;
                if((num * 10) % 10 == 5){
                    ArrayList<Integer> res_small = new ArrayList<Integer>();
                    int n = sum / i - i / 2 + 1;
                    for(int j = 0; j < i; j++) {
                        res_small.add(n);
                        n++;
                    }
                    res.add(res_small);
                }
            }
            else{
                if(sum % i == 0){
                    ArrayList<Integer> res_small = new ArrayList<Integer>();
                    int n = sum / i - i / 2;
                    for(int j = 0; j < i; j++) {
                        res_small.add(n);
                        n++;
                    }
                    res.add(res_small);
                }
            }
        }
        Collections.reverse(res);
        return res;
    }
}
