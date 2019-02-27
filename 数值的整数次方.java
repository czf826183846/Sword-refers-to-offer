//java中，不同类型的数进行运算时，范围小的数会自动转型为范围大的数据类型并计算，例如直接输出（1/2.0）结果为0.5，但是如果先定义一个整型变量res
//令res = 1 * 3.5，因为res本身的变量类型还是整型，所以输出res得到的结果为3
/**
 * 1.全面考察指数的正负、底数是否为零等情况。
 * 2.写出指数的二进制表达，例如13表达为二进制1101。
 * 3.举例:10^1101 = 10^0001*10^0100*10^1000。
 * 4.通过&1和>>1来逐位读取1101，为1时将该位代表的乘数累乘到最终结果。
 */
 public class Solution {
    public double Power(double base, int exponent) {
        double res = 1;
        double curr = base;
        int n;
        if(exponent > 0){
            n = exponent;
        }
        else if(exponent < 0){
            if(base == 0) throw new RuntimeException("0不能作为分母");
            n = -exponent;
        }
        else return 1;
        while(n != 0){
            if((n & 1) == 1) res *= curr;
            curr *= curr;
            n = n >> 1;
        }
        return (exponent>=0)?res:(1/res);
  }
}
