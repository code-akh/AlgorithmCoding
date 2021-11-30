public class FactorialTrailingZeroes {

    public static void main(String args[]) {

        int num = 30;

        int count = 0;

        while (num > 0){
            num = num / 5;
            count = count + num;
        }
        System.out.println("Trailing 0s : " + count);
    }
}
