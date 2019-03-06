//直观解法，排序后遍历，最快排序算法快排时间复杂度为O(nlogn)
//时间复杂度为O(n)的解法，先随机选择一个数，将数组中小于它的放它前面，大于它的放它后面，并返回移动后该数索引
//此时，若索引相等，则恰好前几个数即为结果，若索引小于k，则对后面部分的数组再调用partition，反之对前面部分的数组调用。
public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        int left = 0;
        int right = input.length - 1;
        int n = partition(input,left,right);
        for(int i : input) {
        	System.out.print(i+" ");
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        while(n != k - 1){
            if(n > k - 1){
                right = n - 1;
                n = partition(input,left,right);
            }
            else{
                left = n + 1;
                n = partition(input,left,right);
            }
        }
        for(int i = 0; i < k; i++){
            res.add(input[i]);
        }
        return res;
        
    }
    
    public static int partition(int[] array, int left, int right) {
    	int pivot = array[left];
        int i = left;
        int j = right;
        while(i < j){
            while(i < j && array[j] >= pivot) j--;
            while(i < j && array[i] <= pivot) i++;
            if(i < j){
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }
        int tmp = array[left];
        array[left] = array[i];
        array[i] = tmp;
        
        return i;
    	
    	
    	
    }
