// Power of x to n using linearsearch
import java.util.Scanner;
public class MyClass {
    static int power(int x,int n){
        int a=1;
        for(int i=1;i<=n;i++){
            a*=x;
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
