public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if(index < 7) return index;
        int[] res = new int[index];
        res[0] = 1;
        int n2 = 0, n3 = 0, n5 =0;
        for(int i = 1; i < index; i++){
            res[i] = Math.min(res[n2]*2,Math.min(res[n3]*3,res[n5]*5));
            if (res[i] == res[n2] * 2)n2++;
            if (res[i] == res[n3] * 3)n3++;
            if (res[i] == res[n5] * 5)n5++;
        }
        return res[index - 1];
    }
}
