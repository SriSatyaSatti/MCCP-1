// Power of x to n using binary search iteration
import java.util.Scanner;
public class MyClass {
    static int power(int x,int n){
        int a=1;
        while(n>0){
            if(n%2==1)
            a=a*x;
            n/=2;
            x=x*x;
        }
        return a;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(power(x,n));
    }
}
