public class Palindrome {

    public static void main(String args[]) {

        int n = 12321;

        String str = String.valueOf(n);
        String rev = "";
        char ch[] = str.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            rev = rev + ch[i];
        }

        if (str.equals(rev)) {
            System.out.println(n + " is Palindrome");
        } else {
            System.out.println(n + " is not Palindrome");
        }


        int num = 121221;
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        StringBuilder revString = sb.reverse();
        if (sb.toString().equals(revString.toString())) {
            System.out.println(num + " is Palindrome");
        } else {
            System.out.println(num + " is not Palindrome");
        }

        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;  //   12  --  1
        }

        return x == revertedNumber || x == revertedNumber/10;
    }
}
