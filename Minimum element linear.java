// Find minimum element in rotated sorted array using linear search
import java.util.Scanner;
public class MyClass {
    static int minele(int a[],int n){
        if(a[0]<a[n-1])
        return a[0];
        for(int i=1;i<n;i++){
            if(a[i-1]>a[i])
            return a[i];
        }
        return a[0];
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(minele(a,n));
    }
}
