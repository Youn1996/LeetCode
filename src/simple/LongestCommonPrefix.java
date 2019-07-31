package simple;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {""};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        String temp = "";
        if(strs.length==0){
            return temp;
        }
        int minLength = strs[0].length();
        for(int i = 0; i<strs.length; i++){
            if(strs[i].length()<minLength) {
                minLength = strs[i].length();
            }
        }

        for(int i = 0; i<minLength; i++){
            temp = strs[0].substring(0,i+1);
            int count=0;
            for(int j = 1; j < strs.length; j++){
                if(strs[j].substring(0,i+1).equals(temp)){
                    count++;
                }
            }
            if(count!=strs.length-1){
                temp = strs[0].substring(0,i);
                break;
            }
        }
        return temp;
    }
}
