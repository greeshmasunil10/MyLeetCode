package Problems;

public class PalindromeNumber {
    public PalindromeNumber(){
        // Set input
        int x = 121;
        System.out.println(isPalindrome(x));
    }
    public boolean isPalindrome(int x) {
        System.out.println("checking palidrome:"+ x);
        int x_copy = x;
        int remainder=1;
        int reverse = 0;

        while(x_copy>0){
            //129
            remainder =  x_copy % 10;//9;
            x_copy = x_copy / 10;// 12
            reverse = reverse * 10 + remainder;//9
            System.out.println("reverse:"+ reverse);
        }
        if(reverse == x)
            return true;
        return false;
    }
}
