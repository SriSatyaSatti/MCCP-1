// Binarysearch on rotated sorted array
import java.util.Scanner;
public class MyClass {
    static int bsearch(int a[],int n,int k){
        int l=0,u=n-1;
        while(l<=u){
            int m=(l+u)/2;
            if(a[m]==k)
            return m;
            else if(a[l]<=a[m]){
                if(a[l]<=k && a[m]>=k)
                u=m-1;
                else
                l=m+1;
            }
            else{
                if(a[m]<=k && a[u]>=k)
                l=m+1;
                else
                u=m-1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(bsearch(a,n,k));
    }
}

