public class functions {
    public static int q1 (int num){
        if(num==0 || num==1 ){
          return 1;
        }
        else{
            return num*q1(num-1);
        }
    }

    public static boolean q2(String s){
        if (s.length() <= 1) {
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        return q2(s.substring(1, s.length() - 1));
    }
    public static int count_digit(int n,int digit) {
        if (n == 0) {
            return 0;
        } else {
            int last_digit = n % 10;
            int count = (last_digit == digit) ? 1 : 0;
            return count + count_digit(n / 10, digit);
        }
    }
    public static  int q4(int number){
        if (number == 1) {
            return 0;
        }
        if(number==2){
            return  1;
        }
        else{
            return q4(number-1)+(number-1);
        }
    }

    public  static  int q5(int x,int y){
        if(y==0){
            return x;
        }
        else{
            return q5(y,x%y);
        }
    }

    public static int q6(int base,int expo){
        if(expo==0){
            return 1;
        }
        else{
            return base*q6(base,expo-1);
        }
    }
    public static String q7(String s){
        if(s.isEmpty()){
            return "";
        }
        else{
            return s.charAt(s.length()-1)+q7(s.substring(0,s.length()-1));
        }
    }

    static final int MOD = 1_000_000_007;

    public static int q8(int p) {
        long maxNum = (1L << p) - 1;
        long part1 = powMod(maxNum - 1, maxNum / 2, MOD);
        long result = (part1 * maxNum) % MOD;
        return (int) result;
    }
    public static long powMod(long base, long exp, int mod) {
        if (exp == 0) {
            return 1;
        }
        long half = powMod(base, exp / 2, mod);
        long halfSquare = (half * half) % mod;
        if (exp % 2 != 0) {
            return (halfSquare * base) % mod;
        } else {
            return halfSquare;
        }
    }
}


