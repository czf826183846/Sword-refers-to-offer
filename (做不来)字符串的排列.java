//循环加递归
import java.util.ArrayList;
import java.util.Collections;
public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<String>();
        if(str.length()>0&&str!=null){//排除边界条件
            function(str.toCharArray(),0,res);
            Collections.sort(res);
        }
        return res;
    }
    public void function(char[] str, int i, ArrayList<String> res){
        if(i == str.length - 1){//递归结束情况
            String s = String.valueOf(str);
            if(!res.contains(s)) res.add(s);
        }
        else{
            for(int j = i; j < str.length; j++){//例如当i=0时，j依次为0，1，2
                swap(str,i,j);//交换后为，ABC,BAC,CBA，确定了首位
                function(str,i + 1,res);//再对后两位再调用函数，以BAC为例，得到BAC,BCA
                swap(str,i,j);//数组为全局变量，故一次递归完成后，需要将数组恢复成之前的状态
            }
        }
    }
    public void swap(char[] c, int i, int j){
        char tmp = c[i];
        c[i] = c[j];
        c[j] = tmp;
    }
}
