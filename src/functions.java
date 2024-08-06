public class functions {
    public static int q1 (int num){
        if(num==0 || num==1 ){
          return 1;
        }
        else{
            return num*q1(num-1);
        }
    }
}
