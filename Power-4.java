//Power of x to n using binary search recursion
import java.util.Scanner;
public class MyClass {
    static int power(int x,int n,int a){
        if(n==0)
        return a;
        else{
            if(n%2==1)
            return power(x*x,n/2,a*x);
            return power(x*x,n/2,a);
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(power(x,n,1));
    }
}
