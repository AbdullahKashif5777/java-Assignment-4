public class Main {
    public static void main(String[] args) {
//        q1
        int result=functions.q1(5);
        System.out.println("factorial of 5:"+result);
//        q2
        String a="madaM";
        a=a.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(functions.q2(a));
//        q3
         int num=33311;
         int digi=3;
        System.out.println(functions.count_digit(num,digi));
//        q4
        int n=3;
        System.out.println(functions.q4(n));
//        q5
        int x=30,y=90;
        System.out.println(functions.q5(x,y));
//        q6
        int base=3,expo=1;
        System.out.println(functions.q6(base,expo));
//        q7
        String s="hello";
        System.out.println(functions.q7(s));
//        q8
        int p = 2;
        System.out.println(functions.q8(p));

    }
}