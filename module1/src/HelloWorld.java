import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {

//
//        System.out.println(fun(4));
//
//    }
//    public static int fun(int n){
//        if(n==0){
//            return 0;
//        }else if(n==1){
//            return 1;
//        }else {
//            return fun(n-1)+fun(n-2);
//        }
        Date date=new Date();
        System.out.println(date);
        Calendar cal = Calendar.getInstance();
        Date date1 = cal.getTime();
        System.out.println(date1);
    }
//
}