package simple;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class IsPalindrome {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String str = Integer.valueOf(x).toString();
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<chars.length; i++){
            sb.append(chars[chars.length-i-1]);
        }
        long y = Long.valueOf(sb.toString());
        if(y>2147483647){
            return false;
        }
        return x==y;
    }
}
