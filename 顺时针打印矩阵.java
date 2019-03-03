//一圈一圈打印，打印一圈分为4步
//从左到右第一行
//从上到下第一列
//从右到左
//从下到上
//除第一步外，另外3步都需要判断是否要进行这一步。
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        if((matrix.length==1)&&(matrix[0].length==1)){
            ArrayList<Integer> res = new ArrayList<Integer>();
            res.add(matrix[0][0]);
            return res;
        } 
        if((matrix.length==0)||(matrix[0].length==0)) return null;
        int row = matrix.length;
        int column = matrix[0].length;
        int i = 0;
        ArrayList<Integer> res = new ArrayList<Integer>();
        while((row > 2*i) && (column > 2*i)) {
        	int x = i;
        	int y = i;
        	
        	while(x < column - i) {
        		res.add(matrix[y][x]);
        		if(x == column - i - 1) break;
        		x++;
        	}
        	if(row - i - 1 > y) {
        		y++;
        		while(y < row - i) {
        			res.add(matrix[y][x]);
        			if(y == row - i - 1) break;
        			y++;
        		}
        	}
        	else break;
        	if(x - i > 0) {
        		x--;
        		while(x >= i) {
        			res.add(matrix[y][x]);
        			if(x == i) break;
        			x--;
        		}
        	}
        	else break;
        	if((y - i > 1)&&(column - i)>=2) {
        		y--;
        		while(y >= i + 1) {
        			res.add(matrix[y][x]);
        			if(y == i + 1) break;
        			y--;
        		}
        	}
        	
        	i ++;
        }
        return res;
    }
}
