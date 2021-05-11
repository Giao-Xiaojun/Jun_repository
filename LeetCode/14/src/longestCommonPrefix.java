import com.sun.javaws.Main;
import org.jetbrains.annotations.NotNull;

/**
 * @author xiaojun
 * @Date 2021/5/11 23:27
 * @Version 1.0
 **/
public class longestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = new String[]{"flowers","flower","fighrt"};
        System.out.println(new Solution().longestCommonPrefix(strs));
    }

}

class Solution{
    public String longestCommonPrefix(String @NotNull [] strs) {
        if (strs.length < 1){
            return "";
        }
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            minLen = Math.min(strs[i].length(),minLen);
        }

        String res = "";

        for (int i = 0; i < minLen; ++i){
            char temp = strs[0].charAt(i);
            for (int j = 1; j < strs.length; ++j){
                if (strs[j].charAt(i) != temp){
                    return res;
                }
            }
            res += temp;
        }
        return res;
    }
}
