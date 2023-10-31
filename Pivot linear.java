// Find pivot in rotated sorted array using Linear search
import java.util.Scanner;
public class MyClass {
    static int pivot(int a[],int n){
        if(a[0]<a[n-1])
        return 0;
        for(int i=1;i<n;i++){
            if(a[i-1]>a[i])
            return i;
        }
        return 0;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(pivot(a,n));
    }
}
