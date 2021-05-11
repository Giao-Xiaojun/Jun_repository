import java.util.Scanner;

/**
 * @author xiaojun
 * @Date 2021/5/9 23:29
 * @Version 1.0
 **/
public class reverse {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(new Solution().reverse(x));
    }
}

class Solution {
    public int reverse(int x) {
        long y = x;
        long res = 0;
        do {
            res = res * 10 + y % 10;
        } while ((y /= 10) != 0);
        if(res < Integer.MIN_VALUE || res > Integer.MAX_VALUE){
            return 0;
        }
        return (int)res;
    }
}