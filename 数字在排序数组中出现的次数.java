//看见有序，就想二分查找
//如果直接遍历一遍数组，复杂度是O(N)，采用二分查找分别得到第一个K和第二个K，复杂度为O(LOGN)

public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        int first = getFirstK(array,k,0,array.length-1);
        int last = getLastK(array,k,0,array.length-1);
        if(first == -1 || last == -1) return 0 ;
        return getLastK(array,k,0,array.length-1) - getFirstK(array,k,0,array.length-1) + 1;
    }
    
    public int getFirstK(int[] array, int k, int start, int end){
        if(start > end) return -1; //此处只能是大于不能是大于等于，start end有可能相等
        int mid = (start + end) >> 1;
        if(array[mid] > k) return getFirstK(array,k,start,mid - 1);
        else if(array[mid] < k) return getFirstK(array,k,mid + 1,end);
        else if((mid - 1 >= 0)&&(array[mid - 1] == k)) return getFirstK(array,k,start,mid - 1);//需要将mid-1>=0的条件放前面进行判断，短路与
        else return mid;
        
    }
    
    public int getLastK(int[] array, int k, int start, int end){
        int mid = (start + end) >> 1;
        while(start <= end){//此处start <= end 
            if(array[mid] > k) end = mid - 1;
            else if(array[mid] < k) start = mid + 1;
            else if((mid+1<array.length)&&(array[mid + 1]==k)) start = mid + 1;//需要将mid+1<array.length放前面进行判断，短路与
            else return mid;
            mid = (start + end) >> 1;
        }
        return -1;
    }
    
}
