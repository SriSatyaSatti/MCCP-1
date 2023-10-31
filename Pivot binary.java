//Find pivot in rotated sorted array using Binary search
import java.util.Scanner;
public class MyClass {
    static int numofrotations(int a[],int n){
        int l=0,u=n-1;
        while(l<u){
            int m=(l+u)/2;
            if(a[l]<a[u])
            return l;
            else if(a[m]>=a[l] && a[m]>=a[u])
            l=m+1;
            else
            u=m;
        }
        return l;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(numofrotations(a,n));
    }
}
