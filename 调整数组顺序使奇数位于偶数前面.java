/**
 * 创建一个队列用于存储偶数，建立一个奇数的索引
 * 遍历数组，若为偶数，则入队，若为奇数，当索引与当前遍历索引相同时，只加索引，不同时，则将数组索引处值置为当前
 * 遍历到的数值。
 * 最后将队列中的偶数依次出队		
 */
import java.util.Queue;
import java.util.LinkedList;
public class Solution {
    public void reOrderArray(int [] array) {
        Queue<Integer> queue = new LinkedList<Integer>();
        int index = 0;
        for(int i = 0; i < array.length; i++){
            if((array[i]&1)==0){
                queue.offer(array[i]);
                continue;
            }
            else{
                if(i == index) {
                    index++;
                    continue;
                }
                else{
                    array[index] = array[i];
                    index++;
                }
            }
        }
        for(int i = index; i < array.length; i++){
            array[i] = queue.poll();
        }
    }
}
