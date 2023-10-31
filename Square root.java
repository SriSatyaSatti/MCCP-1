//Square root of x using brute force
import java.util.Scanner;
public class MyClass {
    static int sqrt(int n){
        int i=1;
        while(i*i<=n){
            i++;
        }
        return i-1;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sqrt(n));
    }
}
