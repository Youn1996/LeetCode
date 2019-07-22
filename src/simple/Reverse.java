package simple;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 */
public class Reverse {
    public static int reverse(int x) {
        boolean negative = false;
        if(x<0){
            negative = true;
        }
        if(x%10==0){
            x /= 10;
        }
        int length = Integer.valueOf(x).toString().getBytes().length;
        System.out.println(length);
        if(negative){
            length -= 1;
        }
        int[] temp = new int[length];
        for(int i = 0; i<temp.length; i++){
            temp[i] = x%10;
            x -= temp[i];
            x /= 10;
        }
        long y = 0;
        for(int i = 0; i<temp.length; i++){
            y += (long)Math.pow(10,i)*temp[length-i-1];
        }
        if(y>Math.pow(2,31)-1||y<-Math.pow(2,31)){
            return 0;
        }
        return (int)y;
    }
}
