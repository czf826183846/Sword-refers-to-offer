//在一个长度为n的数组里的所有数字都在0到n-1的范围内。 
//数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。
//请找出数组中任意一个重复的数字。 
//例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。

//可以通过创建一个额外空间的方式来解决
//略

//不创建额外空间的方式，因为数组中数字的范围是在0到n-1
//遍历数组时，将所遍历到的数字索引处的数字加上数组长度
//如果该数字在数组中有重复，则下次遍历到时会发现其大于数组长度，将该数字返回即可
public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(length == 0) return false;
        for(int i = 0; i < length; i++){
            int index = numbers[i];
            index = (index >= length) ? (index - length) : index;
            if(numbers[index] > length){
                duplication[0] = numbers[i] - length;
                return true;
            }
            else numbers[index] = numbers[index] + length;
        }
        return false;
    }
