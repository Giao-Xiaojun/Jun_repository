import java.util.Scanner;

/**
 * @author xiaojun
 * @Date 2021/5/10 23:09
 * @Version 1.0
 **/
public class isPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (new Solution().isPalindrome(x)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

class Solution{
    public boolean isPalindrome(int x){
        String str = String.valueOf(x);
        if (str.equals(new StringBuilder(str).reverse().toString())){
            return true;
        }else {
            return false;
        }
    }
}
